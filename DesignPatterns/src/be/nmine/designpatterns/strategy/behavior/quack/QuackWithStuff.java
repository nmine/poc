package be.nmine.designpatterns.strategy.behavior.quack;

public class QuackWithStuff implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("quack with stuff");
	}

}
