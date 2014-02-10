package builder;

import java.util.Arrays;
import java.util.Date;

import be.nmine.pocja.domain.Customer;
import be.nmine.pocja.domain.Reservation;
import be.nmine.pocja.utils.Constants;

public class CustomerBuilder {
    public static final String DEFAULT_FIRSTNAME = "Nicolas";
    public static final String DEFAULT_LASTNAME = "Mine";
    public static final int DEFAULT_SEX_CODE = Constants.Sex.WOMEN.getCode();

    public String firstName = DEFAULT_FIRSTNAME;
    public String lastName = DEFAULT_LASTNAME;
    public int sex = DEFAULT_SEX_CODE;

    public Customer build() {
	Customer customer = new Customer();
	customer.setFirstname(DEFAULT_FIRSTNAME);
	customer.setLastname(DEFAULT_LASTNAME);
	customer.setSex(Constants.Sex.MAN.getCode());
	customer.setReservations(Arrays.asList(new Reservation(1000, new Date()), new Reservation(1000, new Date())));
	return customer;
    }

    public CustomerBuilder withFirstName(String firstName) {
	this.firstName = firstName;
	return this;
    }

    public CustomerBuilder withLastName(String lastName) {
	this.lastName = lastName;
	return this;
    }

    public CustomerBuilder withSex(int code) {
	this.sex = code;
	return this;
    }
}
