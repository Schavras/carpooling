<<<<<<< .mine
package dao;

import java.util.ArrayList;

import domain.Trip;


public interface TripDAO {
	
	

	/**
	 * Find all the trips with same destination and add this into a array
	 * @param country
	 * @param region
	 * @param town
	 * @return A array list which contains the trips with the same destination
	 */
	public ArrayList<Trip> findByDestination(String country, String region, String town);
	
}
=======
package dao;

import domain.Place;
import domain.Trip;

//TODO add javadoc
public interface TripDAO {
	
	public Trip findByPlace(Place place);
}
>>>>>>> .r152
