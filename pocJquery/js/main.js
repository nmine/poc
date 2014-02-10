require(["navigation", "models"], function(Navigation,Models) {
	var models = new Models();
	models.init();
	var nav = new Navigation();
	nav.init();
});