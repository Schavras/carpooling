package service;

import java.util.ArrayList;
import java.util.List;

import memorydao.TripMemoryDAO;
import dao.TripDAO;
import domain.Place;
import domain.Trip;
import service.interfaces.SearchService;

public class SearchServiceImpl implements SearchService {

	TripDAO trips;
	ArrayList<Trip> results;
	
	
	/**
	 * Constractor of search service.
	 * @param trips Type of DAO object.
	 */
	public SearchServiceImpl(TripDAO trips) {
		this.trips = trips;
	}
	
	/**
	 * Default Constractor.
	 * Set DAO object to {@link TripMemoryDAO} .
	 */
	public SearchServiceImpl(){
		trips = new TripMemoryDAO();
	}



	@Override
	public ArrayList<Trip> searchByPlace(String country, String region, String town) {
		 results = new ArrayList<Trip>();
		Place place = new Place(country, region, town);
		results =  trips.findByDestination(place);
		return results;
	}

}
