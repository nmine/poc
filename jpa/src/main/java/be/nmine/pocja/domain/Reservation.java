package be.nmine.pocja.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "AMOUNT_PAID")
    private float amount;
    @Column(name = "DATE_RESERVED")
    private Date date;
    @ManyToOne
    // @JoinColumn(name = "CRUISE_ID")
    private Cruise cruise;
    @ManyToMany
    @JoinTable(name = "RESERVATION_CUSTOMER", joinColumns = { @JoinColumn(name = "RESERVATION_ID") }, inverseJoinColumns = { @JoinColumn(name = "CUSTOMER_ID") })
    private Set<Customer> customers;
    @ManyToMany
    @JoinTable(name = "CABIN_RESERVATION", joinColumns = { @JoinColumn(name = "RESERVATION_ID") }, inverseJoinColumns = { @JoinColumn(name = "CABIN_ID") })
    private Set<Cabin> cabins;
    @OneToOne(orphanRemoval = true, cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    @JoinColumn(name = "binary_data_fr_fk")
    private BinaryData document;

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
