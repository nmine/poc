package be.nmine.designpatterns.decorator.condiments;

import be.nmine.designpatterns.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
