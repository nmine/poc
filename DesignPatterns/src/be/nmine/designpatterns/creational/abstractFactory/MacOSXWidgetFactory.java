package be.nmine.designpatterns.creational.abstractFactory;

//ConcreteFactory2
public class MacOSXWidgetFactory
{
 //create a MacOSXWindow
 public Window createWindow()
 {
    MacOSXWindow window = new MacOSXWindow();   
    return window;
 }
}
