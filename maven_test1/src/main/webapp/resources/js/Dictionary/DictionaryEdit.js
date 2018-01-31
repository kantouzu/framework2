$(function() {
//	$.fn.combotree.defaults.loadFilter = $.fn.tree.defaults.loadFilter; //这里要加上，否则combotree不会生效
	
	if(!Utils.isEmpty(isCheckOnly)){
		//查看详情页面，将所有空间置为disabled
		$('input').attr('disabled','disabled');
		$('select').attr('disabled','disabled');
		$('textarea').attr('disabled','disabled');
	}
	
	$('#dicType').select2().on('change', function(e){
		$('#name').val(e.added.text);
	})
	
	/*var parentId = $("#parentId").val();
	$("#dics").combotree({
		url: Utils.getRootPath() + "/dictionaryController/getDicLayerTree?parentId="+parentId,
		idField:'id',
		textField:'name',
    	method:'post',
    	checkbox:true,
    	width:397,
    	height:32,
    	onSelect:function(d){
    		if(d){
    			var dicId = $("#id").val();
    			if(d.id == dicId){
    				Utils.showToastFail('不能选择自己为父级字典');
    				$('#dics').combotree('clear');
    				$("#parentId").val('');
    			}else{
		    		$("#parentId").val(d.id);
    			}
    		}
    	}
	});*/
})