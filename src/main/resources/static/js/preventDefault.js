$(document).ready(function() {
	$(window).keydown(function(event) {

		if (event.keyCode == 13) {
			if (
					window.location.href.indexOf("login") > -1
					||
					window.location.href.indexOf("bhptickets/edit") > -1
					||
					window.location.href.indexOf("bhptickets/create") > -1
					||
					window.location.href.indexOf("bhptickets/show") > -1
					||
					window.location.href.indexOf("tools/createproject") > -1
					||
					window.location.href.indexOf("tools/editproject") > -1
					) {
				return;
			}
			else{
				event.preventDefault();
				return false;
			}

		}
	});
});