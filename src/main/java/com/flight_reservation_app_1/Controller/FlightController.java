package com.flight_reservation_app_1.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_1.Repository.FlightRepository;
import com.flight_reservation_app_1.entity.Flight;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy")Date departureDate, Model model){
		List<Flight> findFlights = flightRepo.findFlights(from,to,departureDate);
		model.addAttribute("findFlights", findFlights);
		return "displayFlights";
	}
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, Model Model) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		Model.addAttribute("flight", flight);
		return "showReservation";
	}

}
