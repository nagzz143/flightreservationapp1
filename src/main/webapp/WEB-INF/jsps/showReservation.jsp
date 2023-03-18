<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
     <h2>Flight Details</h2>
	     Flight Number: ${flight.flightNumber}<br/>
	     Operating Airlines: ${flight.operatingAirlines}<br/>
	     Departure City: ${flight.DepartureCity}<br/>
	     Arrival City: ${flight.arrivalCity}<br/>
	     DepartureDate: ${flight.dateOfDeparture}<br/>
     
     <h2>Enter Passenger Details</h2>
	     <form action="confirmReservation" method="post">
		     <pre>
			     First Name<input type="text" name="firstName"/>
			     Last Name<input type="text" name="lastName"/>
			     Middle Name<input type="text" name="middleName"/>
			     Email<input type="text" name="email"/>
			     Phone<input type="text" name="phone"/>
			     <input type="hidden" name="flightId" value="${flight.id }"/>
			     
		<h2>Enter the payment Details</h2>	     
			     Card Holder Name<input type="text" name="cardHolderName"/>
			     Card Number<input type="text" name="cardNumber"/>
			     Cvv Code <input type="text" name="cvvCode"/>
			     Expiry Date<input type="text" name="expiryDate"/>
			     <input type="submit" value="complete reservation"/>
		     </pre>
	     </form>
</body>
</html>