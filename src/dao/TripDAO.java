package dao;

import domain.Place;
import domain.Trip;

//TODO add javadoc
public interface TripDAO {
	
	public Trip findByPlace(Place place);
}
