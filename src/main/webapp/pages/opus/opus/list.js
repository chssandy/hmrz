//@ sourceURL=brand.js

(function() {
	pageInit();
	$('#search-button').click(function() {
		$("#tables").setGridParam({
			postData: {
				designer_name_search: $.trim($('#designer_name_search').val())
			},
			page:1
		}).trigger("reloadGrid");
	})

	$('#del-buttion').click(function() {
		var ids = $("#tables").jqGrid("getGridParam", "selarrrow");
		if ($.trim(ids) != '') {
			$("#tables").delGridRow(ids, {
				url: SERVER_URL + '/opus/designer/del?nd=' + new Date().getTime(),
				mtype: 'GET',
				reloadAfterSubmit: true,
				drag: false,
				width: 240,
				height: 145,
				top: ($(window).height() - 145) / 2,
				left: ($(window).width() - 240) / 2
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
			title: '新增设计师',
			content: $('#addDesigner'),
			width: 380,
			height: 450,
			ok: false,
			onshow: function() {
				$('#designerSubmit').unbind("click").click(function(e) {
                    $(this).prop("disabled",true);
                    e&&e.preventDefault();
					add();
				});
			},
			onclose: function() {
				$("#designerReset").click();
				this.remove();
			}
		}).showModal();
	})
	
	
	$('#edit-button').click(function() {
		edit('');
	})

	$('#designerForm').validator({
		fields: {
			'designer_name': 'required;'
		}
	})
	
})($);

function pageInit() {
	$("#tables").jqGrid({
		url: SERVER_URL + '/opus/designer/getList?nd=' + new Date().getTime(),
		datatype: "json",
		postData: {
			designer_name_search: $.trim($('#designer_name_search').val())
		},
		mtype: 'post',
		colNames: ['设计师','照片', '添加时间', '操作'],
		regional: 'cn',
		colModel: [{
			name: 'designer_name',
			index: 'designer_name',
			width: 60,
			sortable: false
		}, {
			name: 'photo',
			index: 'photo',
			width: 90,
			sortable: false
		},{
			name: 'create_time',
			index: 'create_time',
			width: 90,
			sortable: false,
			formatter: formatTime
		}, {
			name: 'category_id',
			width: 120,
			sortable: false,
			fixed: true,
			formatter: initOperator
		}],
		jsonReader:{
			id:'category_id'
		},
		rowNum: 10,
		rowList: [10, 20, 30],
		pager: '#pager',
		viewrecords: true,
		autowidth: true,
		shrinkToFit: true,
		caption: "设计师列表",
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
	jQuery("#tables").jqGrid('navGrid', "#pager", {
		edit: false,
		add: false,
		del: false
	});
}

function formatTime(cellvalue, options, rowObject) {
	if (cellvalue != '' && cellvalue != undefined) {
		return cellvalue.substr(0, 16);
	} else {
		return '';
	}
}

function initOperator(cellvalue, options, rowObject) {
	return '<div title="编辑所选记录" style="float:left;cursor:pointer;" onclick="edit(' + cellvalue + ');" class="ui-pg-div ui-inline-edit"><span class="ui-icon ui-icon-pencil"></span></div>' + '<div title="删除所选记录" onclick="del(' + cellvalue + ');" style="float:left;margin-left:5px;" class="ui-pg-div ui-inline-del" id="jDeleteButton_5"><span class="ui-icon ui-icon-trash"></span></div>';
}

function del(id) {
	if ($.trim(id) != '') {
		$("#tables").delGridRow(id, {
			url: SERVER_URL + '/opus/designer/del?nd=' + new Date().getTime(),
			mtype: 'GET',
			reloadAfterSubmit: true,
			drag: false,
			width: 240,
			height: 145,
			top: ($(window).height() - 145) / 2,
			left: ($(window).width() - 240) / 2
		});
	}
}

//信息添加
function add() {
	var autoVali = $('#categoryForm').isValid();
	if (autoVali) {
		$.ajax({
			url: SERVER_URL + "/product/category/add",
			type: "POST",
			data: $('#categoryForm').serializeObject(),
			success: function(result) {
				if (result.result == 'success') {
					dialog({
						title: '提示',
						content: '产品类别添加成功！',
						button: [{
							value: '继续添加',
							callback: function() {
								$("#categoryReset").click();
								$('#search-button').click();
                                $("#categorySubmit,#categoryReset").prop("disabled", false);
								return true;
							},
							autofocus: true
						}, {
							value: '返回列表',
							callback: function() {
								dialog.get('add_dialog').close();
                                $("#categorySubmit,#categoryReset").prop("disabled", false);
								$('#search-button').click();
								return true;
							}
						}]
					}).showModal();
				} else if(result.result == 'fail'){
					dialog({
						title: '错误',
						content: '保存产品类别出现错误，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
					$("#categorySubmit,#categoryReset").prop("disabled", false);
				} else if(result.result == 'exist'){
					dialog({
						title: '错误',
						content: '已存在此产品类别，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
					$("#categorySubmit,#categoryReset").prop("disabled", false);
				}
			}
		});
	}else{
        $("#categorySubmit,#categoryReset").prop("disabled", false);
    }

}

function edit(id) {
	if (id == undefined || id == '') {
		id = $("#tables").jqGrid("getGridParam", "selarrrow").toString();
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
	$.getJSON(SERVER_URL + '/product/category/get/' + id, function(data) {
		if (data != undefined && data != '') {
			$('#category_name').attr('value', data.category_name);

			dialog({
				id: 'edit_dialog',
				title: '修改产品类别',
				content: $('#addCategory'),
				width: 380,
				//height: 370,
				ok: false,
				onshow: function() {
					$('#categorySubmit').unbind('click').bind('click', function() {
						editBrand(id);
					})
				},
				onclose: function() {
					$('#category_name').removeAttr('value').removeAttr('readonly').removeAttr('novalidate');
					$("#categoryReset").click();
					this.remove();
				}
			}).showModal();
		}
	});
}

function editBrand(id) {
	var autoVali = $('#categoryForm').isValid();
	if (autoVali) {
		$("#categorySubmit").attr("disabled", true);
		$("#categoryReset").attr("disabled", true);

		$.post(SERVER_URL + "/product/category/modify", {
				category_id: id,
				category_name: $('#category_name').val()
			},
			function(msg) {
				if (msg == 0) {
					dialog({
						title: '提示',
						content: '产品类别信息修改成功！',
						ok: function() {
							$('#search-button').click();
							dialog.get('edit_dialog').close();
							return true;
						},
						cancel: false
					}).showModal();
				} else if(msg == 1){
					dialog({
						title: '错误',
						content: '产品类别修改出现错误，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
				} else if(msg ==2){
					dialog({
						title: '错误',
						content: '此产品类别已存在，请重试！',
						ok: function() {},
						cancel: false
					}).showModal();
					$("#brandReset").click();
				}
			}
		);
		$("#categorySubmit").attr("disabled", false);
		$("#categoryReset").attr("disabled", false);
	}
}
