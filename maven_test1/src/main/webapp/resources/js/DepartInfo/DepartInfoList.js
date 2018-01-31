var parentId;
$(function() {
    
    $('#searchForm').find('select').bind("change", function(){
		loadDateGrid();
	})
//	$('#searchForm').find('input').bind("input", function(){
//		loadDateGrid();
//	})
    
	//加载数据网格
	loadDateGrid();
    //联想组织机构
    Utils.departImagine({
    	dom : $('#nameDom'),
    	url : Utils.getRootPath()+"/departInfoController/totalList",
    	restrain : true,
    	onChooseFunc : function(){
    		loadDateGrid();
    	}
    })
});
var selector;
function loadDateGrid(){
	selector = $('#treegrid');
	
	Utils.treegrid({
		url : Utils.getRootPath() + "/departInfoController/getDepartLayerTree",
		fields : [ [{
			field : 'parentId',
			hidden:true
		},{
			field : 'name',
			title : '单位名称',
			width:'40%'
		},{
			field : 'level',
			title : '逻辑级次',
			width:'20%',
		},{
			field : 'locName',
			title : '所属地区',
			width:'20%',
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
     			var level = row.level;
     			// 添加子字典按钮
     			href += '<a class="layui-btn layui-btn-xs" javascript=":;" onclick="add('+id+','+level+')" lay-event="edit">添加子单位</a>&nbsp';
     			// 修改按钮
     			href += '<a class="layui-btn layui-btn-xs" javascript=":;" onclick="edit('+id+')" lay-event="edit">编辑</a>&nbsp';
				// 删除按钮
				href += '<a class="layui-btn layui-btn-danger layui-btn-xs " javascript=":;" onclick="delInLogic('+id+')" lay-event="del">删除</a>';
     			return href;
			}
		} ] ],
		onLoadSuccess: function(row){
			selector.treegrid("clearSelections");
			$(this).treegrid('enableDnd', row?row.id:null);
		},
		onDrop : function(targetRow, sourceRow, point){
			changeDepartClass({
				targetId : targetRow.id,
				targetLevel : targetRow.level,
				sourceId : sourceRow.id,
				sourceLevel : sourceRow.level
			});
		},
		requestParam : getRequestParam()
	})
}

//新增页面
function add(parentId, level) {
	parentId = Utils.isEmpty(parentId)?'':parentId;
	var url = Utils.getRootPath() + "/departInfoController/goAddOrEdit?parentId="+parentId;
	if(!Utils.isEmpty(level))
		url += "&level="+level;
	Utils.createCommonWindow({
		title : '新增信息', 
		url : url,
		func1 : function(){
			selector.treegrid('reload');
		}
	});
}

//编辑页面
function edit(id) {
	Utils.createCommonWindow({
		title : '编辑信息', 
		url : Utils.getRootPath() + "/departInfoController/goAddOrEdit?id=" + id,
		func1 : function(){
			selector.treegrid('reload');
		}
	});
}

//查询页面
function detail(id) {
	Utils.createWindowWithoutBtn({
		title : '查询信息', 
		url : Utils.getRootPath() + "/departInfoController/goAddOrEdit?id=" + id + "&isCheckOnly=true"
	});
}

//提交真删除
function del(ids) {
	Utils.showConfirm('确定删除？', function(){
		Utils.commonAjaxHandler(Utils.getRootPath() + "/departInfoController/batchDelete", {
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
		Utils.commonAjaxHandler(Utils.getRootPath() + "/departInfoController/batchDeleteInLogic", {
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

//拖拽放置之后的回调
function changeDepartClass(param){
	var targetId = param.targetId;
	var targetLevel = param.targetLevel;
	var sourceId = param.sourceId;
	var sourceLevel = param.sourceLevel;
	$.ajax({
		url:Utils.getRootPath() + "/departInfoController/changeClass",
		type:"post",
		dataType : "json",
		data:{
			targetId : targetId,
			targetLevel : targetLevel,
			sourceId : sourceId,
			sourceLevel : sourceLevel
		},
		success : function(data){
			if(data.success){
				Utils.showToastSuccess();
			}else{
				Utils.showToastFail();
			}
			setTimeout("loadDateGrid();",700);
		},
		error : function(){
			Utils.showToastFail();
			setTimeout("loadDateGrid();",700);
		}
	});
}