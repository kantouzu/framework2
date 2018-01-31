$(function() {
	$.fn.combotree.defaults.loadFilter = $.fn.tree.defaults.loadFilter; //这里要加上，否则combotree不会生效
	
	if(!Utils.isEmpty(isCheckOnly)){
		//查看详情页面，将所有空间置为disabled
		$('input').attr('disabled','disabled');
		$('select').attr('disabled','disabled');
		$('textarea').attr('disabled','disabled');
	}
	
	//渲染根地区
    Utils.getLocationInfoList({
    	dom : $('#rootIdLoc'),
    	parentId : '0',
    	selectedId : $('#rootId').val(),
    	emptySelection : true
    });
    
    $('#rootIdLoc').change(function(){
    	loadSubLocTree($(this).val());
    })
    
    if(!Utils.isEmpty($('#rootId').val())){
    	loadSubLocTree($('#rootId').val());
    }
})

function loadSubLocTree(rootId){
//	var index = Utils.loading();
	Utils.combotree({
		url : Utils.getRootPath() + "/locationInfoController/getLocLayerTree?parentId="+rootId,
		selfId : $("#rootId").val(),
		parentDom : $("#locId"),
		onLoadSuccess : function(){
			Utils.closeLayerWindow(index);
		},
		onLoadError : function(){
			Utils.closeLayerWindow(index);
		}
	})
}