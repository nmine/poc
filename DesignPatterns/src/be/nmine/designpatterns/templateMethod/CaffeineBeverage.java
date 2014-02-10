package be.nmine.designpatterns.templateMethod;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		if(custormerWantsCondiments()) {
			addCondiments();
		}
	}
	abstract void brew();
	abstract void addCondiments();
	void boilWater() {
		System.out.println("Boiling water");
	}
	void pourInCup() {
		System.out.println("Pourring into cup");
	}
	boolean custormerWantsCondiments() {
		return true;
	}
	
}
