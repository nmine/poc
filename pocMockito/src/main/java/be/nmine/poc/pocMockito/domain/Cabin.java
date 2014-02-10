package be.nmine.poc.pocMockito.domain;


public class Cabin {
    private int id;
    private String name;
    private int bedCount;
    private int deskLevel;
    private Ship ship;

    public Cabin() {
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getBedCount() {
	return bedCount;
    }

    public void setBedCount(int bedCount) {
	this.bedCount = bedCount;
    }

    public int getDeskLevel() {
	return deskLevel;
    }

    public void setDeskLevel(int deskLevel) {
	this.deskLevel = deskLevel;
    }

    public Ship getShip() {
	return ship;
    }

    public void setShip(Ship ship) {
	this.ship = ship;
    }

    public int getId() {
	return id;
    }

}
