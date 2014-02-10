package be.nmine.designpatterns.visitor;

import java.util.Arrays;


//concrete element 
public class Book implements Visitable
{ 
   private double price; 
   private double weight;
   
   

   public Book(double price, double weight) {
	super();
	this.price = price;
	this.weight = weight;
}

//accept the visitor
   public void accept(Visitor visitor)
   {
      visitor.visit(this);
   }

   public double getPrice()
   {
      return price;
   }

   public double getWeight()
   {
      return weight;
   }
   
   public static void main(String[] args) {
	Visitable book = new Book(5,5);
	Visitable book1 = new Book(5,5);
	Visitable book2 = new Book(5,5);
	ShoppingCart shoppingCart = new ShoppingCart(Arrays.asList(book,book1,book2));
	shoppingCart.calculatePostage();
}
} 
