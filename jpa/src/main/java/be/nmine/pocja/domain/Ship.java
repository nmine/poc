package be.nmine.pocja.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ship {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double tonnage;

    @OneToMany(mappedBy = "cruise", fetch = FetchType.EAGER)
    Collection<Reservation> reservations = new ArrayList<Reservation>();

    public Ship() {
    }

    public Ship(String name, double tonnage) {
	this.name = name;
	this.tonnage = tonnage;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getTonnage() {
	return tonnage;
    }

    public void setTonnage(double tonnage) {
	this.tonnage = tonnage;
    }

    public int getId() {
	return id;
    }

    public Collection<Reservation> getReservations() {
	return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
	this.reservations = reservations;
    }

}
