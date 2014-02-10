package be.nmine.designpatterns.templateMethod;

public class Coffee extends CaffeineBeverage{
	
	@Override
	void brew() {
		System.out.println("DSripping Coffee through filter");
		
	}
	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
		
	}
	@Override
	boolean custormerWantsCondiments() {
		//implement some question to the user here
		return super.custormerWantsCondiments();
	}
}
