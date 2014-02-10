package be.nmine.poc.pocMockito.services;

import be.nmine.poc.pocMockito.domain.Reservation;

public interface ReservationService {
    float getReservationAmount(Reservation reservation);
}
