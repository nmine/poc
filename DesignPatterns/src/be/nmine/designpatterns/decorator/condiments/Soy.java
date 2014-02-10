package be.nmine.designpatterns.decorator.condiments;

import be.nmine.designpatterns.decorator.Beverage;

public class Soy extends CondimentDecorator{
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	@Override
	public double cost() {
		return .25 + beverage.cost();
	}
}
