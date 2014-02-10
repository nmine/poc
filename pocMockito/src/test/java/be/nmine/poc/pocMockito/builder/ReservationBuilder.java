package be.nmine.poc.pocMockito.builder;

import java.util.Calendar;
import java.util.Date;

import be.nmine.poc.pocMockito.domain.Reservation;

public class ReservationBuilder {

    private static final int DEFAULT_AMMOUNT = 2;
    private static final Date DEFAULT_DATE = Calendar.getInstance().getTime();

    private int amount = DEFAULT_AMMOUNT;
    private Date date = DEFAULT_DATE;

    public Reservation build() {
	Reservation reservation = new Reservation();
	reservation.setAmount(amount);
	reservation.setDate(date);
	return reservation;
    }

    public ReservationBuilder withAmount(int amount) {
	this.amount = amount;
	return this;
    }

    public ReservationBuilder withDate(Date date) {
	this.date = date;
	return this;
    }

}
