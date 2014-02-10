package be.nmine.pocja.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cabin {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int bedCount;
    private int deskLevel;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SHIP_ID")
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
