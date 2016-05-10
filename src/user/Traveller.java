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
		 request = new Request();
		 address = new AddressPlace();
		trip = new Trip();
		 traveller=new User();
		 
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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((request == null) ? 0 : request.hashCode());
		result = prime * result + ((traveller == null) ? 0 : traveller.hashCode());
		result = prime * result + ((trip == null) ? 0 : trip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Traveller other = (Traveller) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (request == null) {
			if (other.request != null)
				return false;
		} else if (!request.equals(other.request))
			return false;
		if (traveller == null) {
			if (other.traveller != null)
				return false;
		} else if (!traveller.equals(other.traveller))
			return false;
		if (trip == null) {
			if (other.trip != null)
				return false;
		} else if (!trip.equals(other.trip))
			return false;
		return true;
	}
	
	
}
