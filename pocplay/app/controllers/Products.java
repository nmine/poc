package controllers;

import java.util.Set;

import models.Address;
import models.Product;
import models.StockItem;
import models.Warehouse;
import play.api.templates.Html;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;

import com.avaje.ebean.Ebean;

//@Catch
//@With(Secure.class)
public class Products extends Controller {

    private static final Form<Product> productForm = Form.form(Product.class);

    // @BodyParser.Of(BodyParser.Json.class)
    @Transactional
    public static Result index() {
	// RequestBody body = request().body();
	// return ok("Here is the body we received: " + body);
	return redirect(routes.Products.list(1));
    }

    @Transactional
    public static Result create() {
	Product.createItems();
	return redirect(routes.Products.list(1));
    }

    @Transactional
    public static Result list(Integer page) {
	Set<Product> products = Product.find().findSet();
	Html renderedTemplate = views.html.products.list.render(products, play.i18n.Messages.get("welcome"));
	return ok(renderedTemplate);
    }

    public static Result newProduct() {
	return ok(views.html.products.details.render(productForm));
    }

    @Transactional
    public static Result details(Long id) {
	final Product product = Product.find().byId(id);
	if (product == null)
	    return notFound(String.format("Product %s does not exist.", id));
	Form<Product> filledForm = productForm.fill(product);
	return ok(views.html.products.details.render(filledForm));
    }

    @Transactional
    public static Result save() {
	Form<Product> boundForm = productForm.bindFromRequest();
	Product product = boundForm.get();

	if (boundForm.hasErrors()) {
	    flash("error", "Please correct the form below.");
	    return badRequest(views.html.products.details.render(boundForm));
	}
	StockItem item = new StockItem();
	item.quantity = 0L;
	item.product = product;
	Warehouse warehouse = new Warehouse();
	warehouse.name = "main warehouse";
	warehouse.stock.add(item);
	Address address = new Address();
	address.city = "bruxelles";
	address.warehouse = warehouse;
	warehouse.address = address;
	Ebean.save(product);
	Ebean.save(address);
	Ebean.save(item);
	Ebean.save(warehouse);
	// List<Tag> tags = new ArrayList<Tag>();
	// for (Tag tag : product.tags) {
	// if (tag.id != null) {
	// tags.add(Tag.findById(tag.id));
	// }
	// }
	// product.tags = tags;
	// product.save();
	flash("success", String.format("Successfully added product %s", product));
	return redirect(routes.Products.list(1));
    }

}
