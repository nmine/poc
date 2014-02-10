package be.nmine.designpatterns.behavioural.visitor;

//concrete element 
public class Book implements Visitable
{ 
 private double price; 
 private double weight;

 //accept the visitor
 public void accept(Visitor vistor)
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
} 
