/**
 * 文件上传
 * foreignId: 文件关联外键
 * dgId: 页面datagrid ID
 */
fileUpload = function(foreignId, dgId)
{
    WebFilesUploader(
    {
        _webuploader:{
            server: Utils.getRootPath() + '/fileUpload',
            swf: Utils.getRootPath() + '/resources/plugins/webupload/webfilesuploader/Uploader.swf',
			chunkSize:1024 * 1024 *10,//10M
       		allowMinBreakPointResumeSize:1024 * 1024 *15,//15M
       		verifyChunk:Utils.getRootPath() + '/verifyChunk',
       		verify:Utils.getRootPath() + '/verify',
       		merger:Utils.getRootPath() + '/merger'
        }
    },
    function(jsons)
    {
        jQuery.each(jsons, function (k, v) {
            var url = Utils.getRootPath() + "/attachment/upload";
            var UUID = v.UUID;
            var originalFilename = v.originalFilename;
            var fileSuffix = v.fileSuffix;
            jQuery.ajax({
                url : encodeURI(url),
                type: "post",
                cache : false,
                data:{
                	foreignId:foreignId,
                	UUID:UUID,
                	originalFilename:originalFilename,
                	fileSuffix:fileSuffix
                },
                success: function(){
                	if(dgId && $("#"+dgId)){
                		$("#"+dgId).datagrid("reload");
                	}
                }
            });
        });
    });
    $(window).resize();
};

/**
 * 文件下载
 */
fileDownload = function(foreignId, dgId) {
	var sessionExpire = false;
	$.ajax({
		url: Utils.getRootPath() + "/login/getSessionUser",
		type: "post",
		dataType: "json",
		async: false,
		success: function(data){
			if(!data.loginName){
				sessionExpire = true;
				window.location.href=Utils.getRootPath() + "/login";
			}
		},
		error:function(){
			sessionExpire = true;
			alert("error")
		}
	})
	if(sessionExpire){
		return ;
	}
    var url = Utils.getRootPath() + "/attachment/downloadlist/" + foreignId;
    if(dgId){
    	url += "?dgId=" + dgId;
    }
    $("#fileListDialog").dialog('open').dialog('center')
    .dialog('setTitle','文件下载列表')
	.dialog('refresh',url);
};
