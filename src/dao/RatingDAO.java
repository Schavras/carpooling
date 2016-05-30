package dao;

import java.util.ArrayList;

import domain.Rating;
import domain.RatingsSummary;
import domain.User;

/**
 * Data access object for loading and
 * manupulating the ratings
 *
 */
public interface RatingDAO {

	/**
	 * Gets all ratings for the specific user
	 * Makes an list with those and return it.
	 * @param user: The user to search for his ratings.
	 * @return A {@link List} of {@link Rating Ratings}
	 */
	ArrayList<Rating> getAllRatings(User user);
	
	void add(Rating rating);
	
	void remove(Rating rating);
	
	void remove (int index);
	
	double getAverage(User user);
	
	RatingsSummary getRatingsSummary(User user);
	
}
