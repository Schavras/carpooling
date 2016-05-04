package user;

import place.AddressPlace;
import request.Request;
import trip.Trip;

public class Traveller {
	
	
	 /**
	  * 
	  */
	 private Trip trip;
	 
	 /**
	  *Traveler
	  */
	 private User traveller;
	 
	 /**
	  * pick up  place and address
	  */
	 private AddressPlace address;
	 
	 private Request request;
	 
	 //TODO na doume gia to time
	 public Traveller(User traveller,Driver driver, AddressPlace address, String comment){
		 request = new Request(comment);
		 this.address=address;
		 this.trip=driver.getTrip();
		 this.traveller=traveller;
		 
		 driver.addRequest(this);
		  
	 }

	public Traveller() {
		// TODO Auto-generated constructor stub
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public User getTraveller() {
		return traveller;
	}

	public void setTraveller(User traveller) {
		this.traveller = traveller;
	}

	public AddressPlace getAddress() {
		return address;
	}

	public void setAddress(AddressPlace address) {
		this.address = address;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	
}
