/**
 * 
 */
package trip;


import java.util.ArrayList;
import java.util.Date;

import place.Place;
import types.currency.Currency;
import user.Traveller;


/**
 *
 */
public class Trip {
	
	
	/**
	 * the unique id of the trip
	 */
	private long id;
	
	/**
	 * The starting point of the trip
	 */
	private Place startingPoint;
	
	/**
	 * The destination point of the trip
	 */
	private Place destination;
	
		
	/**
	 * the date of departure
	 */
	private Date dateOfDeparture;
	
	/**
	 * the total cost of the trip
	 */
	private Currency totalPrice;
	
	/**
	 * Checks if the trip is still accepting requests
	 */
	private EnumTripStatus status;
	
	/**
	 * array of the travelers
	 */
	private ArrayList<Traveller> travelers;
	
	/**
	 *  The maximum number of wanted travelers
	 */
	private int maxTravelers;
	
	
	
	/**
	 * @param id
	 * @param startingPoint
	 * @param destination
	 * @param user
	 * @param car
	 * @param dateOfDeparture
	 * @param totalPrice
	 * @param isOpen
	 * @param isCompleted
	 * @param maxTravelers 
	 */
	public Trip(long id, Place startingPoint, Place destination, Date dateOfDeparture, Currency totalPrice, int maxTravelers) {
		this.id = id;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.dateOfDeparture = dateOfDeparture;
		this.totalPrice = totalPrice;
		status=EnumTripStatus.OPEN;
		this.maxTravelers=maxTravelers;
		travelers = new ArrayList<Traveller> ();
		
	}

	/**
	 * 
	 */
	public Trip() {
		
	}

	
	
	
	public boolean addTraveler(Traveller traveller){
		if (travelers.size()+1 <= maxTravelers){
			travelers.add(traveller);
			return true;
		}else{
			return false;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Place getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(Place startingPoint) {
		this.startingPoint = startingPoint;
	}

	public Place getDestination() {
		return destination;
	}

	public void setDestination(Place destination) {
		this.destination = destination;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Currency getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Currency totalPrice) {
		this.totalPrice = totalPrice;
	}


	public EnumTripStatus getStatus() {
		return status;
	}

	public void setStatus(EnumTripStatus status) {
		this.status = status;
	}

	public ArrayList<Traveller> getTravelers() {
		return travelers;
	}

	public void setTravelers(ArrayList<Traveller> travelers) {
		this.travelers = travelers;
	}

	public int getMaxTravelers() {
		return maxTravelers;
	}

	public void setMaxTravelers(int maxTravelers) {
		this.maxTravelers = maxTravelers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfDeparture == null) ? 0 : dateOfDeparture.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + maxTravelers;
		result = prime * result + ((startingPoint == null) ? 0 : startingPoint.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
		result = prime * result + ((travelers == null) ? 0 : travelers.hashCode());
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
		Trip other = (Trip) obj;
		if (dateOfDeparture == null) {
			if (other.dateOfDeparture != null)
				return false;
		} else if (!dateOfDeparture.equals(other.dateOfDeparture))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (id != other.id)
			return false;
		if (maxTravelers != other.maxTravelers)
			return false;
		if (startingPoint == null) {
			if (other.startingPoint != null)
				return false;
		} else if (!startingPoint.equals(other.startingPoint))
			return false;
		if (status != other.status)
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice))
			return false;
		if (travelers == null) {
			if (other.travelers != null)
				return false;
		} else if (!travelers.equals(other.travelers))
			return false;
		return true;
	}
	
	
	
	

	
}
