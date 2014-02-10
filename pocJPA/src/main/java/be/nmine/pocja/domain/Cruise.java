package be.nmine.pocja.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cruise {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "SHIP_ID")
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
