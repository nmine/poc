package be.nmine.designpatterns.visitor;

//Element interface
public interface Visitable
{
  public void accept(Visitor visitor);
}