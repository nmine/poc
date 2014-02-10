package be.nmine.poc.pocMockito.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Ship {
    private int id;
    private String name;
    private double tonnage;

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
