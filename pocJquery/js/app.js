define(function() {
	App = new Backbone.Marionette.Application();
	
	
	App.addRegions({
		mainRegion: "#listingPerson"
	});
	
	Person = Backbone.Model.extend({});
	
	Persons = Backbone.Collection.extend({
		  model: AngryCat,
	});
	
	PersonView = Backbone.Marionette.ItemView.extend({
		  template: "#angry_cat-template",
		  tagName: 'tr',
		  className: 'angry_cat'
	});
		  
	
	PersonsView = Backbone.Marionette.CompositeView.extend({
		  tagName: "table",
		  id: "person",
		  className: "table-striped table-bordered",
		  template: "#persons-template",
		  itemView: PersonView,
		  
		  appendHtml: function(collectionView, itemView){
		    collectionView.$("tbody").append(itemView.el);
		  }
		});
	
	
});