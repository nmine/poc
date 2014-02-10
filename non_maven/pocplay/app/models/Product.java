package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.libs.F;
import play.libs.F.Tuple;
import play.mvc.PathBindable;

import com.avaje.ebean.Ebean;

@Entity
public class Product extends Model implements PathBindable<Product> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    public Long id;
    // @DateFormat("MM-dd-yyyy")
    public Date date;
    // public List<Tag> tags = new LinkedList();
    // @Required
    // @Constraints.ValidateWith(EanValidator.class)
    public String ean;
    @Required
    public String name;
    public String description;
    @OneToMany(mappedBy = "product")
    public List<StockItem> stockItems;

    public Product() {
    }

    public static class EanValidator extends Constraints.Validator<String> {

	@Override
	public Tuple<String, Object[]> getErrorMessageKey() {
	    return new F.Tuple<String, Object[]>("error.invalid.ean", new String[] {});
	}

	@Override
	public boolean isValid(String value) {
	    String pattern = "^[0-9]{13}$";
	    return value != null && value.matches(pattern);
	}
    }

    public Product(String ean, String name, String description) {
	this.ean = ean;
	this.name = name;
	this.description = description;
    }

    public static void createItems() {
	for (int i = 0; i < 10; i++) {
	    Product product = new Product();
	    product.description = "description" + i;
	    product.name = "name" + i;
	    product.ean = "ean" + i;
	    Ebean.save(product);
	}
    }

    public static Finder<Long, Product> find() {
	return new Finder<Long, Product>(Long.class, Product.class);
    }

    @Override
    public String toString() {
	return String.format("%s - %s", ean, name);
    }

    @Override
    public Product bind(String key, String txt) {
	return null;
    }

    @Override
    public String unbind(String key) {
	return this.ean;
    }

    @Override
    public String javascriptUnbind() {
	return this.ean;
    }
}
