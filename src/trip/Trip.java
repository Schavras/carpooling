/**
 * 
 */
package trip;


import java.util.Date;

import place.Place;
import types.currency.Currency;
import user.Driver;
import user.User;
/**
 * @author schavras
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
	 * the Driver
	 */
	private Driver driver;
	
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
	private boolean isOpen;
	
	/**
	 * checks if the trip is completed
	 */
	private boolean isCompleted;
	
	
	/**
	 * @param id
	 * @param startingPoint
	 * @param destination
	 * @param driver
	 * @param dateOfDeparture
	 * @param totalPrice
	 * @param isOpen
	 * @param isCompleted
	 */
	public Trip(long id, Place startingPoint, Place destination, Driver driver, Date dateOfDeparture, Currency totalPrice,
			boolean isOpen, boolean isCompleted) {
		this.id = id;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.driver = driver;
		this.dateOfDeparture = dateOfDeparture;
		this.totalPrice = totalPrice;
		this.isOpen = isOpen;
		this.isCompleted = isCompleted;
	}

	/**
	 * 
	 */
	public Trip() {
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the startingPoint
	 */
	public Place getStartingPoint() {
		return startingPoint;
	}

	/**
	 * @param startingPoint the startingPoint to set
	 */
	public void setStartingPoint(Place startingPoint) {
		this.startingPoint = startingPoint;
	}

	/**
	 * @return the destination
	 */
	public Place getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Place destination) {
		this.destination = destination;
	}

	/**
	 * @return the driver
	 */
	public Driver getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	/**
	 * @return the dateOfDeparture
	 */
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	/**
	 * @param dateOfDeparture the dateOfDeparture to set
	 */
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	/**
	 * @return the totalPrice
	 */
	public Currency getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Currency totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the isOpen
	 */
	public boolean isOpen() {
		return isOpen;
	}

	/**
	 * @param isOpen the isOpen to set
	 */
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * @return the isCompleted
	 */
	public boolean isCompleted() {
		return isCompleted;
	}

	/**
	 * @param isCompleted the isCompleted to set
	 */
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfDeparture == null) ? 0 : dateOfDeparture.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (isCompleted ? 1231 : 1237);
		result = prime * result + (isOpen ? 1231 : 1237);
		result = prime * result + ((startingPoint == null) ? 0 : startingPoint.hashCode());
		result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (isCompleted != other.isCompleted)
			return false;
		if (isOpen != other.isOpen)
			return false;
		if (startingPoint == null) {
			if (other.startingPoint != null)
				return false;
		} else if (!startingPoint.equals(other.startingPoint))
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice))
			return false;
		return true;
	}
	
	
	
}
