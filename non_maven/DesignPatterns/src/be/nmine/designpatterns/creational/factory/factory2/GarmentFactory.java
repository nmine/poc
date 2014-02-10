package be.nmine.designpatterns.creational.factory.factory2;

import be.nmine.domain.Cabin;
import be.nmine.domain.Cruise;

public class GarmentFactory extends Factory{
	public Object createGarments(String selection) {
		if (("Cabin").equalsIgnoreCase(selection)) {
			return new Cabin();
		} else if (("Cruise").equalsIgnoreCase(selection)) {
			return new Cruise();
		}
		throw new IllegalArgumentException("Selection doesnot exist");
	}
	public static void main(String[] args) {
		Factory factory = new GarmentFactory();
		Object cabin = factory.createGarments("cabin");
		System.out.println( (cabin instanceof Cabin) ? "true" : "false");
	}
}

