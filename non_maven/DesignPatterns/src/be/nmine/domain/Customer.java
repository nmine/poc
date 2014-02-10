package be.nmine.domain;

import java.util.ArrayList;
import java.util.Collection;

import be.nmine.utils.Constants;


public class Customer {
    private int id;

    private String firstname;

    private String lastname;

    // by updating the int sex , the sexTypeInfo correct is choosen
    private SexTypeInfo sexTypeInfo;

    private int sex = Constants.Sex.MAN.getCode();

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
