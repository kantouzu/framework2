$(function(){
	if(!Utils.isEmpty(Utils.getCookie('userName'))){
		$('#rememberMe').attr("checked","true");
		$('#login_username').val(Utils.getCookie('userName'));
	}
})

function keyLogin(){  
    if (event.keyCode==13)   //回车键的键值为13  
         document.getElementById("userLogin").click(); //调用登录按钮的登录事件  
}

function userLogin(){
	
//	var pathHref = window.location.href;
//	var projectUrl = '';
//	
//	var pathName = window.document.location.pathname;
//	var projectName = pathName
//			.substring(0, pathName.substr(1).indexOf('/') + 1);
//	
//	projectUrl = pathHref.substring(0, pathHref.indexOf(projectName) + projectName.length);
	var result = $("#loginForm").valid();
	if(result){
		$.ajax({
			url: Utils.getRootPath() + "/loginController/pcLogin",
			type : 'post',
			dataType: 'json',
			data: {
				userName:$('#login_username').val(),
				pwd:$('#login_pass').val(),
			},
			success: function(d){
				if(d.success){
					//检查是否选择记住我
					if($('#rememberMe').is(':checked')){
						Utils.setCookie('userName', $('#login_username').val());
					}
					window.location.href = Utils.getRootPath()+"/home";
				}else{
					showbsMsg(d.msg, 'error', true);
				}
			}
		});
	}
}