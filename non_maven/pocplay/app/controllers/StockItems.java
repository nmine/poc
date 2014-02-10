package controllers;

import java.util.List;

import models.StockItem;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class StockItems extends Controller {

    @Transactional
    public static Result index() {
	List<StockItem> items = StockItem.find().where().ge("quantity", 300).orderBy("quantity").setMaxRows(10).findList();
	StringBuilder stringBuilder = new StringBuilder("");
	for (StockItem item : items) {
	    stringBuilder.append(" \n" + item.toString());
	}
	return ok("");
    }

    // @Transactional
    public static Result create() {
	StockItem.createItems();
	return redirect(routes.StockItems.index());
    }

}