package be.nmine.designpatterns.visitor;

import java.util.List;

public class ShoppingCart {
	// normal shopping cart stuff
	private List<Visitable> items;

	
	public ShoppingCart(List<Visitable> items) {
		super();
		this.items = items;
	}


	public double calculatePostage() {
		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Visitable item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		return postage;
	}

}
