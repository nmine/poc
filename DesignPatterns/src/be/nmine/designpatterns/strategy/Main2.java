package be.nmine.designpatterns.strategy;

import be.nmine.designpatterns.strategy.behavior.fly.FlyNoWay;
import be.nmine.designpatterns.strategy.behavior.quack.QuackWithStuff;
//pattern strategy , HAS-A is preferred at IS-A relation
//the goal is to separate all changing behavior
//inherit involve that all the sub class have the behavior of the class parent
//by separing changing behavior we can give special comportment at some classes
//interface is preferred to inherit in this pattern
public class Main2 {
	public static void main(String[] args) {
		Duck duck = new SpecialDuck();
		//give the behavior implementation
		duck.setFlyBehavior(new FlyNoWay());
		duck.setQuackBehavior(new QuackWithStuff());
		//test the behavior
		duck.performFly();
		duck.performQuack();
	}
}
