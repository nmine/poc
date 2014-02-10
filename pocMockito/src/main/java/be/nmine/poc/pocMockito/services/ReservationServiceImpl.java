package be.nmine.poc.pocMockito.services;

import java.util.Date;

import be.nmine.poc.pocMockito.domain.Reservation;
import be.nmine.poc.pocMockito.utils.ReservationsUtils;

public class ReservationServiceImpl implements ReservationService {

    public float getReservationAmount(Reservation reservation) {
	return ReservationsUtils.returnReservationAmount(new Reservation(1f, new Date()));
    }

}
