package be.nmine.designpatterns.creational.abstractFactory;

//Client
public class GUIBuilder
{
 public void buildWindow(AbstractWidgetFactory widgetFactory)
 {
    Window window = widgetFactory.createWindow();   
    window.setTitle("New Window");
 }
}
