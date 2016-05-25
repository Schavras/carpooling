package dao;

import java.util.List;
import domain.Request;
import domain.Trip;
import domain.User;

/**
 * Data access object for loading and
 * manupulating the requests
 *
 */
public interface RequestDAO {

	/**
	 * Adds the new {@link Request}
	 * @param req
	 * @return True if succeded
	 */
	boolean addRequest(Request req);
	
	/**
	 * Removes a {@link Request}
	 * @param req The request to be deleted
	 * @return true if succeded
	 */
	boolean removeRequest(Request req);
	
	
	/**
	 * Get all the {@link Request} for a specific trip
	 * @param trip
	 * @return
	 */
	List<Request> getRequestsByTrip(Trip trip);
	
	/**
	 * Get all the {@link Request} for a specific user
	 * @param user
	 * @return
	 */
	List<Request> getRequestsByUser(User user);
	
}
