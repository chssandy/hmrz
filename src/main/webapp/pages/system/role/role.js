//@ sourceURL=role.js

var setting = {
	check: {
		enable: true
	},
	view: {
		showIcon: false
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
			})
		},
		dataType: 'json'
	},
	callback: {
		beforeClick: function(treeId, treeNode, clickFlag) {
			this.getZTreeObj(treeId).checkNode(treeNode, !treeNode.checked, true);
		}
	}
};

(function() {
	pageInit();

	$('#search-button').click(function() {
		$("#roleTables").setGridParam({
			postData: {
				role_name: $.trim($('#search_name').val())
			},
			page:1
		}).trigger("reloadGrid");
	})

	$('#del-buttion').click(function() {
		var ids = $("#roleTables").jqGrid("getGridParam", "selarrrow");
		if ($.trim(ids) != '') {
			$("#roleTables").delGridRow(ids, {
				url: SERVER_URL + '/system/role/delete?nd=' + new Date().getTime(),
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
	})

	$('#add-button').click(function() {
		dialog({
			id: 'add_dialog',
			title: '新增角色',
			content: $('#roleEdit'),
			width: 380,
			ok: false,
			onshow: function() {
				$('#doSubmit').unbind('click').bind('click').click(function() {
					addRole();
				});
			},
			onclose: function() {
				$("#doReset").click();
				this.remove();
			}
		}).showModal();
	})

	$('#edit-button').click(function() {
		edit('');
	});

	$.fn.zTree.init($("#moduleTree"), setting, null);
})($);

function pageInit() {
	$("#roleTables").jqGrid({
		url: SERVER_URL + '/system/role/list?nd=' + new Date().getTime(),
		datatype: "json",
		mtype: 'post',
		colNames: ['角色名', '添加时间', '操作', 'remark'],
		regional: 'cn',
		colModel: [{
			name: 'role_name',
			index: 'role_name',
			width: 60,
			sortable: false
		}, {
			name: 'create_time',
			index: 'create_time',
			width: 90,
			sortable: false,
			formatter: toDate
		}, {
			name: 'operator',
			width: 120,
			sortable: false,
			fixed: true,
			formatter: initOperator
		}, {
			name: 'remark',
			hidden: true
		}],
		jsonReader: {
			id: 'role_id'
		},
		rowNum: 10,
		rowList: [10, 20, 30],
		pager: '#pager',
		viewrecords: true,
		autowidth: true,
		shrinkToFit: true,
		caption: "角色列表",
		multiselect: true,
		multiboxonly: true,
		sortable: false,
		altRows: true,
		height: '100%',
		//width: '100%',
		loadComplete: function() {
			var table = this;
			setTimeout(function() {
				updatePagerIcons(table);
			}, 0);
		}
	});
	jQuery("#roleTables").jqGrid('navGrid', "#pager", {
		edit: false,
		add: false,
		del: false
	});
}

function toDate(cellvalue, options, rowObject) {
	return cellvalue.length > 19 ? cellvalue.substr(0, 19) : cellvalue;
}

function initOperator(cellvalue, options, rowObject) {
	return '<div title="编辑所选记录" style="float:left;cursor:pointer;" onclick="edit(' + rowObject.role_id + ');" class="ui-pg-div ui-inline-edit"><span class="ui-icon ui-icon-pencil"></span></div><div title="删除所选记录" onclick="del(' + rowObject.role_id + ');" style="float:left;margin-left:5px;" class="ui-pg-div ui-inline-del"><span class="ui-icon ui-icon-trash"></span></div><div title="配置菜单权限" onclick="setModule(' + rowObject.role_id + ');" style="float:left;margin-left:5px;" class="ui-pg-div ui-inline-del"><span class="ui-icon icon-wrench"></span></div>';
}

function del(id) {
	if ($.trim(id) != '') {
		$("#roleTables").delGridRow(id, {
			url: SERVER_URL + '/system/role/delete?nd=' + new Date().getTime(),
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

//角色添加
function addRole() {
	var autoVali = $('#roleForm').isValid();
	if (autoVali) {
		$("#doSubmit").attr("disabled", true);
		$("#doReset").attr("disabled", true);

		$.ajax({
			url: SERVER_URL + "/system/role/add",
			type: "POST",
			data: $('#roleForm').serializeObject(),
			success: function(msg) {
				if (msg == 2) {
					dialog({
						title: '错误',
						content: '角色名已存在！',
						ok: function() {},
						cancel: false
					}).showModal();
				} else if (msg == 0) {
					dialog({
						title: '错误',
						content: '保存角色信息出现错误，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
				} else {
					dialog({
						title: '提示',
						content: '角色新增成功的！',
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

				$("#doSubmit").attr("disabled", false);
				$("#doReset").attr("disabled", false);
			}
		});
	}
}

function edit(id) {
	if (id == undefined || id == '') {
		id = $("#roleTables").jqGrid("getGridParam", "selarrrow").toString();

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

	var row_data = $("#roleTables").jqGrid("getRowData", id);

	if (row_data != undefined && row_data != '') {
		$('#roleForm').find('#r_name').attr('value', row_data.role_name);
		$('#roleForm').find('#remark').html(row_data.remark);

		dialog({
			id: 'edit_dialog',
			title: '修改角色',
			content: $('#roleEdit'),
			width: 380,
			height: 250,
			ok: false,
			onshow: function() {
				$('#doSubmit').unbind('click').click(function() {
					editRole(id);
				});
			},
			onclose: function() {
				$('#roleForm').find('#r_name').removeAttr('value');
				$('#roleForm').find('#remark').html('');

				$("#doReset").click();
				this.remove();
			}
		}).showModal();
	}
}

function editRole(id) {
	var autoVali = $('#roleForm').isValid();
	if (autoVali) {
		$("#doSubmit").attr("disabled", true);
		$("#doReset").attr("disabled", true);

		$.post(SERVER_URL + "/system/role/modify", $.extend($('#roleForm').serializeObject(), {
				role_id: id
			}),
			function(msg) {
				if (msg == 0) {
					dialog({
						title: '提示',
						content: '角色信息修改成功！',
						ok: function() {
							dialog.get('edit_dialog').close();
							$('#search-button').click();
						},
						cancel: false
					}).showModal();
				} else if (msg == 2) {
					dialog({
						title: '错误',
						content: '角色名已存在！',
						ok: function() {},
						cancel: false
					}).showModal();
				} else {
					dialog({
						title: '错误',
						content: '角色信息修改出现错误，请重试！',
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

function setModule(id) {
	dialog({
		id: 'set_dialog',
		title: '设置菜单',
		content: $('#setModule'),
		width: 300,
		okValue: '确定',
		ok: function() {
			var m_id = '';
			var nodes = $.fn.zTree.getZTreeObj('moduleTree').getCheckedNodes(true);
			if (nodes.length > 0) {
				$.each(nodes, function(i, val) {
					if (m_id == '') {
						m_id = val.id;
					} else {
						m_id = m_id + ',' + val.id;
					}
				})
			}

			$.post(SERVER_URL + '/system/role/module/bind', {
				role_id: id,
				moudle_id: m_id
			}, function(data) {}, 'json')
		},
		onshow: function() {
			$.get(SERVER_URL + '/system/role/modules/' + id, function(ids) {
				if (ids != undefined && ids != '') {
					var id_arr = ids.split(',');
					var tree = $.fn.zTree.getZTreeObj('moduleTree');
					$.each(id_arr, function(i, val) {
						var treeNode = tree.getNodeByParam('id', val);
						tree.checkNode(treeNode, true, treeNode.level == 0 ? false : true);
					})
				}
			})
		},
		onclose: function() {
			$.fn.zTree.getZTreeObj('moduleTree').checkAllNodes(false);
		}
	}).showModal()

}