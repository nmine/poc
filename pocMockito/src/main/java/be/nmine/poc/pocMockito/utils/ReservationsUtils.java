package be.nmine.poc.pocMockito.utils;

import be.nmine.poc.pocMockito.domain.Reservation;

public class ReservationsUtils {

    public static float returnReservationAmount(Reservation reservation) {
	return reservation.getAmount();
    }
}
