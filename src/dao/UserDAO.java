package dao;

import domain.User;


public interface UserDAO {
	
	
	
	/**
	 * Find and return the user, based on his email.
	 * If no user found on with this email, return {@code null}
	 * @param email : The email of the user to be searched
	 * @return The user with this email, {@code null} if not found
	 */
	public User getByEmail(String email);
	
	
	
}
