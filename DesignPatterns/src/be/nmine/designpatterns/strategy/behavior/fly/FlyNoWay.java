package be.nmine.designpatterns.strategy.behavior.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly with wings");
	}

}
