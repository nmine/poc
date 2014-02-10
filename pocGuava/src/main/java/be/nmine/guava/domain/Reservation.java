package be.nmine.guava.domain;

import java.util.Date;
import java.util.Set;

public class Reservation {
    private int id;
    private float amount;
    private Date date;
    private Cruise cruise;
    private Set<Customer> customers;
    private Set<Cabin> cabins;

    public Reservation() {
    }

    public Reservation(Cruise cruise) {
	super();
	this.cruise = cruise;
    }

    public Reservation(float amount, Date date) {
	super();
	this.amount = amount;
	this.date = date;
    }

    public float getAmount() {
	return amount;
    }

    public void setAmount(float amount) {
	this.amount = amount;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public Cruise getCruise() {
	return cruise;
    }

    public void setCruise(Cruise cruise) {
	this.cruise = cruise;
    }

    public int getId() {
	return id;
    }

}
