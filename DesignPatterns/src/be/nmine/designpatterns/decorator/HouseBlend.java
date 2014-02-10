package be.nmine.designpatterns.decorator;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		this.description = "House Blend Coffee";
	}

	public double cost() {
		return .50;
	}
}