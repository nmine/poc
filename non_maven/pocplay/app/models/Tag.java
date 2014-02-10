//package models;
//
//import java.util.Collection;
//import java.util.LinkedList;
//import java.util.List;
//
//import play.data.validation.Constraints.Required;
//import play.db.ebean.Model;
//
//public class Tag extends Model {
//    public Long id;
//    @Required
//    public String name;
//    public List<Product> products;
//
//    public Tag() {
//	// Left empty
//    }
//
//    private static List<Tag> tags = new LinkedList();
//
//    static {
//	tags.add(new Tag(1L, "lightweight", Product.findByName("paperclips")));
//	tags.add(new Tag(2L, "metal", Product.findByName("paperclips")));
//	tags.add(new Tag(3L, "plastic", Product.findByName("paperclips")));
//    }
//
//    public static Tag findById(Long id) {
//	for (Tag tag : tags) {
//	    if (tag.id == id)
//		return tag;
//	}
//	return null;
//    }
//
//    public Tag(Long id, String name, Collection<Product> products) {
//	this.id = id;
//	this.name = name;
//	this.products = new LinkedList(products);
//	for (Product product : products) {
//	    product.tags.add(this);
//	}
//    }
// }
