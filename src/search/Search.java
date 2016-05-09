package search;

import java.util.ArrayList;

import place.Place;
import user.Driver;

public class Search {
	
	private static ArrayList<Driver> results= new ArrayList<Driver>() ;
	
		
	public static ArrayList<Driver> search(Place place, ArrayList<Driver> trips){
		for (int i =0 ; i < trips.size();i++){
			if(trips.get(i).getTrip().getDestination().equals(place)){
				results.add(trips.get(i));
			}
		}
		return results;
	}
}
