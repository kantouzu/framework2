$(function() {
	if(!Utils.isEmpty(isCheckOnly)){
		//查看详情页面，将所有空间置为disabled
		$('input').attr('disabled','disabled');
		$('select').attr('disabled','disabled');
		$('textarea').attr('disabled','disabled');
	}
	
	$('#roleCode').select2().on('change', function(e){
		$('#roleName').val(e.added.text);
	})
})