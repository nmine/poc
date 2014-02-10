package builder;

import be.nmine.pocja.domain.Cabin;
import be.nmine.pocja.domain.Ship;

public class CabinBuilder {

    public static final String DEFAULT_NAME = "Cabin1";
    private static final int DEFAULT_DESK_LEVEL = 1;
    private static final int DEFAULT_BEDCOUNT = 2;

    private int bedCount = DEFAULT_BEDCOUNT;
    private String name = DEFAULT_NAME;
    private int deskLevel = DEFAULT_DESK_LEVEL;

    private Ship ship = new Ship();

    public Cabin build() {
	Cabin cabin = new Cabin();
	cabin.setBedCount(bedCount);
	cabin.setDeskLevel(deskLevel);
	cabin.setName(name);
	cabin.setShip(ship);
	return cabin;
    }

    public CabinBuilder withBedCount(int bedCount) {
	this.bedCount = bedCount;
	return this;
    }

    public CabinBuilder withName(String name) {
	this.name = name;
	return this;
    }

    public CabinBuilder withDeskLevel(int deskLevel) {
	this.deskLevel = deskLevel;
	return this;
    }

    public CabinBuilder withShip(Ship ship) {
	this.ship = new Ship();
	return this;
    }
}
