package be.nmine.designpatterns.creational.factory;

//concrete implementation of the Logger (Product) 
public class XMLLogger implements Logger {

	public void log(String message) {
		//log to xml
		System.err.println("logging");
	}

}
