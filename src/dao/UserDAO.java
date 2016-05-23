package dao;

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
	 */	
	public boolean newUser(User new_user);
	
	
	
	
}
