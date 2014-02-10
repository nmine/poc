package be.nmine.designpatterns.strategy.behavior.quack;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("quack normaly");
	}
	
}
