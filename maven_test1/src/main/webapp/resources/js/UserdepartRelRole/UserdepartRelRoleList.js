$(function() {
    
    $('#searchForm').find('select').bind("change", function(){
		loadDateGrid();
	})
	$('#searchForm').find('input').bind("input", function(){
		loadDateGrid();
	})
    
	//加载数据网格
	loadDateGrid();
})

function loadDateGrid(){
	Utils.layerDatagrid({
		//这里是datagrid参数
		url : Utils.getRootPath() + "/userdepartRelRoleController/dataList", 
		fields : [{field : 'id',title : 'ID',width : '5%',sort : true,fixed : 'left'}
                ,{field : 'userdepartId',title : '用户机构关联表主键id',width : '20%'}
                ,{field : 'roleCode',title : '角色编码',width : '20%'}
				,{fixed : 'right',width : 150,align : 'center',toolbar : '#toolbar'} // 这里的toolbar值是模板元素的选择器
				]
		,
		requestParam : getRequestParam()
	}, 
	//这里是tool工具栏方法
	{
		edit : edit, 
		del : delInLogic,
		detail : detail
	});
}

//新增页面
function add(data) {
	Utils.createCommonWindow({
		title : '新增信息', 
		url : Utils.getRootPath() + "/userdepartRelRoleController/goAddOrEdit"
	});
}

//编辑页面
function edit(data) {
	var id = data.id;
	Utils.createCommonWindow({
		title : '编辑信息', 
		url : Utils.getRootPath() + "/userdepartRelRoleController/goAddOrEdit?id=" + id
	});
}

//查询页面
function detail(data) {
	var id = data.id;
	Utils.createWindowWithoutBtn({
		title : '查询信息', 
		url : Utils.getRootPath() + "/userdepartRelRoleController/goAddOrEdit?id=" + id + "&isCheckOnly=true"
	});
}

//提交真删除
function del(data) {
	var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/userdepartRelRoleController/batchDelete", {
		ids : JSON.stringify(id)
	});
}

//提交逻辑删除
function delInLogic(data) {
	var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/userdepartRelRoleController/batchDeleteInLogic", {
		ids : JSON.stringify(id)
	});
}

//获取请求查询条件参数
function getRequestParam(){
	return serializeObject($("#searchForm").ajaxForm());
}