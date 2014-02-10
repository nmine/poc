package be.nmine.designpatterns.creational.abstractFactory;

//ConcreteFactory1
public class MsWindowsWidgetFactory
{
 //create an MSWindow
 public Window createWindow()
 {
    MSWindow window = new MSWindow();   
    return window;
 }
}
