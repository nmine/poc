package be.nmine.guava.builder;

import be.nmine.guava.domain.Ship;

public class ShipBuilder {

    private static final String DEFAULT_NAME = "Ship1";
    private static final int DEFAULT_TONNAGE = 10000;

    private String name = DEFAULT_NAME;
    private int tonnage = DEFAULT_TONNAGE;

    public Ship build() {
	Ship ship = new Ship();
	ship.setName(name);
	ship.setTonnage(tonnage);
	return ship;
    }

    public ShipBuilder withName(String name) {
	this.name = name;
	return this;
    }

    public ShipBuilder withTonnage(int tonnage) {
	this.tonnage = tonnage;
	return this;
    }
}
