//统一监听登录session失效重定向
$.ajaxSetup({  
  type: 'POST',  
  contentType:"application/x-www-form-urlencoded;charset=utf-8",  
  complete: function(xhr,status) {  
    var sessionStatus = xhr.getResponseHeader('sessionstatus');  
    if(sessionStatus == 'timeout') {  
      //var top = getTopWinow();  
      //var yes = confirm('由于您长时间没有操作, session已过期, 请重新登录.');  
      //if (yes) {  
    	alert('登录失效,请重新登录！');  
        window.parent.location.href = Utils.getRootPath()+'/home';  
      //}  
    }  
  }  
}); 

var totalFontAndBgc = 'background-color:#f0ffff;color:black;font-weight:bold;';


var loadErrorMsg = '网络错误';

$(function(){
	layui.use('layer', function(){
		
	});
	//注意：折叠面板 依赖 element 模块，否则无法进行功能性操作
	layui.use('element', function(){
	  var element = layui.element;
	  
	  //…
	});
	
	//将所有标有dicType和dicValue的控件加载数据字典数据
	var dicInputs = document.getElementsByTagName('select');
	for (var i = 0; i < dicInputs.length; i++) {
		/*if($(dicInputs[i]).attr('dicType')){
			var tableName = $(dicInputs[i]).attr('dicType');
			var tableId = $(dicInputs[i]).attr('dicValue');
			var decodeBy = $(dicInputs[i]).attr('decodeBy');
			//调用数据字典加载数据方法
			getSelectedDicListByTableName($(dicInputs[i]), tableName, tableId, decodeBy);
		}else */if($(dicInputs[i]).attr('enumType')){
			var enumName = $(dicInputs[i]).attr('enumType');
			var enumId = $(dicInputs[i]).attr('enumValue');
			var enumEmpty = $(dicInputs[i]).attr('enumEmpty');
			var enumFilter = $(dicInputs[i]).attr('enumFilter');
			//调用枚举字典加载数据方法
			Utils.getSelectedEnumListByEnumName($(dicInputs[i]), enumName, enumId, enumEmpty, enumFilter);
		}
	}
})

/**
 * 工具脚本
 */
var Utils = function() {
	return {
		//渲染组织结构联想
		departImagine : function(baseParam){
			var dom = baseParam.dom;
			var type = isEmpty(baseParam.type)?'input':baseParam.type;
			var url = baseParam.url;
			var searchName = isEmpty(baseParam.searchName)?'parentId':baseParam.searchName;
			var requestParam = baseParam.requestParam;
			var onSuccessFunc = baseParam.onSuccessFunc;
			var onChooseFunc = baseParam.onChooseFunc;
			var restrain = baseParam.restrain; //是否按数据权限加载
			
			dom.before(
				'<input class="form-control" name="'+searchName+'" type="hidden"/>'
			)
			dom.bind(type, function(){
		    	var name = dom.val();
		    	var data = {name:name, restrain:restrain};
		    	$.ajax({
					url:url,
					type:"post",
					dataType : "json",
					data:data,
					success : function(data){
						if(data.success){
							while(!Utils.isEmpty(dom.next('div')[0]))
								dom.next('div').remove();
							var options = '';
							$.each(data.obj, function(index,obj){
								options +=
									'<li submitVal="'+obj.id+'" class="select2-results-dept-0 select2-result select2-result-selectable">'+
										'<div class="select2-result-label">'+
											'<span class="">'+
											obj.name+
											'</span>&nbsp&nbsp<font class="fr">--'+obj.level+'级</font>'+
										'</div>'+
									'</li>'
							})
							var div = '<div class="select2-drop select2-with-searchbox select2-drop-active">'+
											'<ul class="select2-results">'+options+
											'</ul>'+
										'</div>'
							dom.after(div);
							$('div').not(dom.next('div')[0]).click(function(){
						    	if(!Utils.isEmpty(dom.next('div')[0])){
						    		if(!dom.next('div').hasClass('displaynone'))
						    			dom.next('div').addClass('displaynone');
						    	}
						    })
						}
						if(!isEmpty(onSuccessFunc))
							onSuccessFunc();
						dom.next('div').find('li').mouseover(function(){  
					        $(this).addClass('select2-highlighted');  
					    });
						dom.next('div').find('li').mouseout(function(){  
					    	$(this).removeClass('select2-highlighted');  
					    }) 
					    dom.next('div').find('li').click(function(){  
					    	dom.val($(this).find('span').text());
					    	dom.prev('input').val($(this).attr('submitVal'));
					    	dom.next('div').addClass('displaynone');
					    	if(!isEmpty(onChooseFunc))
					    		onChooseFunc(); 
					    }) 
					}
				});
		    })
		},
		//加载枚举字典
		getSelectedEnumListByEnumName : function (dom, enumName, selectedId, enumEmpty, enumFilter){
			$.ajax({
				url:Utils.getRootPath()+"/enumJson/selectedEnumReturnByEnumName",
				type:"get",
				dataType : "json",
				data:{enumName:enumName},
				success : function(data){
					if(data.success){
						if(enumEmpty){
							dom.append(
								"<option value=''>--不限--</option>"
							)
						}
						$.each(data.obj, function(index,obj){
							if(isEmpty(enumFilter) || !in_array(enumFilter.split(','), obj.value)){
								if(obj.value+"" == selectedId){
									dom.append(
										"<option value='"+obj.value+"' selected>"+obj.name+"</option>"
									)
								}else{
			                        if(obj.value=='000'){
			                        	
			                        	dom.append(
			        						  "<optgroup label='"+obj.name+"' style='font-weight:bold;'>"+obj.name+"</optgroup>"
			        						);
			                        }else{
			                        	dom.append(
			        							"<option value='"+obj.value+"'>"+obj.name+"</option>"
			        						);
			                        }
								}
							}
						})
					}
					dom.select2();
				}
			});
		},
		//加载非树形地区
		getLocationInfoList : function (baseParam){
			var dom = baseParam.dom;
			var parentId = baseParam.parentId;
			var selectedId = baseParam.selectedId;
			var emptySelection = baseParam.emptySelection;
			$.ajax({
				url:Utils.getRootPath()+"/locationInfoController/totalList",
				type:"get",
				dataType : "json",
				data:{parentId:parentId},
				success : function(data){
					if(data.success){
						dom.empty();
						if(emptySelection){
							dom.append(
									"<option value=''></option>"
							)
						}
						$.each(data.obj, function(index,obj){
							if(obj.id+"" == selectedId){
								dom.append(
										"<option value='"+obj.id+"' selected>"+obj.name+"</option>"
								)
							}else{
								dom.append(
										"<option value='"+obj.id+"'>"+obj.name+"</option>"
								)
							}
						})
						dom.select2();
					}
				}
			});
		},
		/**
		 * 获取cookie
		 */
		getCookie : function (c_name){
			if (document.cookie.length>0){
			  var c_start=document.cookie.indexOf(c_name + "=")
			  if (c_start != -1){ 
			    c_start = c_start + c_name.length+1 
			    var c_end = document.cookie.indexOf(";", c_start)
			    if (c_end == -1) 
			    	c_end = document.cookie.length;
			    return unescape(document.cookie.substring(c_start,c_end))
			    } 
			  }
			return ""
		},
		
		/**
		 * 设置cookie
		 */
		setCookie : function (c_name,value,expiredays){
			var exdate=new Date()
			exdate.setDate(exdate.getDate()+expiredays)
			document.cookie=c_name+ "=" +escape(value)+
			((expiredays==null) ? "" : ";expires="+exdate.toGMTString())
		},
		
		/**
		 * 阻止冒泡和默认事件
		 */
		preventPopAndDefault : function(e){
			e.stopPropagation();
			e.preventDefault();
		},
		
		/**
		 * 获取两个时间点之差（自然月+天）
		 * type = '1';  如果返回月数，则整数部分按照号数相等节点计算，相隔几个月算几个月，小数部分看号数多余部分，多余部分除以30
		 * type = '0';  如果返回天数，直接返回自然天数
		 */
		getDateLast : function (startdate, enddate, type){
			if(typeof startdate == 'string'){
				startdate = new Date(startdate.replace(/-/g, "\/"));//时间转换
			}else{
				startdate = new Date(startdate);//时间转换
			}
			if(typeof enddate == 'string'){
				enddate = new Date(enddate.replace(/-/g, "\/"));//时间转换
			}else{
				enddate = new Date(enddate);//时间转换
			}
			if(type == '0'){
				var mil = Math.abs(Date.parse(startdate) - Date.parse(enddate));
				return isNaN(mil)?0:(mil/1000/60/60/24)+1;
			}else if(type == '1'){
				var month = 0;  
			    var day = 0;  
			    if (enddate.getDate() >= startdate.getDate()) {  
			        month = (enddate.getFullYear() - startdate.getFullYear()) * 12  
			                + enddate.getMonth() - startdate.getMonth();  
			        day = enddate.getDate() - startdate.getDate();  
			    } else {  
			    	var startDateTemp = new Date(startdate);
			    	var endDateTemp = new Date(enddate);
			        if (startdate.getDate() == getlastDay(startDateTemp)) {  
			            if (enddate.getDate() == getlastDay(endDateTemp)) {  
			                month = (enddate.getFullYear() - startdate.getFullYear()) * 12  
			                        + enddate.getMonth() - startdate.getMonth();  
			                day = 0;  
			            } else {  
			                month = (enddate.getFullYear() - startdate.getFullYear()) * 12  
			                        + enddate.getMonth() - startdate.getMonth() - 1;  
//			                day = startdate.getDate();  
			                var lastmonthday = getlastmonthDat(endDateTemp);  
			                day = lastmonthday - startdate.getDate() + enddate.getDate(); 
			            }  
			        } else {  
			            if (enddate.getDate() == getlastDay(endDateTemp)) {  
			                month = (enddate.getFullYear() - startdate.getFullYear()) * 12  
			                        + enddate.getMonth() - startdate.getMonth();  
			                day = 0;  
			            } else {  
			                month = (enddate.getFullYear() - startdate.getFullYear()) * 12  
			                        + enddate.getMonth() - startdate.getMonth() - 1;  
			  
			                var lastmonthday = getlastmonthDat(endDateTemp);  
			                day = lastmonthday - startdate.getDate() + enddate.getDate();  
			  
			            }  
			        }  
			    }  
//			    return {  
//			        "mounth" : month,  
//			        "day" : day  
//			    }; 
			    return (month+(day/30)).toFixed(2);
			}else{
				return 0;
			}
		},
		/**
		 * 加载layui时间控件
		 */
		getLayerDate : function (option){
			layui.laydate(option);
		},
		/**
		 * 获取两个时间之差
		 */
		compareDate : function (date1, date2){
			if(typeof date1 == 'string'){
				date1 = new Date(date1.replace(/-/g, "\/"));//时间转换
			}else{
				date1 = new Date(date1);//时间转换
			}
			if(typeof date2 == 'string'){
				date2 = new Date(date2.replace(/-/g, "\/"));//时间转换
			}else{
				date2 = new Date(date2);//时间转换
			}
			return Date.parse(date1) - Date.parse(date2);
		},
		/**
		 * 获取两个时间之差并根据值返回文字信息
		 */
		getTimeDiffStr : function (date1, date2){
		    var dd = date1;
		    if(typeof date1 == 'string'){
		      date1 = new Date(date1.replace(/-/g, "\/"));//时间转换
		    }else{
		      date1 = new Date(date1);//时间转换
		    }
		    if(typeof date2 == 'string'){
		      date2 = new Date(date2.replace(/-/g, "\/"));//时间转换
		    }else{
		      date2 = new Date(date2);//时间转换
		    }
		    var timeDiff = Math.abs(date1-date2);
		    var retStr = '';
		    if(timeDiff/1000 <= 60){
		      retStr = '1分钟前'; 
		    }else if(timeDiff/(1000*60*60)<1){
		      retStr = Math.round(timeDiff/(1000*60))+'分钟前';
		    }else if(timeDiff/(1000*60*60*24)<1){
		      retStr = Math.round(timeDiff/(1000*60*60))+'小时前';
		    }else if(timeDiff/(1000*60*60*24*30)<1){
		      retStr = "约"+Math.round(timeDiff/(1000*60*60*24))+'天前';
		    }else if(timeDiff/(1000*60*60*24*365)<1){
		      retStr = "约"+Math.round(timeDiff/(1000*60*60*24*30))+'个月前';
		    }else if(timeDiff/(1000*60*60*24*365)>=1){
		      retStr = "约"+Math.round(timeDiff/(1000*60*60*24*365))+'年前';
		    }else{
		      retStr = dd;
		    }
		    return retStr; 
		},
		/**
		 * 返回后台列表的window height
		 */
		createWindowWithoutBtn : function(param) {
			var lay = isEmpty(param.parentOpen)?layer:parent.layer;
			var dataGridSelector = param.dataGridSelector?param.dataGridSelector:"datagrid";
			
//			width = (1160/1364)*document.body.clientWidth;
//			height = (460/662)*parent.document.body.clientHeight;
			var width = !isEmpty(param.width)?param.width+'px':'900px';
			var height = !isEmpty(param.height)?param.height+'px':'550px';
			var title = param.title;
			var url = param.url;
			
			var index = lay.open({
				resize : true,
				title : title,
				area: [width, height],
				offset: '10px',
				 type : 2,
				 anim: 2,
				  content: url,
				  btn: [],
				  yes: function(index, layero){
					  layer.alert('点击确定', {icon: 1});
				  },btn2: function(index, layero){
					  layer.alert('关闭');
				  }/*,btn3: function(index, layero){
				    //按钮【按钮三】的回调
				  }*/
				  ,cancel: function(){ 
				    //右上角关闭回调
				  }
			}); 
			if(param.fullScreen)
				lay.full(index);
		},
		/**
		 * 返回后台列表的window height
		 */
		createAjaxWindow : function(title,url,width,height) {
			layer.open({
				resize : true,
				title : title,
				area: [width?width+'px':'900px', height?height+'px':'550px'],
				 type : 2,
				  content: url,
				  offset: '10px',
				  btn: ['保存', '关闭'],
				  yes: function(index, layero){
					  layer.alert('保存', {icon: 1});
				  },btn2: function(index, layero){
					  layer.alert('关闭');
				  }
				  ,cancel: function(){ 
				    //右上角关闭回调
				  },
				  yes: function(index, layero){
					  var form = $("iframe").contents().find("form");
					  var spanArray = form.get(0).getElementsByTagName('span');
					  for ( var i = 0; i < spanArray.length; i++) {
					    	if($(spanArray[i]).hasClass('help-block')){
					    		$(spanArray[i]).css('display','none');
					    	}
					    }
					  var result = commonFormValidate(form);
					  var check = checkFormValue(form);
					  if(result&&check){
						  var submitBtn = form.find("button[sb='nbBtn']");
						  submitBtn.click();
					  }else{
						  layer.msg('您有未通过验证的选项', {icon: 2});
						  return false;
					  }
				  },
				  btn2: function(index, layero){
					  layer.close(index); //如果设定了yes回调，需进行手工关闭
				  }
			}); 
		},
		/**
		 * 返回后台列表的window height
		 */
		createCommonWindow : function(param) {
			var lay = isEmpty(param.parentOpen)?layui.layer:parent.layui.layer;
			var dataGridSelector = param.dataGridSelector?param.dataGridSelector:"datagrid";
			
//			width = (1160/1364)*document.body.clientWidth;
//			height = (460/662)*parent.document.body.clientHeight;
			var width = !isEmpty(param.width)?param.width+'px':'900px';
			var height = !isEmpty(param.height)?param.height+'px':'550px';
			var title = param.title;
			var url = param.url;
			
			var index = lay.open({
				resize : true,
				title : title,
				area: [width, height],
				offset: '10px',
				 type : 2,
				 anim: 2,
				  content: url,
				  btn: ['保存','关闭'],
				  yes: function(index, layero){
					  layer.alert('保存');
				  },btn2: function(index, layero){
					  layer.alert('关闭');
				  }
				  ,cancel: function(){ 
				    //右上角关闭回调
				  },
				  yes: function(index, layero){
					  var form = $("iframe").contents().find("form"); 
					  var result = commonFormValidate(form);
					  if(result){
						  var index1 = loading();//加载层
						  form.ajaxSubmit({
							type: "POST",
							url:form.attr('action'),
							dataType: "json",
						    success: function(result){
					    	  if(result.success){
					    		  layui.use('table', function(){
					    			  var table = layui.table;
					    			  table.reload(
					    			    dataGridSelector,{}
					    			  );
					    			});
					    		  showbsMsg(result.msg);
								  closeLayerWindow(index1);//如果设定了yes回调，需进行手工关闭
								  closeLayerWindow(index);
								  if(!isEmpty(param.func1))
									  param.func1();
							  }else{
								  closeLayerWindow(index1);
								  showbsMsg(result.msg, 'error');
							  }
							},
							error: function(result){
								closeLayerWindow(index1);
								showbsMsg(loadErrorMsg, 'error');
							}
						});
					  }else{
						  showbsMsg('您有未通过验证的选项', 'error');
						  return false;
					  }
				  },
				  btn2: function(index, layero){
					  layui.use('table', function(){
		    			  var table = layui.table;
		    			  table.reload(
		    			    dataGridSelector,{}
		    			  );
		    			  
		    			});
					  closeLayerWindow(index);
				  }
			}); 
			if(param.fullScreen)
				lay.full(index);
//			layer.full(index);
		},
		multipartAjaxSubmit : function (form,arg) {
			var index1 = parent.layer.load(1);
			form.ajaxSubmit({
				type: "POST",
				url:form.attr('action'),
				data:{'arg':arg},
				dataType: "json",
			    success: function(result){
			    	if(result.success){
					  parent.$('#tt').datagrid('reload');
//						  $('#datagrid').datagrid('reload');
					  layer.msg(result.msg, {icon: 1});
					  parent.layer.close(index1);//如果设定了yes回调，需进行手工关闭
//					  layer.close(index);
					  var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
					  parent.layer.close(index);
				  }else{
					  parent.layer.close(index1);
					  layer.msg(result.msg, {icon: 2});
				  }
				},
				error: function(result){
					layer.msg("網絡錯誤", {icon: 2});
				}
			});
		},
       /**
        * 带有审核的弹出框
        */
		createDerivedBox : function(title,url,width,height,hasParent,dataGridSelector,parentPageReload,function1,function2,parentOpen) {
			var lay = isEmpty(parentOpen)?layer:parent.layer;
			var verify=false;
			dataGridSelector = dataGridSelector?dataGridSelector:"#tt";
			lay.open({
				title : title,
				area: [width?width+'px':'900px', height?height+'px':'600px'],
				 type : 2,
				  content: url,
				  btn: ['保存','关闭','验证'],
				  yes: function(index, layero){
					  layer.alert('保存');
				  },btn2: function(index, layero){
					  layer.alert('关闭');
				  },btn3: function(index, layero){
					  layer.alert('验证');
				  }
				  ,cancel: function(){ 
				    //右上角关闭回调
				  },
				  yes: function(index, layero){
					  var form = $("iframe").contents().find("form"); 
//					  var spanArray = form.get(0).getElementsByTagName('span');
//					  for ( var i = 0; i < spanArray.length; i++) {
//					    	if($(spanArray[i]).hasClass('help-block')){
//					    		$(spanArray[i]).css('display','none');
//					    	}
//					    }
					  var result = commonFormValidate(form);
					  var check = checkFormValue(form);
					  if(result && check){
						  if(!verify){
								parent.layer.msg("请先点击验证", {icon: 2}); 
								return false;
							  }
						  if(hasParent){
							  var index1 = parent.layer.load(1);//加载层
							  form.ajaxSubmit({
								type: "POST",
								url:form.attr('action'),
								data :{'arg':'nb'},
								dataType: "json",
							    success: function(result){
						    	  if(result.success){
						    		  //执行成功后执行方法
						    		  if(!isEmpty(function1)){
						    			  function1();
						    		  }
						    		  if(!isEmpty(function2)){
						    			  function2();
						    		  }
						    		  
						    		  parent.$(dataGridSelector).datagrid('reload');
						    		  try{
						    		  	parent.$(dataGridSelector).treegrid('reload');
						    		  }catch(e){}
//						    		  parent.$('#datagrid').datagrid('reload');
						    		  parent.layer.msg(result.msg, {icon: 1});
						    		  parent.layer.close(index1);//如果设定了yes回调，需进行手工关闭
									  layer.close(index);
									  var parentIndex = parent.parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
									  if(!isEmpty(parentIndex)){
										  parent.$(dataGridSelector).datagrid('reload');
										  try{
							    		  	parent.$(dataGridSelector).treegrid('reload');
							    		  }catch(e){}
										  parent.parent.layer.close(parentIndex);
									  }
								  }else{
									  parent.layer.close(index1);
									  parent.layer.msg(result.msg, {icon: 2});
								  }
								},
								error: function(result){
									parent.layer.msg("网络错误", {icon: 2});
								}
							});
						  }else{
							  var index1 = layer.load(1);//加载层
							  form.ajaxSubmit({
								type: "POST",
								url:form.attr('action'),
								dataType: "json",
							    success: function(result){
						    	  if(result.success){
						    		  
						    		  //执行成功后执行方法
						    		  //执行成功后执行方法
						    		  if(!isEmpty(function1)){
						    			  function1();
						    		  }
						    		  if(!isEmpty(function2)){
						    			  function2();
						    		  }
						    		  
						    		  $(dataGridSelector).datagrid('reload');
						    		  try{
						    		  	$(dataGridSelector).treegrid('reload');
						    		  }catch(e){}
						    		  if(parentPageReload){
						    			  location.reload();
						    		  }
//									  $('#datagrid').datagrid('reload');
									  layer.msg(result.msg, {icon: 1});
									  layer.close(index1);//如果设定了yes回调，需进行手工关闭
									  layer.close(index);
//									  var parentIndex = parent.parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
//									  if(!isEmpty(parentIndex)){
//										  parent.$('#tt').datagrid('reload');
//										  parent.parent.layer.close(parentIndex);
//									  }
								  }else{
									  layer.close(index1);
									  layer.msg(result.msg, {icon: 2});
								  }
								},
								error: function(result){
									layer.close(index1);
									layer.msg("网络错误", {icon: 2});
								}
							});
						  }
					  }else{
						  layer.msg('您有未通过验证的选项', {icon: 2});
						  return false;
					  }
				  },
				  btn2: function(index, layero){
					  if(hasParent){
						  parent.$(dataGridSelector).datagrid('reload');
						  try{
			    		  	parent.$(dataGridSelector).treegrid('reload');
			    		  }catch(e){}
//						  parent.$('#datagrid').datagrid('reload');
						  parent.layer.close(index); //如果设定了yes回调，需进行手工关闭
					  }else{
						  $(dataGridSelector).datagrid('reload');
						  try{
			    		  	$(dataGridSelector).treegrid('reload');
			    		  }catch(e){}
//						  $('#datagrid').datagrid('reload');
						  layer.close(index); //如果设定了yes回调，需进行手工关闭
					  }
				  },
				  btn3: function(index, layero){
					  verify=true;
					  var form = $("iframe").contents().find("form");
					  var submitBtn = form.find("button[sb='sbBtn']");
					  submitBtn.click();
					  return false;
				  }
			}); 
		},
		/**
		 * 公共文件（图片）上传方法
		 */
		commonImgUploader : function (dom, url) {
			var index1 = layer.load(1);
			$(dom).parent('form').ajaxSubmit({
				type: "POST",
				url:url,
				dataType: "json",
			    success: function(result){
			    	if(result.success){
			    		console.log(result.obj);
			    		$(dom).parent('form').parent().find('img[up="img"]').attr('src',result.obj);
			    		layer.msg("成功", {icon: 1});
			    		layer.close(index1);
			    	}else{
			    		layer.close(index1);
			    		layer.msg(result.msg, {icon: 2});
			    	}
				},
				error: function(result){
					layer.close(index1);
					layer.msg("网络错误", {icon: 2});
				}
			});
		},
		/**
		 * 确认/取消 操作框
		 */
		showConfirm : function (cont, func1, func2) {
			layer.confirm(cont, {icon: 3, title:'提示'}, function(index){
				if(!isEmpty(func1))
					func1();
				layer.close(index);
			},function(index2){
				if(!isEmpty(func2))
					func2();
				layer.close(index2);
			});
		},
		/**
		 * 输入框 操作框
		 */
		showPrompt : function (cont, title, width, height, func1) {
			width = width?width+"px":'800px';
			height = height?height+"px":'800px';
			layer.prompt({
			  formType: 2,
			  value: cont,
			  title: title,
			  area: [width, height] //自定义文本域宽高
			}, function(value, index, elem){
				func1();
			    layer.close(index);
			});
		},
		/**
		 * 简单提示
		 */
		showTips : function (cont, jQueryDom) {
			layer.tips(cont, jQueryDom);
		},
		/**
		 * 统一tip层(操作成功)
		 */
		showToastSuccess : function(msg, showCloseButton) {
//			layer.msg(content, {icon: 1}); 
			
			var type = 'success';
			var msg;
			if(isEmpty(msg)){
				msg = type == 'success'?'操作成功':'操作失败';
			}
//			var showCloseButton = isEmpty(showCloseButton)?false:true;
			Messenger().post({
			 message: msg,
			 type: type,
		     showCloseButton: true
		  });	
		},
		/**
		 * 统一tip层(服务端报错，操作失败)
		 */
		showToastFail : function(msg, showCloseButton) {
//			layer.msg(content, {icon: 1}); 
			
			var type = 'error';
			var msg;
			if(isEmpty(msg)){
				msg = type == 'success'?'操作成功':'操作失败';
			}
//			var showCloseButton = isEmpty(showCloseButton)?false:true;
			Messenger().post({
			 message: msg,
			 type: type,
		     showCloseButton: true
		  });	
		},
		/**
		 * 统一加载层
		 */
		loading : function(type){
			if(isEmpty(type))
				return layer.load();
			else
				return layer.load(type);
		},
		/**
		 * 统一刷新数据网格
		 */
		reloadLayerTable : function(selector){
			layui.use('table', function(){
				var table = layui.table;
				var selector = isEmpty(selector)?'datagrid':selector;
				table.reload(selector,{});
			});
		},
		commonAjaxHandler : function(url, param, otherParam, datagridSelector, type, dataType){
			var type = isEmpty(type)?'post':type;
			var dataType = isEmpty(dataType)?'json':dataType;
			var func1;
			var func2;
			if(!isEmpty(otherParam)){
				func1 = isEmpty(otherParam.func1)?otherParam.onSuccess:otherParam.func1;
				func2 = isEmpty(otherParam.func2)?otherParam.onFail:otherParam.func2;
			}
			var index = loading();
			$.ajax({
				url: url,
				type : type,
				dataType: dataType,
				data: param,
				success: function(d){
					closeLayerWindow(index);
					if(d.success){
						showbsMsg(d.msg);
						if(!isEmpty(otherParam)){
							if(isEmpty(otherParam.notReloadLayerTable))
								reloadLayerTable(datagridSelector);
							if(!isEmpty(func1))
								func1();
						}else{
							reloadLayerTable(datagridSelector);
						}
					}else{
						if(!isEmpty(func2))
							func2();
						showbsMsg(d.msg, 'error');
					}
				},
				error: function(d){
					closeLayerWindow(index);
					showbsMsg(loadErrorMsg, 'error');
				}
			});
		},
		/**
		 * 统一加载数据网格
		 */
		layerDatagrid : function(baseParam, funcParam, otherFuncParam){
			var selector = isEmpty(baseParam.selector)?'datagrid':baseParam.selector;
			var url = baseParam.url;
			var fields = baseParam.fields;
			var height = isEmpty(baseParam.height)?500:baseParam.height;
			var requestParam = baseParam.requestParam;
			var page = isEmpty(baseParam.page)?{
												   theme : '#22262e'  //数据网格背景色
											   }:baseParam.page;
			layui.use('table', function() {
				var table = layui.table;

				table.render({
					elem : '#'+selector
					,height : height
					// ,even: true //各行换色
					,url : url // 数据接口
					,page : page // 开启分页
					,where : requestParam
					,cols : [fields]  //字段
					,loading : true //加载转圈圈
					,text : '数据加载中...' //加载转圈圈
				});

				// 监听工具条
				table.on('tool('+selector+')', function(obj) { // 注：tool是工具条事件名，test是table原始容器的属性
															// lay-filter="对应的值"
					var data = obj.data; // 获得当前行数据
					var layEvent = obj.event; // 获得 lay-event 对应的值（也可以是表头的 event
												// 参数对应的值）
					var tr = obj.tr; // 获得当前行 tr 的DOM对象
					if (layEvent === 'edit') { // 编辑
						funcParam.edit(data);
					} else if (layEvent === 'del') { // 删除
						layer.confirm('确定删除？',{icon: 3, title:'提示'}, function(index) {
							// obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
							// del(data.id); //真删除
							funcParam.del(data);
							closeLayerWindow(index);
						});
					} else if (layEvent === 'detail') { // 查看
						funcParam.detail(data);
					} else if (layEvent === 'func1') { // 其它方法1
						otherFuncParam.func1(data);
					}
				});
			});
		},
		/**
		 * 统一加载tree
		 */
		treegrid : function(baseParam){
			var selector = isEmpty(baseParam.selector)?$('#treegrid'):baseParam.selector;
			var url = baseParam.url;
			var fields = baseParam.fields;
//			var height = isEmpty(baseParam.height)?455:baseParam.height;
			var requestParam = baseParam.requestParam;
			var onDrop = baseParam.onDrop;
			var onLoadSuccess = Utils.isEmpty(baseParam.onLoadSuccess)?function(data) {
													selector.treegrid("clearSelections");
												}:baseParam.onLoadSuccess;
			selector.treegrid({
				idField : 'id',
				treeField:'name',
				url : url,
				method : 'post',
				queryParams : requestParam,
				loadMsg:'数据加载中,请稍候...',
				rownumbers : true,
				singleSelect : true,
				animate : true,
				columns : fields,
				onLoadSuccess : onLoadSuccess,
				onDrop : onDrop,
				onBeforeSelect : function(row){
					var selectedRow =  selector.treegrid("getSelected");
					if(!selectedRow){
						return true;
					}
					if(row.id == selectedRow.id){
						selector.treegrid("clearSelections");
						return false;
					}
				}
			});
		},
		/**
		 * 统一加载combotree
		 */
		combotree : function(baseParam){
			var selector = isEmpty(baseParam.selector)?$('#combotree'):baseParam.selector;
			var url = baseParam.url;
//			var fields = baseParam.fields;
			var width = isEmpty(baseParam.width)?397:baseParam.width;
			var height = isEmpty(baseParam.height)?32:baseParam.height;
			var selfId = isEmpty(baseParam.selfId)?'':baseParam.selfId;
			var parentDom = isEmpty(baseParam.parentDom)?'':baseParam.parentDom;
			var requestParam = baseParam.requestParam;
			selector.combotree({
				url: url,
				idField:'id',
				textField:'name',
		    	method:'post',
		    	checkbox:true,
		    	width:397,
		    	height:32,
		    	onSelect:function(d){
		    		if(d){
		    			if(d.id == selfId){
		    				Utils.showToastFail('不能选择自己为父级元素');
		    				selector.combotree('clear');
		    				parentDom.val('');
		    			}else{
		    				parentDom.val(d.id);
		    			}
		    		}
		    	}
			});
		},
		/**
		 * 统一关闭弹出层
		 */
		closeLayerWindow : function(index){
//			layer.close(index);
			layer.closeAll('loading');
		},
		/**
		 * 获取选择日期（生日）的控件
		 */
		getBirthDateChoose : function(dom, format) {
			var options = {
					  elem: dom,
					  format: format, //日期格式
					  istime: false,
					 
					  // min: laydate.now(), //最小日期
					  max: laydate.now(), //最大日期
					  zIndex: 99999999, //css z-index
					  choose: function(dates){ //选择好日期的回调
						  $(dom).val(dates);
					  }
					}
				
			layui.laydate(options);
		},
		/**
		 * 返回后台列表的window height
		 */
		getDatagridWindowHeight : function() {
//			return (420/662)*document.body.clientHeight;
			return (370/662)*document.body.clientHeight;
		},
		/**
		 * 返回后台列表的window width
		 */
		getDatagridWindowWidth : function() {
//			return (1160/1364)*document.body.clientWidth;
			return 'auto';
		},
		/**
		 * 返回后台列表的window height
		 */
		getParentDatagridWindowHeight : function() {
			return (460/662)*parent.document.body.clientHeight;
		},
		/**
		 * 返回后台列表的window width
		 */
		getParentDatagridWindowWidth : function() {
			return (1090/1364)*parent.document.body.clientWidth;
		},
		/**
		 * 判断是否为空
		 */
		isEmpty : function(obj) {
			if(obj == undefined || obj == null || obj == "" || obj == "undefined"){
				return true;
			}else{
				return false;
			}
		},
		/**
		 * 获取项目根路径
		 */
		getRootPath : function() {
//			var curWwwPath = window.document.location.href;
//			var pathName = window.document.location.pathname;
			var pathHref = window.location.href;
			var projectUrl = '';
			
			var pathName = window.document.location.pathname;
			var projectName = pathName
					.substring(0, pathName.substr(1).indexOf('/') + 1);
			
			projectUrl = pathHref.substring(0, pathHref.indexOf(projectName) + projectName.length);
			return (projectUrl);
		},
		/**
		 * JS 取消冒泡事件 兼容火狐IE
		 */
		stopPropagation : function(e) {
			if (e && e.stopPropagation) {
				// W3C取消冒泡事件
				// e.preventDefault();
				e.stopPropagation();
			} else {
				// IE取消冒泡事件
				window.event.cancelBubble = true;
			}
		},
		/**
		 * 判断字符长度
		 */
		getByteLen : function(val) {
			var len = 0;
		    for (var i = 0; i < val.length; i++) {
				var length = val.charCodeAt(i);
				if (length >= 0 && length <= 128) {
				    len += 1;
				} else {
				    len += 2;
				}
		    }
			return len;
		},
		/**
		 * 设置宽度和高度自适应
		 */
		resizedGrid : function(div_id) {
			var height = $(window).height() - 88;
			$("#"+div_id).datagrid('resize', {
				height : height
			});
		},
		/**
		 * 设置宽度和高度自适应
		 */
		resizedTreeLayoutGrid : function(div_id) {
			var height = $(window).height() - 88;
			var width = $(window).width() - 200;
			if($("#maincont")){
				width = $("#maincont").width() - 200;
			}
			$("#"+div_id).datagrid('resize', {
				width : width,
				height : height
			});
		},
		/*
		 * 让datagrid在无数据的情况下显示横向滚动条
		 * 注意此方法要结合datagrid的onLoadSuccess方法使用，需要判断数据为0的情况下调用此方法。
		 * onLoadSuccess: function(data){
				if (data.total == 0) {
					scrollShow("dg",data.total);
				}
			}
		 */
		scrollShow : function(datagridId, total) {
		    if (total == 0) {
		        var datagrid = $("#" + datagridId);
		        var width = datagrid.prev(".datagrid-view2").find(".datagrid-header-row").width();
		        datagrid.prev(".datagrid-view2")
		            .children(".datagrid-body")
		            .html("<div style='width:" + width + "px;border:solid 0px;height:1px;'></div>");
		    }
		},
		/**
		 * 当前时间的前一年
		 */
		getOneYearBeforeDay : function() {
			var date=new Date();
	   		var str=new Date((+date)-365*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的后三个月
		 */
		getThreeMonthAfterDay : function() {
			var date=new Date();
	   		var str=new Date((+date)+90*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的前三天
		 */
		getThreeAfterDay : function() {
			var date=new Date();
	   		var str=new Date((+date)-3*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的前两天
		 */
		getTwoAfterDay : function() {
			var date=new Date();
	   		var str=new Date((+date)-2*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的前两天
		 */
		getTwoAfterDayForDate : function() {
			var date=new Date();
	   		var str=new Date((+date)-2*24*3600*1000).format("yyyy-MM-dd");
			return str;
		},
		/**
		 * 当前时间的前一天
		 */
		getOneAfterDay : function() {
			var date=new Date();
	   		var str=new Date((+date)-1*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间
		 */
		getNowDay : function() {
			var date=new Date();
	   		var str=new Date(+date).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间前90天
		 */
		getThreeMonthDay : function() {
			var date=new Date();
	   		var str=new Date((+date)-90*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间前30天
		 */
		getThirtyBeforeDay : function() {
			var date=new Date();
			var str=new Date((+date)-30*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的后一天
		 */
		getOneBeforeDay : function() {
			var date=new Date();
	   		var str=new Date((+date)+1*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		
		/**
		 * 当前时间的后一天
		 */
		getOneBeforeDayForDate : function() {
			var date=new Date();
	   		var str=new Date((+date)+1*24*3600*1000).format("yyyy-MM-dd");
			return str;
		},
		/**
		 * 当前时间的后七天
		 */
		getSevenDayAfter : function() {
			var date=new Date();
	   		var str=new Date((+date)+7*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的前七天
		 */
		getSevenAfterDay : function() {
			var date=new Date();
	   		var str=new Date((+date)-7*24*3600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 当前时间的前10分钟
		 */
		getTenBeforeMin : function() {
			var date=new Date();
	   		var str=new Date((+date)-600*1000).format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		
		/**
		 * 当前时间
		 */
		getNowTime : function() {
			var date=new Date();
	   		var str=new Date().format("yyyy-MM-dd hh:mm:ss");
			return str;
		},
		/**
		 * 获得今天20:
		 */
		getToday8Hours : function(){
			var date = new Date();
			var year = date.getFullYear();
			var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1): date.getMonth() + 1;
			var day = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
			var dateStr = year + "-" + month + "-" + day ;
			return dateStr+" 20:00:00" ;
		},
		/**
		 * 获得明天20:
		 */
		get1DaysAfterToday8Hours : function(){
			var date = new Date();
	   		var date = new Date((+date)+1*24*3600*1000);
			var year = date.getFullYear();
			var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1): date.getMonth() + 1;
			var day = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
			var dateStr = year + "-" + month + "-" + day ;
			return dateStr+" 20:00:00" ;
		},
		
		/**
		 * 获得当前时间的生产日期开始时间 2015-07-22 07:22:00则生产日期为2015-07-21 20:00:00
		 */
		getCurrentProdDateStart : function(){
			
			var date = new Date();
			var year = date.getFullYear();
			var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1): date.getMonth() + 1;
			var day = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
			var dateStr = year + "-" + month + "-" + day ;  

			var dateB = new Date((+ date)-1*24*3600*1000); 
			var yearB = dateB.getFullYear();
			var monthB = dateB.getMonth() + 1 < 10 ? "0" + (dateB.getMonth() + 1): dateB.getMonth() + 1;
			var dayB = dateB.getDate() < 10 ? "0" + dateB.getDate() : dateB.getDate();
			var dateStrB = yearB + "-" + monthB + "-" + dayB ;   
			
			var hour = date.getHours()>20 ? dateStr: dateStrB;
		    return hour+" 20:00:00" ;
		},
		/**
		 * 获得当前时间的生产日期结束时间 2015-07-22 07:22:00则生产日期为2015-07-22 20:00:00
		 */
		getCurrentProdDateEnd : function(){
			
			var date = new Date();
			var year = date.getFullYear();
			var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1): date.getMonth() + 1;
			var day = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
			var dateStr = year + "-" + month + "-" + day ;  

			var dateB = new Date((+ date)+1*24*3600*1000); 
			var yearB = dateB.getFullYear();
			var monthB = dateB.getMonth() + 1 < 10 ? "0" + (dateB.getMonth() + 1): dateB.getMonth() + 1;
			var dayB = dateB.getDate() < 10 ? "0" + dateB.getDate() : dateB.getDate();
			var dateStrB = yearB + "-" + monthB + "-" + dayB ;   
			
			var hour = date.getHours()<20 ? dateStr: dateStrB;
		    return hour+" 20:00:00" ;
		}
	};
}();

var errCssSpan = {
		'border-color' : '#CC0033',
		'border-width' : '1px',
		'border-style' : 'solid'
	};

function removeRedBorder($dom){
	$dom.css('border-color','');
	$dom.css('border-width','');
	$dom.css('border-style','');
}

String.prototype.replaceAll = function(reallyDo, replaceWith, ignoreCase) {
	if (!RegExp.prototype.isPrototypeOf(reallyDo)) {
		return this.replace(new RegExp(reallyDo, (ignoreCase ? "gi" : "g")),
				replaceWith);
	} else {
		return this.replace(reallyDo, replaceWith);
	}
};

Date.prototype.format =function(format){
    var o = {
    	"M+" : this.getMonth()+1, // month
    	"d+" : this.getDate(), // day
    	"h+" : this.getHours(), // hour
    	"m+" : this.getMinutes(), // minute
    	"s+" : this.getSeconds(), // second
    	"q+" : Math.floor((this.getMonth()+3)/3), // quarter
    	"S" : this.getMilliseconds() // millisecond
    };
    if(/(y+)/.test(format)) 
	format=format.replace(RegExp.$1,(this.getFullYear()+"").substr(4- RegExp.$1.length));
    for(var k in o)if(new RegExp("("+ k +")").test(format))
	format = format.replace(RegExp.$1,
	    RegExp.$1.length==1? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
	return format;
};

function getCommonEnumList(enumNames){
	$.ajax({
		url:Utils.getRootPath()+"/enumJson/commonEnumReturn",
		type:"get",
		dataType : "json",
		data:{
			condition : enumNames
		},
		success : function(data){
			if(data.success){
				$.each(data.obj, function(index,obj){
					$.each(obj.value, function(index,o){
						$('#'+obj.name).append(
							"<option value='"+o.value+"'>"+o.name+"</option>"
						)
					})
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

function getCommonEnumListToAttr(enumNames){
	$.ajax({
		url:Utils.getRootPath()+"/enumJson/commonEnumReturn",
		type:"get",
		dataType : "json",
		data:{
			condition : enumNames
		},
		success : function(data){
			if(data.success){
				$.each(data.obj, function(index,obj){
					$.each(obj.value, function(index,o){
						$('select[enumType="'+obj.name+'"]').append(
							"<option value='"+o.value+"'>"+o.name+"</option>"
						)
					})
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

function getSelectedEnumList(enumNames){
	$.ajax({
		url:Utils.getRootPath()+"/enumJson/selectedEnumReturn",
		type:"get",
		dataType : "json",
		data:{
			condition : enumNames
		},
		success : function(data){
			if(data.success){
				$.each(data.obj, function(index,obj){
					$.each(obj.value, function(index,o){
						if(o.value == obj.selectedValue){
							$('#'+obj.name).append(
								"<option value='"+o.value+"' selected='selected'>"+o.name+"</option>"
							)
						}else{
							$('#'+obj.name).append(
								"<option value='"+o.value+"'>"+o.name+"</option>"
							)
						}
					})
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

function getSelectedEnumListToAttr(enumNames){
	$.ajax({
		url:Utils.getRootPath()+"/enumJson/selectedEnumReturn",
		type:"get",
		dataType : "json",
		data:{
			condition : enumNames
		},
		success : function(data){
			if(data.success){
				$.each(data.obj, function(index,obj){
					$.each(obj.value, function(index,o){
						if(o.value == obj.selectedValue){
							$('select[enumType="'+obj.name+'"]').append(
								"<option value='"+o.value+"' selected='selected'>"+o.name+"</option>"
							)
						}else{
							$('select[enumType="'+obj.name+'"]').append(
								"<option value='"+o.value+"'>"+o.name+"</option>"
							)
						}
					})
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

/**
 * 将页面转为详情页面
 * input textarea加readonly并变灰，select转input并变灰，特殊按钮删除等
 */
function transferPageToCheckOnly(dom, noButton){
	//限制input
	var inputs = dom.find('input');
	inputs.each(function(index, obj){
		$(this).attr('readonly', 'readonly');
		$(this).addClass('bggray');
		$(this).removeAttr('onclick');
	})
	//限制textarea
	var textareas = dom.find('textarea');
	textareas.each(function(index, obj){
		$(this).attr('readonly', 'readonly');
		$(this).addClass('bggray');
	})
	//转select为input
	var selects = dom.find('select');
	selects.each(function(index, obj){
		$(this).attr('disabled', 'disabled');
		$(this).addClass('bggray');
	})
	//处理按钮（上传图片按钮、移除记住标准按钮、添加计租标准按钮）
	if(!noButton){
		var buttons = dom.find('button');
		buttons.each(function(index, obj){
			$(this).remove();
		})
	}
	
}

/**
 * 将页面转为详情页面(不删除按钮)
 * input textarea加readonly并变灰，select转input并变灰，特殊按钮删除等
 */
function transferPageToCheckOnlyButtonIgnore(){
	//限制input
	var inputs = $('#formSubmit').find('input');
	inputs.each(function(index, obj){
		$(this).attr('readonly', 'readonly');
		$(this).addClass('bggray');
		$(this).removeAttr('onclick');
	})
	//限制textarea
	var textareas = $('#formSubmit').find('textarea');
	textareas.each(function(index, obj){
		$(this).attr('readonly', 'readonly');
		$(this).addClass('bggray');
	})
	//转select为input
	var selects = $('#formSubmit').find('select');
	selects.each(function(index, obj){
		$(this).attr('disabled', 'disabled');
		$(this).addClass('bggray');
	})
	
}

/**
 * 查询所有的场地类型信息
 * @param selectedId
 */
function getAllSpacePriceStrandList(selectedId, dom, rentalModelType){
	$.ajax({
		url:Utils.getRootPath()+"/spacePriceStrand/getAllSpacePriceStrandList",
		type:"get",
		dataType : "json",
		data:{rentalModelType:rentalModelType},
		success : function(data){
			if(data.success){
				$.each(data.obj, function(index,obj){
					if(obj.id+"" == selectedId){
						dom.append(
							"<option value='"+obj.id+"' selected>"+obj.spaceTypeName+"</option>"
						)
					}else{
						dom.append(
							"<option value='"+obj.id+"'>"+obj.spaceTypeName+"</option>"
						)
					}
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

/**
 * 查询所有的楼栋信息
 * @param selectedId
 */
function getAllBuildingInfoList(selectedId, dom, buildingType){
	$.ajax({
		url:Utils.getRootPath()+"/buildingInfo/getAllBuildingInfoList",
		type:"get",
		dataType : "json",
		data:{buildingType:buildingType},
		success : function(data){
			if(data.success){
				$.each(data.obj, function(index,obj){
					if(obj.id+"" == selectedId){
						dom.append(
								"<option value='"+obj.ID+"' selected>"+obj.BUILDINGNAME+"</option>"
						)
					}else{
						dom.append(
								"<option value='"+obj.ID+"'>"+obj.BUILDINGNAME+"</option>"
						)
					}
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

/**
 * 加载数据字典
 * @param dom
 * @param tableName
 * @param selectedId
 */
function getSelectedDicListByTableName(dom, tableName, selectedId, decodeByArray, exceptData){
	$.ajax({
		url:Utils.getRootPath()+"/commonType/getAllCommonTypeListByName",
		type:"post",
		dataType : "json",
		data:{tableName:tableName, decodeByList:decodeByArray, exceptData:exceptData},
		success : function(data){
			if(data.success){
				dom.empty();
				$.each(data.obj, function(index,obj){
					if(obj.id+"" == selectedId){
						dom.append(
								"<option value='"+obj.id+"' selected>"+obj.name+"</option>"
						)
					}else{
						dom.append(
								"<option value='"+obj.id+"'>"+obj.name+"</option>"
						)
					}
				})
			}else{
//				new TipBox({type:'tip',str:data.msg,clickDomCancel:true,setTime:1200});
			}
		}
	});
}

function in_array(arr, obj){
	var i = arr.length;
  while (i--) {
    if (arr[i] === obj) {
      return true;
    }
  }
  return false;
}

//验证表单
function commonFormValidate(form){
	return form.valid();
}

//加载loading遮罩层
function loading(type){
	if(isEmpty(type))
		return layer.load();
	else
		return layer.load(type);
}

//关闭弹出层
function closeLayerWindow(index){
	layer.close(index);
}

//提示框
function showbsMsg(msg, type, showCloseButton){
	var type = isEmpty(type)?'success':'error';
	var msg;
	if(isEmpty(msg)){
		msg = type == 'success'?'操作成功':'操作失败';
	}
//	var showCloseButton = isEmpty(showCloseButton)?false:true;
	parent.Messenger().post({
	 message: msg,
	 type: type,
     showCloseButton: true
  });	
}
//重新加载layer数据网格
function reloadLayerTable(selector){
	layui.use('table', function(){
		var table = layui.table;
		var selector = isEmpty(selector)?'datagrid':selector;
		table.reload(selector,{});
	});
}

/**
 * 验证手机号：移动电话
 * @param object
 */
function checkVfMobile(object){
	var phone = object.value;
    var patrn = /^(\+?0?86\-?)?1[345789]\d{9}$/;
    //判断phone是否为空
    if(phone.length !=0){
    	if (0 <= phone.indexOf(' ')) {
          $(object).after('<span class="help-block"><font color="#CC0033">手机号不能有空格！<font></span>');
  		$(object).css(errCssSpan);
          return false;
      } else if (!patrn.exec(phone)) {
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的手机号！<font></span>');
		$(object).css(errCssSpan);
        return false;
      } else {
        object.placeholder = '';
        return true;
      }
    }else{
    	return true;
    }
}
/**
 * 验证电子邮箱
 * @param object
 */
function checkVfEmail(object){
	var email = object.value;
	var patrn = /^([a-z0-9A-Z]+[_|-|\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\.)+[a-zA-Z]{2,}$/;
    if (email.length != 0) {
    	if (0 <= email.indexOf(' ')) {
	        $(object).after('<span class="help-block"><font color="#CC0033">邮箱不能有空格！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else if (!patrn.exec(email)) {
	        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的邮箱！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else {
	        object.placeholder = '';
	        return true;
	    }
    }else{
    	return true;
    }
}
/**
 * 验证邮政编码
 * @param object
 */
function checkVfZip(object){
	var zip = object.value;
	var patrn = /^[0-9][0-9]{5}$/;
    if (zip.length != 0) {
    	if (0 <= zip.indexOf(' ')) {
	        $(object).after('<span class="help-block"><font color="#CC0033">邮政编码不能有空格！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else if (!patrn.exec(zip)) {
	        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的邮政编码！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else {
	        object.placeholder = '';
	        return true;
	    }
    }else{
    	return true;
    }
}
/**
 * 验证区号
 * @param object
 */
function checkVfQh(object){
	var qh = object.value;
	var patrn = /^[0-9]{3,4}$/;
	if (qh.length != 0) {
		if (0 <= qh.indexOf(' ')) {
	        $(object).after('<span class="help-block"><font color="#CC0033">区号不能有空格！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else if (!patrn.exec(qh)) {
	        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的区号！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else {
	        object.placeholder = '';
	        return true;
	    }
	}else{
		return true;
	}
}
/**
 * 验证座机号
 * @param object
 */
function checkVfTel(object){
	var tel = object.value;
	var patrn = /^[0-9]{7,8}$/;
	if (tel.length != 0) {
		if (0 <= tel.indexOf(' ')) {
	        $(object).after('<span class="help-block"><font color="#CC0033">电话不能有空格！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else if (!patrn.exec(tel)) {
	        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的固定电话！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else {
	        object.placeholder = '';
	        return true;
	    }
	}else{
		return true;
	}
}
/**
 * 验证分机号
 */
function checkVfDisTel(object){
	var tel = object.value;
	var patrn = /^[0-9]{3,4}$/;
	if (tel.length != 0) {
		if (0 <= tel.indexOf(' ')) {
	        $(object).after('<span class="help-block"><font color="#CC0033">分机号不能有空格！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else if (!patrn.exec(tel)) {
	        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的分机号！<font></span>');
			$(object).css(errCssSpan);
	        return false;
	    } else {
	        object.placeholder = '';
	        return true;
	    }
	}else{
		return true;
	}
}

function isEmpty(obj){
	if(obj == undefined || obj == null || obj == "" || obj == "undefined"){
		return true;
	}else{
		return false;
	}
}

function trimStr(str){return str.replace(/(^\s*)|(\s*$)/g,"");}

function trimBrStr(str){return str.replace(/\n/g,"");}

function checkTel(object) {
	var phone = object.value;
    var patrn = /^(\+?0?86\-?)?1[345789]\d{9}$/;
    if (phone.length == 0) {
//        object.placeholder = "手机号不能为空！";
//        $(object).after('<span class="help-block"><font color="#CC0033">手机号不能为空！<font></span>')
//		$(object).css(errCssSpan);
        return true;
    } else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "手机号不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">手机号不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的手机号！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的手机号！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}



function checkPwd(object) {
	var phone = object.value;
//	var patrn = /^(?![a-zA-z]+$)(?!\d+$)(?![!@#$%^&*]+$)(?![a-zA-z\d]+$)(?![a-zA-z!@#$%^&*]+$)(?![\d!@#$%^&*]+$)[a-zA-Z\d!@#$%^&*]+$/;
//	var patrn = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,}$/;
//	var patrn = /^(?!\d+$)(?![a-zA-Z]+$)(?![a-zA-Z-`=\\;',./~!@#$%^&*()_+|{}:"<>?]+$)(?![0-9-`=\\;',./~!@#$%^&*()_+|{}:"<>?]+$)/;
	var patrn = /^((?!\d+$)(?![a-zA-Z]+$)[a-zA-Z\d@#$%^&_+].{7,})+$/;
	if (phone.length == 0) {
//        object.placeholder = "固定电话不能为空！";
		$(object).after('<span class="help-block"><font color="#CC0033">密码不能为空！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "固定电话不能有空格！";
		$(object).after('<span class="help-block"><font color="#CC0033">密码不能有空格！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的固定电话！";
		$(object).after('<span class="help-block"><font color="#CC0033">密码至少8位，必有字母和数字！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else {
		object.placeholder = '';
		return true;
	}
}

function checkLTel(object) {
	var phone = object.value;
    var patrn = /^((\d{3,4}\-)|)\d{7,8}(|([-\u8f6c]{1}\d{1,5}))$/;
    if (phone.length == 0) {
//        object.placeholder = "固定电话不能为空！";
        $(object).after('<span class="help-block"><font color="#CC0033">固定电话不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "固定电话不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">固定电话不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的固定电话！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的固定电话！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

function checkEmail(object) {
	var phone = object.value;
	var patrn = /^([a-z0-9A-Z]+[_|-|\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\.)+[a-zA-Z]{2,}$/;
    if (phone.length == 0) {
//        object.placeholder = "邮箱不能为空！";
        $(object).after('<span class="help-block"><font color="#CC0033">邮箱不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "手机号不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">邮箱不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的手机号！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的邮箱！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

function checkWordOnly(object) {
	var phone = object.value;
    var patrn = /^[\u4E00-\u9FA5]{1,}$/;
    if (phone.length == 0) {
//        object.placeholder = "不能为空！";
        $(object).after('<span class="help-block"><font color="#CC0033">文本不能为空！<font></span>');
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">文本不能有空格！<font></span>');
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的文字！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的文字！<font></span>');
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

function checkNumOnly(object) {
	var phone = object.value;
    var patrn = /^\d{1,}$/;
    if (phone.length == 0) {
//        object.placeholder = "数字不能为空！";
        $(object).after('<span class="help-block"><font color="#CC0033">数字不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">数字不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的文字！";
    	object.setCustomValidity('请输入正确的11位电话号码');
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的数字！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

function checkPositiveNumOnly(object) {
	var phone = object.value;
	var patrn = /^\+?[1-9]\d*$/;;
	if (phone.length == 0) {
//        object.placeholder = "数字不能为空！";
		$(object).after('<span class="help-block"><font color="#CC0033">整数不能为空！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "不能有空格！";
		$(object).after('<span class="help-block"><font color="#CC0033">整数不能有空格！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的文字！";
		$(object).after('<span class="help-block"><font color="#CC0033">请输入正确的正整数！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else {
		object.placeholder = '';
		return true;
	}
}

function checkPrice(object) {
	var phone = object.value;
	if(phone.indexOf(',') > 0)
		phone = phone.replace(/,/g,'');
//	var patrn = /^\d+(?:\.\d{1,2})?$/;
	var patrn = /^(-)?\d{0,14}(\.\d{1,2})?$/;
	if (phone.length == 0) {
//        object.placeholder = "数字不能为空！";
		$(object).after('<span class="help-block"><font color="#CC0033">数字不能为空！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "不能有空格！";
		$(object).after('<span class="help-block"><font color="#CC0033">数字不能有空格！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的文字！";
		$(object).after('<span class="help-block"><font color="#CC0033">请输入正确的数字！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else {
		object.placeholder = '';
		return true;
	}
}

function checkFourDotNum(object) {
	var phone = object.value;
	var patrn = /^(-)?0$|^(-)?[1-9]\d{0,15}$|^(-)?[1-9]\d{0,15}\.{1}\d{1,4}$|^(-)?0\.{1}\d{1,4}$/;
	if (phone.length == 0) {
//        object.placeholder = "数字不能为空！";
		$(object).after('<span class="help-block"><font color="#CC0033">小数不能为空！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "不能有空格！";
		$(object).after('<span class="help-block"><font color="#CC0033">小数不能有空格！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的文字！";
		$(object).after('<span class="help-block"><font color="#CC0033">至少4位小数！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else {
		object.placeholder = '';
		return true;
	}
}

function checkPriceNegativeAllow(object) {
	var phone = object.value;
	var patrn = /^(-)?\d+(\.\d+)?$/;
	if (phone.length == 0) {
//        object.placeholder = "数字不能为空！";
		$(object).after('<span class="help-block"><font color="#CC0033">数字不能为空！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "不能有空格！";
		$(object).after('<span class="help-block"><font color="#CC0033">数字不能有空格！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的文字！";
		$(object).after('<span class="help-block"><font color="#CC0033">请输入正确的数字！<font></span>')
		$(object).css(errCssSpan);
		return false;
	} else {
		object.placeholder = '';
		return true;
	}
}



function checkTelWithoutNull(object) {
	var phone = object.value;
    var patrn = /^(\+?0?86\-?)?1[345789]\d{9}$/;
    if (phone.length == 0) {
    	return true;
    }else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "手机号不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">手机号不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的手机号！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的手机号！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

function checkLTelWithoutNull(object){
	var phone = object.value;
    var patrn = /^((\d{3,4}\-)|)\d{7,8}(|([-\u8f6c]{1}\d{1,5}))$/;
    if (phone.length == 0) {
    	return true;
    }else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "固定电话不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">固定电话不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
//        object.placeholder = "请输入正确的固定电话！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的固定电话！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

function checkURL(object){
	var phone = object.value;
	var qqq="((http|ftp|https)://)(([a-zA-Z0-9\._-]+\.[a-zA-Z]{2,6})|([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}))(:[0-9]{1,4})*(/[a-zA-Z0-9\&%_\./-~-]*)?";
//	var patrn = "^((https|http|ftp|rtsp|mms)?://)"         
//		        + "?(([0-9a-zA-Z_!~*'().&=+$%-]+: )?[0-9a-zA-Z_!~*'().&=+$%-]+@)?" //ftp的user@        
//		        + "(([0-9]{1,3}\.){3}[0-9]{1,3}" // IP形式的URL- 199.194.52.184        
//		        + "|" // 允许IP和DOMAIN（域名）        
//		        + "([0-9a-zA-Z_!~*'()-]+\.)*" // 域名- www.        
//		        + "([0-9a-zA-Z][0-9a-zA-Z-]{0,61})?[0-9a-zA-Z]\." // 二级域名        
//		        + "[a-zA-Z]{2,6})" // first level domain- .com or .museum        
//		        + "(:[0-9]{1,4})?" // 端口- :80        
//		        + "((/?)|"         
//		        + "(/[0-9a-zA-Z_!~*'().;?:@&=+$,%#-]+)+/?)$";  
	
	var re=new RegExp(qqq);        
	var result = re.test(phone);
    if (phone.length == 0) {
    	$(object).after('<span class="help-block"><font color="#CC0033">请求地址不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    }else if (0 <= phone.indexOf(' ')) {
//        object.placeholder = "固定电话不能有空格！";
        $(object).after('<span class="help-block"><font color="#CC0033">请求地址不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!result) {
//        object.placeholder = "请输入正确的固定电话！";
        $(object).after('<span class="help-block"><font color="#CC0033">请输入正确的请求地址！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

//验证项目名称
function checkProjectName(object) {
	var phone = object.value;
//    var patrn = /^[\u4e00-\u9fa5]{5,}$|^.{10,}$/;
	var patrn = /^.{5,}$/;
    if (phone.length == 0) {
    	$(object).after('<span class="help-block"><font color="#CC0033">项目名不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
    	$(object).after('<span class="help-block"><font color="#CC0033">项目名不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (phone.length < 5) {
    	$(object).after('<span class="help-block"><font color="#CC0033">5个字符以上！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
        $(object).after('<span class="help-block"><font color="#CC0033">必填5位以上！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

//验证文本框
function checkTextArea(object) {
	var phone = object.value;
//    var patrn = /^[\u4e00-\u9fa5]{5,}$|^.{10,}$/;
	var patrn = /^.{10,}$/;
    if (phone.length == 0) {
    	$(object).after('<span class="help-block"><font color="#CC0033">内容不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
    	$(object).after('<span class="help-block"><font color="#CC0033">内容不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (phone.length < 5) {
    	$(object).after('<span class="help-block"><font color="#CC0033">10个字符以上！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!patrn.exec(phone)) {
        $(object).after('<span class="help-block"><font color="#CC0033">必填10位以上！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}
//验证15位整数加2位小数
function checkjva(object) {
	var phone = object.value;
//    var patrn = /^[\u4e00-\u9fa5]{5,}$|^.{10,}$/;
	var patrn = /^(-)?\d{0,14}(\.\d{1,2})?$/;
    if (phone.length == 0) {
    	$(object).after('<span class="help-block"><font color="#CC0033">数字不能为空!<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (0 <= phone.indexOf(' ')) {
    	$(object).after('<span class="help-block"><font color="#CC0033">内容不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    }  else if (!patrn.exec(phone)) {
        $(object).after('<span class="help-block"><font color="#CC0033">输入类型不匹配或长度超过限制<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}

//验证输入文本最小长度
function checkMinimumLength(minimumLength, object) {
	var phone = trimBrStr(object.value);
//    var patrn = /^[\u4e00-\u9fa5]{5,}$|^.{10,}$/;
	var patrn = '.{'+minimumLength+',}';
	var reg = new RegExp(patrn);
    if (phone.length == 0) {
    	$(object).after('<span class="help-block"><font color="#CC0033">内容不能为空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } /*else if (0 <= phone.indexOf(' ')) {
    	$(object).after('<span class="help-block"><font color="#CC0033">内容不能有空格！<font></span>')
		$(object).css(errCssSpan);
        return false;
    }*/else if (Utils.isEmpty(phone.replace(/ /g,''))) {
    	$(object).after('<span class="help-block"><font color="#CC0033">内容不能都是空！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else if (!phone.match(reg)) {
        $(object).after('<span class="help-block"><font color="#CC0033">必填'+minimumLength+'位以上！<font></span>')
		$(object).css(errCssSpan);
        return false;
    } else {
        object.placeholder = '';
        return true;
    }
}



//给li下拉选项添加点击事件
function clickLi(obj){
	//$(".entrpCodeInput").val($(obj).attr("code"));
	$(obj).parent('.entrpDiv').prev().find('.entrpCodeInput').val($(obj).attr("code"));
}
//给li下拉选项添加点击事件
function clickNameLi(obj){
	//$(".entrpNameInput").val($(obj).attr("punitName"));//获得选中的名称
	$(obj).parent('.entrpDiv').prev().find('.entrpNameInput').val($(obj).attr("punitName"));//获得选中的名称
	//$(".entrpNameCode").val($(obj).attr("code"));//获得选中的代码
	$(obj).parent('.entrpDiv').prev().find('.entrpNameCode').val($(obj).attr("code"));//获得选中的代码
	var allParentsNode = $(obj).parents();
	allParentsNode.each(function(){
		if($(this).is('form')){
			var idStr = $(this).attr('id');
			if(idStr == 'searchFormId'){
				searchmore();
			}
			if(idStr == 'searchFormId_children'){
				searchmore_chaldren();
			}
			if(idStr == 'searchFormId2'){
				searchmore2();
			}
		}
	})
	
}

//填报月份页面上显示处理 
//strs为时间字符串 
function writeDeal(date,type){

	 var strs=""+date+"";
	 strs=strs.split("-");
	 var year=strs[0];
	 var month=strs[1];
	 var day=strs[2];
//	 if(month==10&&day<21){
//		 month=9;
//	 }
	 if(type=='月报'&&(month==1&&day<9)){
		 year=year-1;
		 month=12;
	 }
	 else if(type=='月报'&&(month!=1&&day<9)){
		 month=month-1;
	 }
	 if(!isEmpty(month)){
		 var time;
		 if(type=='月报'){
			 time=year+"年"+(month-0)+"月"; 
		 }else if(type=='半年报'){
			 if(month==7){
				 time=year+"年半年报调整";  	 
			 }
		 }else if(type=='年报'){
			 if(month==1||month==2){
				 time=(year-1)+"年年报调整"; 	
			 }
		 }
		 return time; 
	 }else{
		 return year+"年合计";
	 }
}
//处理报送期
function dealtime(date){
	if(!isEmpty(date)){
	 var strs=""+date+"";
	 strs=strs.split("-");
	 var year=strs[0];
	 var month=strs[1];
	 var day=strs[2];
	 if(month==1&&day<9){
		 year=year-1;
		 month=12;
	 }
	 else if(month!=1&&day<9){
		 month=month-1;
	 }
	 time=year+"-"+month;
	
	 return time;
	}else{
		return '';
	}
}
/**
 * 选中年份时间
 * @param aaa
 */
function chooseYear(aaa){
	$(aaa).datetimepicker({  
        startView: 'decade',  
         minView: 'decade',  
         format: 'yyyy',  
         maxViewMode: 2,  
         minViewMode:2,  
         startDate: -Infinity,
         endDate :year,
         autoclose: true  
     });
}

function loadNumInput(){
	$(".intValue").bind('input propertychange', function() {
		if($(this).css("textAlign")=="right"){
			$(this).css("textAlign","left");
		}
		var value = $(this).val();
		var re = /^[+-]?[1-9]?[0-9]*$/;
		if(!re.test(value) && value != "" &&  value != "0" &&  value != "-" &&  value != "+"){
			$(this).val(oldValue);
		}
	}).click(function(){
		if($(this).css("textAlign")=="right"){
			$(this).css("textAlign","left");
			var t = $(this).val();
			$(this).val("").focus().val(t);
		}
	}).keydown(function(){
		oldValue = $(this).val();
	}).blur(function(){
		var val = $(this).val();
		if(val == "" || val == "-" || val == "+"){
			$(this).val("0");
		}
		$(this).css("textAlign","right");
	});
	
	
	$(".doubleValue").bind('input propertychange', function() {
		if($(this).css("textAlign")=="right"){
			$(this).css("textAlign","left");
		}
		var value = $(this).val();
		var re = /^[+-]?[1-9]?[0-9]*$/ ;  
		var re2 = /^[+-]?[1-9]?[0-9]*\.[0-9]*$/ ; 
		if(!re2.test(value) && !re.test(value) && value != "" &&  value != "0" &&  value != "-" &&  value != "+"){
			$(this).val(oldValue);
		}
	}).click(function(){
		if($(this).css("textAlign")=="right"){
			$(this).css("textAlign","left");
			var t = $(this).val();
			$(this).val("").focus().val(t);
		}
	}).keydown(function(){
		oldValue = $(this).val();
	}).blur(function(){
		var val = $(this).val();
		if(val == "" || val == "0" || val == "-" || val == "+"){
			$(this).val("0.0");
		}
		$(this).css("textAlign","right");
	});
	
}
/**
 * 验证是否可修改
 * @param nowDate：系统当前时间
 * @param fillDate：填报时间
 * @param recordType：填报类型
 */
function checkEditStatus(nowDate,fillDate,recordType){
	//判断recordType类型
//	if(recordType == "半年报"|| recordType == "年报"){
//		return true;
//	}
	var showNowDate = writeDeal(nowDate,recordType);
	var showFillDate = writeDeal(fillDate,recordType);
	//判断是否 相等
	console.log(nowDate+"---"+fillDate);
	console.log(showNowDate+"-"+showFillDate);
	if(showNowDate != showFillDate){
		return false;
	}else{
		return true;
	}
	
	
}

//将数字添加千分符
function toThousands(num) {
    var result = '0', counter = 0;
    if(!isEmpty(num)){
    	/*if(!isNaN(num))
    		num = parseFloat(num).toFixed(2);*/
    	num = (num || 0).toString();
    	if(num.indexOf(',') > 0)
    		num = num.replace(/,/g,'');
    	var isBelowZero = false;
    	if(num.indexOf('-') == 0){
    		isBelowZero = true;
    		num = num.substring(1);
    	}
    	var re=/\d{1,3}(?=(\d{3})+$)/g;
    	var n1=num.replace(/^(\d+)((\.\d+)?)$/,function(s,s1,s2){return s1.replace(re,"$&,")+s2;});
    	if(isBelowZero)
    		n1 = '-'+n1;
    	return n1;
    }
    return result;
}

//将数字去除千分符
function removeThousands(num) {
    return isEmpty(num)?'0':num.replace(/,/g, '');
}

function isNum(val){
	  var reg = /^[0-9]+.?[0-9]*$/;
	  if (reg.test(val)) {
	    return true;
	  }
	  return false;
}
function getFloat(num){
	if(!Utils.isEmpty(num) && !isNaN(num)){
		return parseFloat(num).toFixed(2);
	}else if(isNaN(num)){
		return num;
	}
	else{
		return 0.0;
	}
}
/**
 * 获取合计行在datgrid中的行数
 * @param yearNum
 * 			当前合计行年份
 * @param rows
 * 			数据集
 * @param index
 * 			当前合计索引
 */
function getTotalRowNum(yearNum,rows,index){
	if(index == 0){
		return 0;
	}
	for(var i=0;i<rows.length;i++){
		var yearStr = writeDeal(rows[i].TIME,rows[i].RECORDTYPENAME);
		if(yearStr.indexOf(yearNum)>=0){
			index = i;
			break;
		}
	}
	return index;
}
//方法2：填报类型字段名称不同
function getTotalRowNum1(yearNum,rows,index){
	if(index == 0){
		return 0;
	}
	for(var i=0;i<=rows.length;i++){
		var yearStr = writeDeal(rows[i].TIME,rows[i].WRITETYPE);
		if(yearStr.indexOf(yearNum)>=0){
			index = i;
			break;
		}
	}
	return index;
}

function isContainsChineseWord(str){
	var result = false;
	for(var i = 0;i < str.length; i++){
		if(str.charCodeAt(i) > 255){
			result = true;
			break;
		}
	}
	return result;
}