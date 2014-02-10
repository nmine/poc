package be.nmine.guava.domain;


public class Cruise {

    private int id;
    private String name;
    private Ship ship;

    public Cruise() {
    }

    public Cruise(String name, Ship ship) {
	super();
	this.name = name;
	this.ship = ship;
    }

    public int getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Ship getShip() {
	return ship;
    }

    public void setShip(Ship ship) {
	this.ship = ship;
    }

}
