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
		url : Utils.getRootPath() + "/logInfoController/dataList", 
		fields : [{field : 'id',title : 'ID',width : '5%',sort : true,fixed : 'left'}
                ,{field : 'userId',title : '用户id',width : '20%'}
                ,{field : 'ipAddress',title : 'ip地址',width : '20%'}
                ,{field : 'moduleType',title : '模块名称',width : '20%'}
                ,{field : 'businessTypeName',title : 'BusinessType',width : '20%'}
                ,{field : 'operation',title : '操作内容',width : '20%'}
                ,{field : 'isSuccessName',title : 'YesOrNo',width : '20%'}
                ,{field : 'requestParam',title : '请求参数',width : '20%'}
                ,{field : 'responseResult',title : '返回结果字符串',width : '20%'}
                ,{field : 'errMsg',title : '异常信息',width : '20%'}
                ,{field : 'remark',title : '备注',width : '20%'}
                ,{field : 'clientType',title : 'ClientType',width : '20%'}
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
		url : Utils.getRootPath() + "/logInfoController/goAddOrEdit"
	});
}

//编辑页面
function edit(data) {
    var id = data.id;
	Utils.createCommonWindow({
		title : '编辑信息', 
		url : Utils.getRootPath() + "/logInfoController/goAddOrEdit?id=" + id
	});
}

//查询页面
function detail(data) {
    var id = data.id;
	Utils.createWindowWithoutBtn({
		title : '查询信息', 
		url : Utils.getRootPath() + "/logInfoController/goAddOrEdit?id=" + id + "&isCheckOnly=true"
	});
}

//提交真删除
function del(data) {
    var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/logInfoController/batchDelete", {
		ids : JSON.stringify(id)
	});
}

//提交逻辑删除
function delInLogic(data) {
    var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/logInfoController/batchDeleteInLogic", {
		ids : JSON.stringify(id)
	});
}

//获取请求查询条件参数
function getRequestParam(){
	return serializeObject($("#searchForm").ajaxForm());
}