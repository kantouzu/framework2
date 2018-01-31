$(function() {
	
	$.fn.combotree.defaults.loadFilter = $.fn.tree.defaults.loadFilter; //这里要加上，否则combotree不会生效
	
	if(!Utils.isEmpty(isCheckOnly)){
		//查看详情页面，将所有空间置为disabled
		$('input').attr('disabled','disabled');
		$('select').attr('disabled','disabled');
		$('textarea').attr('disabled','disabled');
	}
	
	var parentId = $("#parentId").val();
	
	Utils.combotree({
		url : Utils.getRootPath() + "/menuController/getMenuLayerTree?parentId="+parentId,
		selfId : $("#id").val(),
		parentDom : $("#parentId")
	})
	
})

