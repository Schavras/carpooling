package dao;

import java.util.ArrayList;

import domain.Trip;
import domain.User;


public interface UserDAO {
	
	
	
	/**
	 * Find and return the  {@link domain.User user}, based on his email.
	 * If no user found on with this email, return {@code null}
	 * @param email : The email of the user to be searched
	 * @return The user with this email, {@code null} if not found
	 */
	public User getByEmail(String email);

	/**
	 * Adds a new {@link domain.User user} into users list
	 * @param new_user The new user
	 * @return True if the email didn't use in previous register and false if it used
	 */	
	public boolean newUser(User new_user);
	
	/**
	 * Find all the trips with same destination and add this into a array
	 * @param country
	 * @param region
	 * @param town
	 * @return A array list which contains the trips with the same destination
	 */
	public ArrayList<Trip> find(String country, String region, String town);
	
}
