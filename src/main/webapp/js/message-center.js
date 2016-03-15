$(function(){
	Unread();
})

function Unread(){
	alert(G_ROOTURL+"jobinfo/unread");
	mui.ajax(G_ROOTURL+"jobinfo/unread",{
		dataType:'json',
		type:'get',
		success:function(data){
			var unread = $("#unread");
			$.each(data, function(k,v) {
				var listr = "";
				listr   += "<li class='mui-table-view-cell'>"
					+ "<div class='mui-slider-right mui-disabled'>"
					+ "<a class='mui-btn mui-btn-red mui-icon mui-icon-star'></a>"
					+ "<a class='mui-btn mui-btn-grey mui-icon mui-icon-trash'></a>"
					+ "</div>"
					+ "<div class='mui-slider-handle'>"
					+ v.title
					+ "</div>"
					+ "</li>"
				unread.append(listr);
			});
		}
	});
}
