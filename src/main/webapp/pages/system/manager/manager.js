//@ sourceURL=manager.js

(function() {
	pageInit();

	$('#search-button').click(function() {
		$("#managerTables").setGridParam({
			postData: {
				name: $.trim($('#name').val()),
			},
			page:1
		}).trigger("reloadGrid");
	})

	$('#del-buttion').click(function() {
		var ids = $("#managerTables").jqGrid("getGridParam", "selarrrow");
		if ($.trim(ids) != '') {
			$("#managerTables").delGridRow(ids, {
				url: SERVER_URL + '/system/manager/delManager?nd=' + new Date().getTime(),
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
			title: '新增系統用户',
			content: $('#managerAdd'),
			width: 380,
			//height: 450,
			ok: false,
			onshow: function() {
				$('#managerSubmit').unbind('click').bind('click').click(function() {
					addManager();
				});
			},
			onclose: function() {
				$("#managerReset").click();
				//this.remove();
			}
		}).showModal();
	})

	$('#edit-button').click(function() {
		edit('');
	})

	$('#managerForm').validator({
		fields: {
			'manager_name': 'required;username;remote[' + SERVER_URL + '/system/manager/IsUniqueManager, manager_name]'
		}
	})

	//获取所有角色
	$.get(SERVER_URL + '/system/role/list?nd=' + new Date().getTime(), {
		rows: 1,
		page: 0,
		havePage:0
	}, function(data) {
		$.each(data.rows, function(i, val) {
			$('#role_check').append('<span style="padding-right: 5px;"><input name="roles" type="checkbox" value="' + val.role_id + '"/>' + val.role_name + '</span>');
		})
	})
})($);

function pageInit() {
	$("#managerTables").jqGrid({
		url: SERVER_URL + '/system/manager/getManagerList?nd=' + new Date().getTime(),
		datatype: "json",
		mtype: 'post',
		colNames: ['用户名', '真实姓名', '手机号', '邮箱', '添加时间', '操作'],
		regional: 'cn',
		colModel: [{
			name: 'manager_name',
			index: 'manager_name',
			width: 75,
			sortable: false
		}, {
			name: 'real_name',
			index: 'real_name',
			width: 90,
			sortable: false
		}, {
			name: 'moble',
			index: 'moble',
			width: 85,
			sortable: false
		}, {
			name: 'email',
			index: 'email',
			width: 75,
			sortable: false
		}, {
			name: 'create_time',
			index: 'create_time',
			width: 90,
			sortable: false
		}, {
			name: 'manager_id',
			index:'manager_id',
			width: 120,
			sortable: false,
			fixed: true,
			formatter: initOperator
		}],
		jsonReader:{
            id: "manager_id",//设置返回参数中，表格ID的名字为manager_id
            repeatitems : false
        },
		rowNum: 10,
		rowList: [10, 20, 30],
		pager: '#pager',
		viewrecords: true,
		autowidth: true,
		shrinkToFit: true,
		caption: "系统用户列表",
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
		}
	});
	jQuery("#managerTables").jqGrid('navGrid', "#pager", {
		edit: false,
		add: false,
		del: false
	});
}

function initOperator(cellvalue, options, rowObject) {
	var op = '<div title="编辑所选记录" style="float:left;cursor:pointer;" onclick="edit(' + cellvalue + ');" class="ui-pg-div ui-inline-edit"><span class="ui-icon ui-icon-pencil"></span></div>' + '<div title="删除所选记录" onclick="del(' + cellvalue + ');" style="float:left;margin-left:5px;" class="ui-pg-div ui-inline-del"><span class="ui-icon ui-icon-trash"></span></div>' + '<div title="修改密码" onclick="modifyPass(' + cellvalue + ');" style="float:left;margin-left:5px;" class="ui-pg-div ui-inline-del"><span class="ui-icon icon-key"></span></div>';
	return op;
}

function modifyPass(id) {
	dialog({
		id: 'modify_pass',
		title: '修改密码',
		content: $('#password_modify_div'),
		width: 380,
		okValue: '确定',
		ok: function() {
			$.post(SERVER_URL + '/system/manager/modifyPassword', {
				manager_id: id,
				password: $('#password_modify').val()
			}, function(msg) {
				if (msg == 0) {
					dialog({
						title: '提示',
						content: '密码修改成功！',
						okValue: '确定',
						ok: function() {}
					}).showModal();
				} else {
					dialog({
						title: '提示',
						content: '密码修改失败！',
						okValue: '确定',
						ok: function() {}
					}).showModal();
				}
			})
		},
		onclose: function() {
			$('#pass_modify_form').find('input').val('');
			$('#pass_modify_form').validator('cleanUp');
		}
	}).showModal();
}


function del(id) {
	if ($.trim(id) != '') {
		$("#managerTables").delGridRow(id, {
			url: SERVER_URL + '/system/manager/delManager?nd=' + new Date().getTime(),
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

//系統用戶添加
function addManager() {
	var autoVali = $('#managerForm').isValid();
	if (autoVali) {
		$("#managerSubmit").attr("disabled", true);
		$("#managerReset").attr("disabled", true);

		$.ajax({
			url: SERVER_URL + "/system/manager/addManager",
			type: "POST",
			data: {
				manager_name: $('#manager_name').val(),
				email: $('#email').val(),
				moble: $('#moble').val(),
				real_name: $('#real_name').val(),
				remark: $('#remark').val(),
				password: $('#password').val(),
				roles: function() {
					var str = '';
					$(':input[name="roles"]:checked').each(function(i, val) {
						if (i == 0) {
							str = val.value;
						} else {
							str += ',' + val.value;
						}
					})
					return str;
				}
			},
			success: function(msg) {
				if (msg == 2) {
					$('managerForm').validator('showMsg', '#manager_name', {
						type: "error",
						msg: "用户名已存在"
					});
				} else if (msg == 1) {
					dialog({
						title: '错误',
						content: '保存用户信息出现错误，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
				} else {
					dialog({
						title: '提示',
						content: '系统用户新增成功！',
						button: [{
							value: '继续添加',
							callback: function() {
								$("#managerReset").click();
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

				$("#managerSubmit").attr("disabled", false);
				$("#managerReset").attr("disabled", false);
			}
		});
	}
}

function edit(id) {
	if (id == undefined || id == '') {
		id = $("#managerTables").jqGrid("getGridParam", "selarrrow").toString();
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
	$.getJSON(SERVER_URL + '/system/manager/getManager/' + id, function(data) {
		if (data != undefined && data != '') {
			$('#manager_name').attr('value', data.manager_name).attr('readonly', true).attr('novalidate', 'novalidate');
			$('#moble').attr('value', data.moble);
			$('#real_name').attr('value', data.real_name);
			$('#email').attr('value', data.email);
			$('#remark').html(data.remark);
			$('#password').attr('novalidate', 'novalidate').parents('.form-group').hide();
			$('#password_check').attr('novalidate', 'novalidate').parents('.form-group').hide();
			if (data.roles != undefined && data.roles != '') {
				var role_arr = data.roles.split(',');
				$.each(role_arr, function(i, val) {
					$(':input[name="roles"][value="' + val + '"]').prop('checked', true);
				})
			}

			dialog({
				id: 'edit_dialog',
				title: '修改系統用户',
				content: $('#managerAdd'),
				width: 380,
				//height: 370,
				ok: false,
				onshow: function() {
					$('#managerSubmit').unbind('click').bind('click', function() {
						editManager(id);
					})
				},
				onclose: function() {
					$('#manager_name').removeAttr('value').removeAttr('readonly').removeAttr('novalidate');
					$('#moble').removeAttr('value');
					$('#real_name').removeAttr('value');
					$('#email').removeAttr('value');
					$('#remark').html('');
					$('#password').removeAttr('novalidate').parents('.form-group').show();
					$('#password_check').removeAttr('novalidate').parents('.form-group').show();
					$(':input[name="roles"]').removeAttr('checked');
					$("#managerReset").click();

					this.remove();
				}
			}).showModal();
		}
	});
}

function editManager(id) {
	var autoVali = $('#managerForm').isValid();
	if (autoVali) {
		$("#managerSubmit").attr("disabled", true);
		$("#managerReset").attr("disabled", true);

		$.post(SERVER_URL + "/system/manager/modifyManager", {
				manager_id: id,
				manager_name: $('#manager_name').val(),
				email: $('#email').val(),
				moble: $('#moble').val(),
				remark: $('#remark').val(),
				real_name: $('#real_name').val(),
				roles: function() {
					var str = '';
					$(':input[name="roles"]:checked').each(function(i, val) {
						if (i == 0) {
							str = val.value;
						} else {
							str += ',' + val.value;
						}
					})
					return str;
				}
			},
			function(msg) {
				if (msg == 0) {
					dialog({
						title: '提示',
						content: '系统用户信息修改成功！',
						ok: function() {
							$('#search-button').click();
							dialog.get('edit_dialog').close();
							return true;
						},
						cancel: false
					}).showModal();
				} else {
					dialog({
						title: '错误',
						content: '系统用户信息修改出现错误，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
				}
			}
		);

		$("#managerSubmit").attr("disabled", false);
		$("#managerReset").attr("disabled", false);
	}
}