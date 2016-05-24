
package dao;

import java.util.ArrayList;

import domain.Trip;
import domain.User;
import types.Email;


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
	public User findByDriver(Email mail);
	
}
