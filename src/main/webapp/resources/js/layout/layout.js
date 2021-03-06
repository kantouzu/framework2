var isLoaded;
var hasBusinessRole;
var hasRole;
var departId;
$(function(){
	var departId = Utils.isEmpty($('#departId').val())?null:$('#departId').val();
	var hasRole = $('#hasRole').val();
	var hasBusinessRole = $('#hasBusinessRole').val();
	//渲染菜单
	isLoaded = $('#isLoaded').val();
	/**
	 * 该js异步请求菜单并渲染的方法只允许，在加载主页面的时候，执行一次
	 */
	if(!Utils.isEmpty(isLoaded)){
		//加载左侧菜单
		getMenuTreeData({
			selector : $('#menuUl'),
			data : {departId : departId, hasRole : hasRole, hasBusinessRole : hasBusinessRole}
		})
		$('#isLoaded').val('');
		$('#roleType_change').select2();
		$('#depart_change').select2();
	}
	//监听角色种类切换事件
	$('#roleType_change').change(function(){
		var data = {};
		var msg = '';
		if($(this).val() == 'business'){
			msg = '您已切换为业务角色，<br/>当前所属机构为：'+$("#depart_change option:first").text();
			$('#departDiv').css('display','inline-block');
			data = {departId : departId, hasRole : false, hasBusinessRole : true}
		}else{
			msg = '您已切换为非业务角色';
			$('#departDiv').css('display','none');
			data = {departId : null, hasRole : true, hasBusinessRole : false}
		}
		getMenuTreeData({
			selector : $('#menuUl'),
			data : data
		})
		Utils.showToastSuccess(msg);
		$.Webarch.init();
		$('#tab-content').empty();
		$('#tab-ul').empty();
	})
	//如果是业务类型的角色，监听切换业务单位事件
	if(hasBusinessRole){
		$('#depart_change').change(function(){
			getMenuTreeData({
				selector : $('#menuUl'),
				data : {departId : $(this).val(), hasRole : hasRole, hasBusinessRole : hasBusinessRole}
			})
			Utils.showToastSuccess('您已切换为'+$("#depart_change option:selected").text()+"的相关权限");
			$.Webarch.init();
			$('#tab-content').empty();
			$('#tab-ul').empty();
		})
	}
})

function showIframePageContent(url, preHandleUrl, menuName, menuId){
	if(!Utils.isEmpty(preHandleUrl)){
		/*var loading = layer.load(1);
		$.ajax({
    		type: 'post',
    		url: Utils.getRootPath()+"/"+preHandleUrl,
    		success: function(data, textStatus){
				layer.close(loading);
    			if(data.success){
    				url += '&userEntrpCode='+userEntrpCode+'&userName='+userName+'&userEntrpLevel='+userEntrpLevel+'&checkUserTypeCode='+checkUserTypeCode+'&personId='+userId+'&isBranchComp='+isBranchComp;
                		var iframe;
                      iframe = document.createElement('iframe');
                      iframe.setAttribute('src',url);
                      iframe.setAttribute('width','100%');
                      iframe.setAttribute('height','700');
                	  $('#searchListId').html(iframe);
    			}else{
    				Utils.showToastFail(data.msg);
    			}
    		},
    		error: function(){
				layer.close(loading);
    			Utils.showToastFail(loadErrorMsg);
    		}
    	});*/
	}else{
	  var iframe;
      iframe = document.createElement('iframe');
      iframe.setAttribute('src',url);
      iframe.setAttribute('width','100%');
      iframe.setAttribute('height','610');
      $(iframe).css('border','none');
      /* $('#page-content').html(iframe);*/
	  $('#tab-ul').find('li').removeClass('active');
	  //判断该菜单是否已存在，如果不存在tab，直接append，否则跳转到该tab并刷新iframe
	  var showId = 'menuId_'+menuId;
	  var closeId = "'"+showId+"'";
	  var aTagId = "'"+'a_tag_'+showId+"'";
	  if(!document.getElementById(showId)){
		  $('#tab-ul').append(
			  '<li id="'+showId+'" class="active">'+
				  '<a onclick="targetToTabPage('+aTagId+')" href="a_tag_'+showId+'" role="tab" data-toggle="tab">'+
					  menuName+
					  '&nbsp<i onclick="closeTab('+closeId+')" class="layui-icon layui-unselect layui-tab-close">ဆ</i>'+
				  '</a>'+
			  '</li>'
		  )
		  $('#tab-content').children('div').removeClass('active');
		  $('#tab-content').append(
			  '<div class="tab-pane active" id="a_tag_'+showId+'">'+
			  		iframe.outerHTML+
			  '</div>'
		  )
	  }else{
		  $('#'+showId).addClass('active');
		  //然后刷新对应的iframe
		  $('#tab-content').children('div').removeClass('active');
		  $('#a_tag_'+showId).addClass('active');
		  $('#a_tag_'+showId).find('iframe').get(0).contentWindow.location.reload(true);
	  }
	}
}

//点击tab标签切换到指定tab页
function targetToTabPage(id){
	$('#tab-content').children('div').removeClass('active');
	$('#'+id).addClass('active');
}

//点击叉叉关闭tab
function closeTab(showId){
	Utils.preventPopAndDefault(event);
	//先判断当前关闭tab是否是active，如果是，则指定该tab的前一个tab显示，如果前面没有了，就后面一个，如果都没有就不管了
	if($('#'+showId).hasClass('active')){
		if(!Utils.isEmpty($('#'+showId).prev('li').get(0))){
			$('#'+showId).prev().addClass('active');
			var prev_id = $('#'+showId).prev().attr('id');
			$('#a_tag_'+prev_id).addClass('active');
		}else{
			if($('#'+showId).after().get(0)){
				$('#'+showId).after().addClass('active');
				var prev_id = $('#'+showId).after().attr('id');
				$('#a_tag_'+prev_id).addClass('active');
			}
		}
	}
	$('#'+showId).remove();
	$('#a_tag_'+showId).remove();
}

function reloadIframe(){
	$('#tab-content').find('.active').find('iframe').get(0).contentWindow.location.reload(true);
}



function getMenuTreeData(param){
	var selector = param.selector;
	var data = param.data;
//	var index = loading();
	$.ajax({
		url: Utils.getRootPath() + "/menuController/getAllMenuTree", 
		type : 'post',
		dataType: 'json',
		async:false,
		data : data,
		success: function(d){
//			Utils.closeLayerWindow(index);
			if(d.success){
				selector.empty();
				loadMenuTree(d.obj, selector)
			}else{
//				Utils.showToastFail(d.msg);
			}
		},
		error: function(d){
//			Utils.closeLayerWindow(index);
			Utils.showToastFail(d.msg);
		}
	});
	isLoaded = true;

}

function loadMenuTree(menus, selector, showIcon){
	$.each(menus, function(index,obj){
		if(Utils.isEmpty(obj.isRoot) || '0' == obj.isRoot){
			var url = "javascript:;";
			if(!Utils.isEmpty(obj.url)){
				url = Utils.getRootPath();
				if(!Utils.isEmpty(obj.url) && obj.url.indexOf('/') != 0)
					url += '/';
				url += obj.url;
				url = "javascript:showIframePageContent('"+url+"',null,'"+obj.name+"','"+obj.id+"')";
			}
			//如果有子菜单，就拼一个壳，如果没有，就拼菜单
			if(!Utils.isEmpty(obj.children)){
				var menu =  '<li>';
				if(showIcon)
					menu += 	'<a href="javascript:;"> <i class="'+obj.icon+'"></i>&nbsp&nbsp <span class="title">'+obj.name+'</span> <span class=" arrow"></span> </a>';
				else
					menu += 	'<a href="javascript:;">  <span class="title">'+obj.name+'</span> <span class=" arrow"></span> </a>';
				menu += 		'<ul class="sub-menu" id="menuTree_'+obj.id+'">'+
								'</ul>'+
							'</li>'
				selector.append(menu)
				var nextSelector = $('#menuTree_'+obj.id);
				loadMenuTree(obj.children, nextSelector);
			}else{
				selector.append(
					'<li> <a href="'+url+'"> '+obj.name+' </a> </li>'
				)
			}
		}else{
			if(!Utils.isEmpty(obj.children)){
				loadMenuTree(obj.children, selector, true);
			}
		}
	});
}

//重新加载主菜单
function reloadMenu(){
	getMenuTreeData({
		selector : $('#menuUl'),
		data : {departId : departId, hasRole : hasRole, hasBusinessRole : hasBusinessRole}
	})
	$.Webarch.init();
}

//注销
function logOut(){
	Utils.showConfirm('注销登录？', function(){
		window.location.href=Utils.getRootPath()+"/loginController/logOut";
	});
}