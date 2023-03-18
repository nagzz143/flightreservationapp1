package com.flight_reservation_app_1.service;

import com.flight_reservation_app_1.dto.ReservationRequest;
import com.flight_reservation_app_1.entity.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);

}
