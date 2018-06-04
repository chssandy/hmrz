//@ sourceURL=module.js

(function() {
	pageInit();

	$('#search-button').click(function() {
		$("#moduleTables").setGridParam({
			postData: {
				pattern: $.trim($('#pattern').val())
			},
			page:1
		}).trigger("reloadGrid");
	});

	$('#add-button').click(function() {
		dialog({
			id: 'add_dialog',
			title: '新增菜单',
			content: $('#moduleEdit'),
			width: 380,
			ok: false,
			onshow: function() {
				//getRoot();
				$('#doSubmit').unbind('click').click(function() {
					addModule();
				});
			},
			onclose: function() {
				$("#doReset").click();
			}
		}).showModal();
	});

	$('#del-buttion').click(function() {
		var ids = $("#moduleTables").jqGrid("getGridParam", "selarrrow");
		if ($.trim(ids) != '') {
			$("#moduleTables").delGridRow(ids, {
				url: SERVER_URL + '/system/module/delModule?nd=' + new Date().getTime(),
				mtype: 'GET',
				reloadAfterSubmit: true,
				drag: false,
				width: 240,
				height: 145,
				top: ($(window).height() - 145) / 2,
				left: ($(window).width() - 240) / 2,
			});
		} else {
			dialog({
				title: '错误',
				content: '请选择一条需要删除的数据！',
				ok: function() {},
				cancel: false
			}).showModal();
		}
	});

	$('#edit-button').click(function() {
		edit('');
	});

	$('#order-button').click(function() {
		dialog({
			id: 'set_dialog',
			title: '菜单排序',
			content: $('#orderModule'),
			width: 300,
			okValue: '确定',
			ok: function() {
				var node_arr = new Array();
				var tree = $.fn.zTree.getZTreeObj('moduleTree');
				var root = tree.getNodesByFilter(function(node) {
					return node.level == 0;
				});

				$.each(root, function(i, node) {
					var n = {
						'module_id': node.id,
						'sort_level': tree.getNodeIndex(node) + 1
					};
					node_arr.push(n);
				});

				var children = tree.getNodesByFilter(function(node) {
					return node.level == 1;
				});

				$.each(children, function(i, node) {
					var parent_index = tree.getNodeIndex(tree.getNodeByTId(node.parentTId)) + 1;
					var n = {
						'module_id': node.id,
						'sort_level': (parent_index > 10 ? parent_index * 100 : parent_index * 1000) + tree.getNodeIndex(node)
					};
					node_arr.push(n);
				});

				$.post(SERVER_URL + '/system/module/setModuleIndex', {
					'str': $.toJSON(node_arr)
				});
			}
		}).showModal();
	});

	$.get(SERVER_URL + '/system/module/getModuleList?nd=' + new Date().getTime(), {
		onlyRoot: true,
		havePage: 0,
	}, function(data) {
		$.each(data.rows, function(i, val) {
			$('#father_id').append('<option value="' + val.module_id + '">' + val.module_name + '</option>');
		});
	});

	$.fn.zTree.init($("#moduleTree"), {
		view: {
			showIcon: false
		},
		edit: {
			enable: true,
			showRemoveBtn: false,
			showRenameBtn: false,
			drag: {
				autoExpandTrigger: true,
				prev: function(treeId, nodes, targetNode) {
					if (targetNode.level == 0) {
						var _return = true;
						$.each(nodes, function(i, node) {
							if (node.level == 1) {
								_return = false;
								return false;
							}
						});
						return _return;
					} else {
						var _return = true;
						$.each(nodes, function(i, node) {
							if (node.level == 0) {
								_return = false;
								return false;
							}
						});
						return _return;
					}
				},
				inner: function(treeId, nodes, targetNode) {
					if (targetNode.level == 0) {
						var _return = true;
						$.each(nodes, function(i, node) {
							if (node.level == 0) {
								_return = false;
								return false;
							}
						});
						return _return;
					} else {
						return false;
					}
				},
				next: function(treeId, nodes, targetNode) {
					if (targetNode.level == 0) {
						var _return = true;
						$.each(nodes, function(i, node) {
							if (node.level == 1) {
								_return = false;
								return false;
							}
						});
						return _return;
					} else {
						var _return = true;
						$.each(nodes, function(i, node) {
							if (node.level == 0) {
								_return = false;
								return false;
							}
						});
						return _return;
					}
				}
			}
		},
		async: {
			enable: true,
			url: SERVER_URL + '/system/module/getModuleTree?nd=' + new Date().getTime(),
			dataFilter: function(treeId, parentNode, responseData) {
				var tree = $.fn.zTree.getZTreeObj(treeId);
				$.each(responseData.root, function(i, val) {
					tree.addNodes(null, {
						id: val.module_id,
						name: val.module_name
					});
				});

				$.each(responseData.children, function(i, val) {
					var father = tree.getNodeByParam('id', val.father_id);
					tree.addNodes(father, {
						id: val.module_id,
						name: val.module_name
					});
				});
			},
			dataType: 'json'
		},
		callback: {
			beforeClick: function(treeId, treeNode, clickFlag) {
				this.getZTreeObj(treeId).checkNode(treeNode, !treeNode.checked, true);
			},
			beforeDrag: function(treeId, treeNodes) {
				return true;
			},
		}
	}, null);
})($);

function pageInit() {
	$("#moduleTables").jqGrid({
		url: SERVER_URL + '/system/module/getModuleList?nd=' + new Date().getTime(),
		datatype: "json",
		mtype: 'post',
		postData: {
			IsIncludeRoot: false
		},
		colNames: ['菜单名', '上级菜单', '菜单url', '访问命名空间', '添加时间', '操作'],
		regional: 'cn',
		colModel: [{
			name: 'module_name',
			index: 'module_name',
			width: 60,
			sortable: false
		}, {
			name: 'fatherName',
			index: 'fatherName',
			width: 90,
			sortable: false
		}, {
			name: 'module_url',
			index: 'module_url',
			width: 90,
			sortable: false
		}, {
			name: 'namespace',
			index: 'namespace',
			width: 90,
			sortable: false
		}, {
			name: 'create_time',
			index: 'create_time',
			width: 90,
			sortable: false
		}, {
			name: 'module_id',
			index: 'module_id',
			width: 120,
			sortable: false,
			fixed: true,
			formatter: initOperator
		}],
		jsonReader:{
            id: "module_id",//设置返回参数中，表格ID的名字为module_id
            repeatitems : false
        },
		rowNum: 10,
		rowList: [10, 20, 30],
		pager: '#pager',
		viewrecords: true,
		autowidth: true,
		shrinkToFit: true,
		caption: "菜单列表",
		multiselect: true,
		multiboxonly: true,
		sortable: false,
		altRows: true,
		height: '100%',
		loadComplete: function() {
			var table = this;
			setTimeout(function() {
				updatePagerIcons(table);
			}, 0);
		},
	});

	jQuery("#moduleTables").jqGrid('navGrid', "#pager", {
		edit: false,
		add: false,
		del: false
	});
}

function initOperator(cellvalue, options, rowObject) {
	return '<div title="编辑所选记录" style="float:left;cursor:pointer;" onclick="edit(' + cellvalue + ');" class="ui-pg-div ui-inline-edit"><span class="ui-icon ui-icon-pencil"></span></div><div title="删除所选记录" onclick="del(' + cellvalue + ');" style="float:left;margin-left:5px;" class="ui-pg-div ui-inline-del" id="jDeleteButton_5"><span class="ui-icon ui-icon-trash"></span></div>';
}

function del(id) {
	//var ids = $("#usrTables").jqGrid("getGridParam", "selarrrow");
	if ($.trim(id) != '') {
		$("#moduleTables").delGridRow(id, {
			url: SERVER_URL + '/system/module/delModule?nd=' + new Date().getTime(),
			mtype: 'GET',
			reloadAfterSubmit: true,
			drag: false,
			width: 240,
			height: 145,
			top: ($(window).height() - 145) / 2,
			left: ($(window).width() - 240) / 2,
		});
	}
}

function addModule() {
	var autoVali = $('#moduleForm').isValid();
	if (autoVali) {
		$("#doSubmit").attr("disabled", true);
		$("#doReset").attr("disabled", true);

		$.post(SERVER_URL + "/system/module/addModule", $('#moduleForm').serializeObject(), function(msg) {
			if (msg == 1) {
				dialog({
					title: '错误',
					content: '保存菜单信息出现错误，请重试！',
					ok: function() {},
					cancel: false
				}).showModal();
			} else {
				dialog({
					title: '提示',
					content: '菜单新增成功的！',
					button: [{
						value: '继续添加',
						callback: function() {
							$("#doReset").click();
							return true;
						},
						autofocus: true
					}, {
						value: '返回列表',
						callback: function() {
							dialog.get('add_dialog').close();
							$('#search-button').click();
							return true;
						}
					}, ]
				}).showModal();
			}
		}, 'json');
	}

	$("#doSubmit").attr("disabled", false);
	$("#doReset").attr("disabled", false);
}

function edit(id) {
	if (id == undefined || id == '') {
		
		id = $("#moduleTables").jqGrid("getGridParam", "selarrrow").toString();
		if (id.indexOf(',') > 0) {
			dialog({
				title: '错误',
				content: '一次只可以编辑一条数据！',
				ok: function() {},
				cancel: false
			}).showModal();
			return false;
		}
	}

	if ($.trim(id) == '') {
		dialog({
			title: '错误',
			content: '请选择一条需要编辑的数据！',
			ok: function() {},
			cancel: false
		}).showModal();
		return false;
	}
	
	$.getJSON(SERVER_URL + '/system/module/getModule/' + id, function(data) {
		if (data != undefined && data != '') {
			$('#module_name').attr('value', data.module_name);
			$('#module_url').attr('value', data.module_url);
			$('#namespace').attr('value', data.namespace);
			$('#father_id > option[value="' + data.father_id + '"]').prop('selected', true);
			$('#icon').attr('value', data.icon);
			$('#remark').html(data.remark);

			dialog({
				id: 'edit_dialog',
				title: '修改菜单',
				content: $('#moduleEdit'),
				width: 380,
				ok: false,
				onshow: function() {
					$('#doSubmit').unbind('click').click(function() {
						editModule(id);
					});
				},
				onclose: function() {
					
					$('#module_name').removeAttr('value');
					$('#module_url').removeAttr('value');
					$('#namespace').removeAttr('value');
					$('#father_id > option[value="' + data.father_id + '"]').removeAttr('selected');
					$('#icon').removeAttr('value');
					$('#remark').html('');
					$('#doReset').click();
					this.remove();
				}
			}).showModal();
		}
	});
}

function editModule(id) {
	var autoVali = $('#moduleForm').isValid();
	if (autoVali) {
		$("#doSubmit").attr("disabled", true);
		$("#doReset").attr("disabled", true);

		$.post(SERVER_URL + "/system/module/modifyModule", $.extend($('#moduleForm').serializeObject(), {
				module_id: id
			}),
			function(msg) {
				if (msg == 0) {
					dialog({
						title: '提示',
						content: '菜单信息修改成功！',
						ok: function() {
							dialog.get('edit_dialog').close();
							$('#search-button').click();
						},
						cancel: false
					}).showModal();
				} else {
					dialog({
						title: '错误',
						content: '菜单信息修改出现错误，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
				}
			}
		);

		$("#doSubmit").attr("disabled", false);
		$("#doReset").attr("disabled", false);
	}
}