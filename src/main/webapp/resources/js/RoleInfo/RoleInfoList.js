$(function() {
	//加载数据网格
	loadDateGrid();
	
//	$.fn.combotree.defaults.loadFilter = $.fn.tree.defaults.loadFilter; //这里要加上，否则combotree不会生效
})

function loadDateGrid(){
	Utils.layerDatagrid({
		//这里是datagrid参数
		url : Utils.getRootPath() + "/roleInfoController/dataList", 
		fields : [{field : 'id',title : 'ID',width : '5%',sort : true,fixed : 'left'}
                ,{field : 'roleName',title : '角色名称',width : '25%'}
                ,{field : 'roleCode',title : '角色编码',width : '25%'}
                ,{field : 'roleTypeName',title : '角色类型',width : '15%'}
                ,{field : 'remark',title : '备注',width : '25%'}
				,{fixed : 'right',width : 200,align : 'center',toolbar : '#toolbar'} // 这里的toolbar值是模板元素的选择器
				]
	}, 
	//这里是tool工具栏方法
	{
		edit : edit, 
		del : delInLogic,
		detail : detail
	},{
		func1 : showRightMenus
	});
}

//加载菜单
function showRightMenus(data) {
	var id = data.id;
	$('#menuRoleId').val(id);
	showMenus(id);
	$('#menusWindow').removeClass('displaynone');
	$('#roleWindow').addClass('width80');
}

//新增页面
function add(data) {
	Utils.createCommonWindow({
		title : '新增信息', 
		url : Utils.getRootPath() + "/roleInfoController/goAddOrEdit"
	});
}

//编辑页面
function edit(data) {
	var id = data.id;
	Utils.createCommonWindow({
		title : '编辑信息', 
		url : Utils.getRootPath() + "/roleInfoController/goAddOrEdit?id=" + id
	});
}

//查询页面
function detail(data) {
	var id = data.id;
	Utils.createWindowWithoutBtn({
		title : '查询信息', 
		url : Utils.getRootPath() + "/roleInfoController/goAddOrEdit?id=" + id + "&isCheckOnly=true"
	});
}

//提交真删除
function del(data) {
	var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/roleInfoController/batchDelete", {
		ids : JSON.stringify(id)
	});
}

//提交逻辑删除
function delInLogic(data) {
	var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/roleInfoController/batchDeleteInLogic", {
		ids : JSON.stringify(id)
	});
}

function showMenus(roleId){
	$("#menus").tree({
		url: Utils.getRootPath() + "/roleRelMenuController/getMenuListDataByRole?roleId="+roleId,
    	method:'post',
    	checkbox:true,
    	width:227,
    	height:32,
    	idField:'id',
		textField:'name'
	});
}

//异步提交角色菜单绑定请求
function submitSaveRoleRelMenus(thiz){
	var form = $('#menusForm');
	var loading = Utils.loading();
	//获取勾选的菜单
	
	var checkedNodes = $("#menus").tree('getChecked');
	var checkedIds = [];
	if(checkedNodes){
		$.each(checkedNodes, function(index) {
			var node = $(this)[0];
			if(node && node.id){
				checkedIds.push(node.id);
			}
		});
	}
	var parentCheckedNodes = $('#menus').tree('getChecked','indeterminate');  
	var parentCheckedIds = [];
	if(parentCheckedNodes){
		$.each(parentCheckedNodes, function(index) {
			var node = $(this)[0];
			if(node && node.id){
				parentCheckedIds.push(node.id);
			}
		});
	}
	var newArray = checkedIds.concat(parentCheckedIds);
	
	form.ajaxSubmit({
		type: "POST",
		url:form.attr('action'),
		dataType: "json",
		data : {roleId:$('#menuRoleId').val(), menuIds:newArray.join(",")},
	    success: function(result){
    	  if(result.success){
    		  Utils.showToastSuccess(result.msg);
    		  Utils.closeLayerWindow(loading);//如果设定了yes回调，需进行手工关闭
		  }else{
			  closeLayerWindow(loading);
			  Utils.showToastFail(result.msg);
		  }
		},
		error: function(result){
			closeLayerWindow(loading);
			Utils.showToastFail(loadErrorMsg);
		}
	});
}

//关闭菜单权限右侧窗口
function hideMenuWindow(){
	$('#menusWindow').addClass('displaynone');
	$('#roleWindow').removeClass('width80');
}