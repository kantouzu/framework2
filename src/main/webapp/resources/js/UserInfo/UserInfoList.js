var selectUserId;
$(function() {
	
	$('#searchForm').find('select').bind("change", function(){
		loadDateGrid();
	})
	$('#searchForm').find('input[name="userName"]').bind("input", function(){
		loadDateGrid();
	})
	
	//加载数据网格
	loadDateGrid();
	//联想组织机构(tool搜索)
    Utils.departImagine({
    	dom : $('#departSelector'),
    	url : Utils.getRootPath()+"/departInfoController/totalList",
    	restrain : true,
    	searchName : 'departId',
    	onChooseFunc : function(){
    		loadDateGrid();
    	}
    })
	//联想组织机构(业务型角色搜索)
    Utils.departImagine({
    	dom : $('#departSearch'),
    	url : Utils.getRootPath()+"/departInfoController/totalList",
    	restrain : true
    })
})

function loadDateGrid(){
	Utils.layerDatagrid({
		//这里是datagrid参数
		url : Utils.getRootPath() + "/userInfoController/dataList", 
		fields : [{field : 'id',title : 'ID',width : '5%',sort : true,fixed : 'left'}
				,{field : 'userName',title : '用户名',width : '10%'}
				,{field : 'name',title : '姓名',width : '10%',sort : true}
				,{field : 'departNames',title : '所属单位',width : '23%',sort : true}
				,{field : 'roleNames',title : '角色',width : '23%',sort : true}
				,{field : 'phone',title : '手机号',width : '12%'}
				,{field : 'email',title : '邮箱',width : '20%'}
				,{field : 'usableName',title : '是否可用',width : '20%'}
				,{fixed : 'right',width : 200,align : 'center',toolbar : '#toolbar'} // 这里的toolbar值是模板元素的选择器
				]
		,
		requestParam : getRequestParam()
	}, 
	//这里是tool工具栏方法
	{
		edit : edit, 
		del : delInLogic,
		detail : detail
	}, 
	//这里是tool工具栏其它附加方法
	{
		func1 : showRights
	});
}

//加载角色
function showRights(data) {
	var id = data.id;
	var userName = data.userName;
	var name = data.name;
	selectUserId = id;
	$('#roleUserId').val(id);
	if(isSuperAdmin){
		//加载非业务角色
		loadRoles({
			dom : $('#roles'), 
			url : Utils.getRootPath()+"/userRelRoleController/loadUserRoles",
			data : {userId:id}
		})
		//加载关联组织机构
		loadDeparts($('#depart_grid'), id);
		$('#notBusinessDiv').removeClass('displaynone');
		$('#businessDiv').removeClass('displaynone');
	}else{
		if(hasBusinessRole){
			//加载关联组织机构
			loadDeparts($('#depart_grid'), id);
			$('#notBusinessDiv').addClass('displaynone');
			$('#businessDiv').removeClass('displaynone');
		}
	}
	//清空业务角色列表
	$('#business_roles_div').addClass('displaynone');
	$('#rolesWindow').removeClass('displaynone');
	$('#userWindow').addClass('width50');
	$('#role_user_show').html(userName+"("+name+")");
}

//新增页面
function add(data) {
	Utils.createCommonWindow({
		title : '新增用户', 
		url : Utils.getRootPath() + "/userInfoController/goAddOrEdit"
	});
}

//编辑页面
function edit(data) {
	var id = data.id;
	Utils.createCommonWindow({
		title : '编辑用户', 
		url : Utils.getRootPath() + "/userInfoController/goAddOrEdit?id=" + id
	});
}

//查询页面
function detail(data) {
	var id = data.id;
	Utils.createWindowWithoutBtn({
		title : '用户查询', 
		url : Utils.getRootPath() + "/userInfoController/goAddOrEdit?id=" + id + "&isCheckOnly=true"
	});
}

//提交真删除
function del(data) {
	var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/userInfoController/batchDelete", {
		ids : JSON.stringify(id)
	});
}

//提交逻辑删除
function delInLogic(data) {
	var id = data.id;
	Utils.commonAjaxHandler(Utils.getRootPath() + "/userInfoController/batchDeleteInLogic", {
		ids : JSON.stringify(id)
	});
}

//渲染角色关联信息
function loadRoles(param){
	var selector = param.dom;
	var url = param.url;
	var data = param.data;
	var checkboxAlias = param.checkboxAlias;
	$.ajax({
		url:url,
		type:"post",
		dataType : "json",
		data:data,
		async:false,
		success : function(data){
			if(data.success){
				selector.empty();
				/*selector.append(
					//如果不选的话，狗日的参数为空，会报400，先暂时放一个防止空参数
					'<input type="hidden" name="roleId" value="test">'
				)*/
				var allRoles = data.attributes.allRoles;
				var userRelRolesStr = data.attributes.userRelRolesStr;
				$.each(allRoles, function(index,obj){
					var checked = userRelRolesStr.indexOf(obj.id) >= 0?'checked="checked"':'';
					selector.append(
						'<div class="row-fluid">'+
							'<div class="checkbox check-success">'+
								'<input id="'+checkboxAlias+'role'+index+'" type="checkbox" name="roleId" value="'+obj.id+'" '+checked+'>'+
								'<label for="'+checkboxAlias+'role'+index+'">'+obj.roleName+'</label>'+
							'</div>'+
						'</div>'
					)
				});
			}
		}
	});
}

//加载业务角色
function loadBusinessRoles(id,name,locName,level){
	loadRoles({
		dom : $('#business_roles'), 
		url : Utils.getRootPath()+"/userdepartRelRoleController/loadUserDepartRoles",
		data : {userdepartId:id},
		checkboxAlias : 'business_'
	})
	$('#business_roles_div').removeClass('displaynone');
	$('#saveBusinessRole').next('div').remove();
	$('#saveBusinessRole').after(
		'<div>'+
			'<input name="userdepartId" type="hidden" value="'+id+'">'+
			'<div class="ml20">'+name+'&nbsp&nbsp&nbsp&nbsp'+locName+'&nbsp&nbsp&nbsp&nbsp'+level+'级</div>'+
		'</div>'
	)
}

//异步提交用户角色绑定请求
function submitSaveUserRelRoles(thiz){
	var form = $('#rolesForm');
	var loading = Utils.loading();
	form.ajaxSubmit({
		type: "POST",
		url:form.attr('action'),
		dataType: "json",
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

//异步提交用户业务角色绑定请求
function submitSaveBusinessUserRelRoles(thiz){
	var form = $('#businessRolesForm');
	var loading = Utils.loading();
	form.ajaxSubmit({
		type: "POST",
		url:form.attr('action'),
		dataType: "json",
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

//加载用户绑定的所有组织机构
function loadDeparts(selector, userId){
	$.ajax({
		url:Utils.getRootPath() + "/userRelDepartController/totalList", 
		type:"post",
		dataType : "json",
		data:{userId:userId},
		success : function(data){
			if(data.success){
				selector.empty();
				$.each(data.obj, function(index,obj){
					var departName = "'"+obj.departName+"'";
					var departNameShow = obj.departName.substring(0,11);
					departNameShow += obj.departName.length>10?'...':'';
					if(selfDepartId == obj.departId)
						departNameShow += "(当前)"
					var locName = "'"+obj.locName+"'";
					var level = "'"+obj.level+"'";
					selector.append(
						'<tr onclick="loadBusinessRoles('+obj.id+','+departName+','+locName+','+level+')">'+
							'<td>'+departNameShow+'</td>'+
							'<td>'+obj.locName+'</td>'+
							'<td>'+obj.level+'级</td>'+
							'<td><a class="layui-btn layui-btn-danger layui-btn-xs" javascript=":;" onclick="removeDepart('+obj.id+','+userId+')" lay-event="del">解绑</a></td>'+
						'</tr>'
					)
				});
			}
		}
	});
}

//用户解绑组织机构
function removeDepart(id, userId){
	Utils.preventPopAndDefault(event);
	Utils.showConfirm('解绑之后会连同该机构的角色权限一同解除，且不可恢复', function(){
		Utils.commonAjaxHandler(Utils.getRootPath() + "/userRelDepartController/unBind", {
			ids : JSON.stringify(id)
		},{
			notReloadLayerTable : true,
			onSuccess : function(){
				loadDeparts($('#depart_grid'), userId);
				//然后再清空下面的业务角色
				$('#business_roles').empty();
				$('#business_roles_div').addClass('displaynone');
				$('#saveBusinessRole').next('div').remove();
			}
		})
	});
}

//用户绑定机构
function bindDepart(){
	Utils.commonAjaxHandler(Utils.getRootPath() + "/userRelDepartController/doSaveOrUpdate", {
		userId : selectUserId,
		departId : $('#departSearch').prev('input').val()
	},{
		notReloadLayerTable : true,
		onSuccess : function(){
			$('#departSearch').val('');
			$('#departSearch').prev('input').val('');
			loadDeparts($('#depart_grid'), selectUserId);
		}
	});
}

//关闭角色权限右侧窗口
function hideRoleWindow(){
	$('#rolesWindow').addClass('displaynone');
	$('#userWindow').removeClass('width50');
}

//获取请求查询条件参数
function getRequestParam(){
	return serializeObject($("#searchForm").ajaxForm());
}