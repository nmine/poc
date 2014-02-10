package be.nmine.designpatterns.strategy.behavior.fly;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Doesn't fly");
	}

}
