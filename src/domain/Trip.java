/**
 * 
 */
package domain;


import java.util.ArrayList;
import java.util.Date;

import types.currency.Currency;



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
	private ArrayList<User> travelers;
	
	/**
	 *  The maximum number of wanted travelers
	 */
	private int maxTravelers;
	
	/**
	 * The driver of the trip
	 */
	private User driver;
	
	/**
	 * List of request to be approved or rejected
	 */
	private ArrayList<Request> pendingRequest;
	
	private ArrayList<PickUp> pickups;
	
	/**
	 * Constructor
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
	 * @param driver
	 */
	public Trip(long id, Place startingPoint, Place destination, Date dateOfDeparture, Currency totalPrice, int maxTravelers, User driver) {
		this.id = id;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.dateOfDeparture = dateOfDeparture;
		this.totalPrice = totalPrice;
		status=EnumTripStatus.OPEN;
		this.maxTravelers=maxTravelers;
		travelers = new ArrayList<User> ();
		this.driver= driver;
		pendingRequest = new ArrayList<Request>();
		pickups= new ArrayList<PickUp>();
		
	}
 
	/**
	 * 
	 */
	public Trip() {
		
	}

	public void addRequest(Request req){
		pendingRequest.add(req);
	}
	
	
	
	public boolean acceptRequest(Request req){
		if(travelers.size() < maxTravelers){
			travelers.add(req.getUser());
			
			pickups.add(createPickup(req));
			pendingRequest.remove(req);
			return true;
		}
		return false;
		
	}
	
	public User getDriver() {
		return driver;
	}

	public void setDriver(User driver) {
		this.driver = driver;
	}

	public ArrayList<Request> getPendingRequest() {
		return pendingRequest;
	}

	public void setPendingRequest(ArrayList<Request> pendingRequest) {
		this.pendingRequest = pendingRequest;
	}

	public ArrayList<PickUp> getPickups() {
		return pickups;
	}

	public void setPickups(ArrayList<PickUp> pickups) {
		this.pickups = pickups;
	}

	private PickUp createPickup(Request req) {
		PickUp temp = new PickUp(req.getPlace(), req.getPickUpDateAndTime(), dateOfDeparture, 0 , req.getUser());
		return temp;

	}

	public boolean rejectRequest(Request req){
		pendingRequest.remove(req);
		return true;
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

	public ArrayList<User> getTravelers() {
		return travelers;
	}

	public void setTravelers(ArrayList<User> travelers) {
		this.travelers = travelers;
	}

	public int getMaxTravelers() {
		return maxTravelers;
	}

	public void setMaxTravelers(int maxTravelers) {
		this.maxTravelers = maxTravelers;
	}

	public Currency getCostPerTraveller(){
		float cost = totalPrice.getValue() / maxTravelers ;
		Currency perTraveller = new Currency(cost, totalPrice.getcName());
		return perTraveller;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfDeparture == null) ? 0 : dateOfDeparture.hashCode());
		result = prime * result
				+ ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + maxTravelers;
		result = prime * result
				+ ((pendingRequest == null) ? 0 : pendingRequest.hashCode());
		result = prime * result + ((pickups == null) ? 0 : pickups.hashCode());
		result = prime * result
				+ ((startingPoint == null) ? 0 : startingPoint.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((totalPrice == null) ? 0 : totalPrice.hashCode());
		result = prime * result
				+ ((travelers == null) ? 0 : travelers.hashCode());
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
		if (driver == null) {
			if (other.driver != null)
				return false;
		} else if (!driver.equals(other.driver))
			return false;
		if (id != other.id)
			return false;
		if (maxTravelers != other.maxTravelers)
			return false;
		if (pendingRequest == null) {
			if (other.pendingRequest != null)
				return false;
		} else if (!pendingRequest.equals(other.pendingRequest))
			return false;
		if (pickups == null) {
			if (other.pickups != null)
				return false;
		} else if (!pickups.equals(other.pickups))
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
