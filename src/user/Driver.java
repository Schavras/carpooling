/**
 * 
 */
package user;

import car.Car;
import request.DriverRequestList;
import request.EnumStatus;
import trip.Trip;

/**
 *
 */
public class Driver{
	/**
	 * User information
	 */
	private User user;
	
	/**
	 * The driver's car
	 */
	private Car car;
	
	private DriverRequestList requests;
	
	private Trip trip;
	/**
	 * @param user
	 * @param car
	 */
	public Driver(User user, Car car, Trip trip) {
		this.user = user;
		this.car = car;
		requests = new DriverRequestList();
		this.trip= trip;
	}
	
	/**
	 * Add new request as new Traveller object
	 * @param req
	 */
	public void addRequest(Traveller req){
		requests.add(req);
	}
	
	/**
	 * Approve the i pending request, by changing it status, generate and settin new 
	 * approval code, and add the traveller in the trip's list
	 * @param i
	 */
	public void approveRequest(int i){
		requests.get(i).getRequest().setStatus(EnumStatus.APPROVED);
		requests.get(i).getRequest().setApprovalCode(requests.get(i).getRequest().nextApprovalCode());
		trip.addTraveler(requests.get(i));
	//	requests.remove(i);
		
	}
	
	
	/**
	 * Reject the i pending request, by setting it;s status to REJECTED, and 
	 * removing it from pending requests
	 * @param i
	 */
	public void declineRequest(int i){
		requests.get(i).getRequest().setStatus(EnumStatus.REJECTED);
		requests.remove(i);		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public DriverRequestList getRequests() {
		return requests;
	}

	public void setRequests(DriverRequestList requests) {
		this.requests = requests;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((requests == null) ? 0 : requests.hashCode());
		result = prime * result + ((trip == null) ? 0 : trip.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Driver other = (Driver) obj;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (requests == null) {
			if (other.requests != null)
				return false;
		} else if (!requests.equals(other.requests))
			return false;
		if (trip == null) {
			if (other.trip != null)
				return false;
		} else if (!trip.equals(other.trip))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
