package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class StockItem extends Model {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @ManyToOne
    public Warehouse warehouse;
    @Id
    public Long id;
    @ManyToOne
    public Product product;
    public Long quantity;

    public StockItem() {
	super();

    }

    public static void createItems() {
	for (int i = 0; i < 10; i++) {
	    StockItem item = new StockItem();
	    item.quantity = 0L + i * 100;
	    // Ebean.save(item);
	}
    }

    public static Finder<Long, StockItem> find() {
	return new Finder<Long, StockItem>(Long.class, StockItem.class);
    }

    @Override
    public String toString() {
	return String.format("StockItem %d - %dx product %s", id, quantity, product == null ? null : product.id);
    }

}
