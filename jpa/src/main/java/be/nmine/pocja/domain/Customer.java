package be.nmine.pocja.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import be.nmine.pocja.utils.Constants;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;

    private String firstname;

    private String lastname;

    // by updating the int sex , the sexTypeInfo correct is choosen
    @ManyToOne
    @JoinColumn(name = "sex", insertable = false, updatable = false)
    private SexTypeInfo sexTypeInfo;

    @Column(name = "sex")
    private int sex = Constants.Sex.MAN.getCode();

    @ManyToMany(mappedBy = "customers")
    private Collection<Reservation> reservations = new ArrayList<Reservation>();

    public Collection<Reservation> getReservations() {
	return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
	this.reservations = reservations;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public int getSex() {
	return sex;
    }

    public void setSex(int sex) {
	this.sex = sex;
    }

}
