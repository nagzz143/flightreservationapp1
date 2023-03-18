package com.flight_reservation_app_1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_1.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
