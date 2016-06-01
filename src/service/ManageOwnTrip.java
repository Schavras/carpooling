package service;

import dao.TripDAO;
import domain.AddressPlace;
import domain.PickUp;
import domain.Trip;

public class ManageOwnTrip {

	TripDAO trips;
	
	public void closeTrips(Trip my_trip){
		
		for(int i=0; i<my_trip.getTravelers().size();i++){
			my_trip.getPendingRequest()
		}
		
	}
	
	
	
}
