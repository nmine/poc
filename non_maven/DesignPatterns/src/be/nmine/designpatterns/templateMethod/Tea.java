package be.nmine.designpatterns.templateMethod;

public class Tea extends CaffeineBeverage{
	@Override
	void brew() {
		System.out.println("Sleeping the tea");
		
	}
	@Override
	void addCondiments() {
		System.out.println("Pourring into cup");
		
	}
}
