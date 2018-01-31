var selector;
$(function() {
	selector = $('#treegrid');
    
    $('#searchForm').find('select').bind("change", function(){
		loadDateGrid();
	})
	$('#searchForm').find('input').bind("input", function(){
		loadDateGrid();
	})
	//渲染搜索框
    Utils.getLocationInfoList({
    	dom : $('#rootLoc'),
    	parentId : '0'
    });
	//加载数据网格
	loadDateGrid();
})

function loadDateGrid(){
	var parentId = Utils.isEmpty($('#rootLoc').val())?null:$('#rootLoc').val();
	Utils.treegrid({
		url : Utils.getRootPath() + "/locationInfoController/getLocLayerTree",
		fields : [ [{
			field : 'parentId',
			hidden:true
		},{
			field : 'name',
			title : '名称',
			width:'40%'
		},{
			field : 'id',
			title : '编码',
			width:'40%'
		},{
			field : 'opt',
			title : '操作',
			width:'20%',
			align : "center",
			formatter : function(value, row, index) {
				var href = '';
     			if(!row || !row.id || row.isRoot == '1'){
     				return;
     			}
     			var id = row.id;
     			// 添加子字典按钮
     			href += '<a class="layui-btn layui-btn-xs" javascript=":;" onclick="add('+id+')" lay-event="edit">添加子地区</a>&nbsp';
     			// 修改按钮
     			href += '<a class="layui-btn layui-btn-xs" javascript=":;" onclick="edit('+id+')" lay-event="edit">编辑</a>&nbsp';
				// 删除按钮
				href += '<a class="layui-btn layui-btn-danger layui-btn-xs " javascript=":;" onclick="delInLogic('+id+')" lay-event="del">删除</a>';
     			return href;
			}
		} ] ],
		requestParam : {parentId:parentId}
	})
}

//新增页面
function add(parentId) {
	parentId = Utils.isEmpty(parentId)?'':parentId;
	Utils.createCommonWindow({
		title : '新增信息', 
		url : Utils.getRootPath() + "/locationInfoController/goAddOrEdit?parentId="+parentId,
		func1 : function(){
			selector.treegrid('reload');
		}
	});
}

//编辑页面
function edit(id) {
	Utils.createCommonWindow({
		title : '编辑信息', 
		url : Utils.getRootPath() + "/locationInfoController/goAddOrEdit?id=" + id,
		func1 : function(){
			selector.treegrid('reload');
		}
	});
}

//查询页面
function detail(id) {
	Utils.createWindowWithoutBtn({
		title : '查询信息', 
		url : Utils.getRootPath() + "/locationInfoController/goAddOrEdit?id=" + id + "&isCheckOnly=true"
	});
}

//提交真删除
function del(ids) {
	Utils.showConfirm('确定删除？', function(){
		Utils.commonAjaxHandler(Utils.getRootPath() + "/locationInfoController/batchDelete", {
			ids : JSON.stringify(ids)
		},{
			notReloadLayerTable : true,
			func1 : function(){
				selector.treegrid('reload');
			}
		});
	});
}

//提交逻辑删除
function delInLogic(ids) {
	Utils.showConfirm('确定删除？', function(){
		Utils.commonAjaxHandler(Utils.getRootPath() + "/locationInfoController/batchDeleteInLogic", {
			ids : JSON.stringify(ids)
		},{
			notReloadLayerTable : true,
			func1 : function(){
				selector.treegrid('reload');
			}
		});
	});
}

//获取请求查询条件参数
function getRequestParam(){
	return serializeObject($("#searchForm").ajaxForm());
}