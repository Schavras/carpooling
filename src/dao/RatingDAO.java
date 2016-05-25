package dao;

import java.util.List;

import domain.Rating;
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
	List<Rating> getSummary(User user);
}
