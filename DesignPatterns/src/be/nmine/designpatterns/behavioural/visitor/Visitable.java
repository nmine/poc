package be.nmine.designpatterns.behavioural.visitor;

//Element interface
public interface Visitable
{
  public void accept(Visitor visitor);
}