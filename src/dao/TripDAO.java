
package dao;

import java.util.ArrayList;

import domain.Trip;
import domain.User;

public interface TripDAO {
	
	

	/**
	 * Find all the trips with same destination and add this into a array
	 * @param country
	 * @param region
	 * @param town
	 * @return A array list which contains the trips with the same destination
	 */
	public ArrayList<Trip> findByDestination(String country, String region, String town);
	
	/**
	 * Find the driver by his email
	 * @param mail
	 * @return the user which belong the email
	 */
	public User findByDriver(String mail);
	
	/**
	 * Add a trip to the data
	 * @param new_trip
	 * @return true if it succeeds
	 */
	public boolean addNewTrip(Trip new_trip);
	
	
}
