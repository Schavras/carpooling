package service;

import java.sql.Driver;
import java.util.ArrayList;

import domain.Place;
import domain.Trip;

public class Search {
	
	private static ArrayList<Trip> results ;
	
		
	public static ArrayList<Trip> searchByPlace(Place place, ArrayList<Trip> trips){
		results =  new ArrayList<Trip>() ;
		for (int i =0 ; i < trips.size();i++){
			if(trips.get(i).getDestination().equals(place)){
				results.add(trips.get(i));
			}
		}
		return results;
	}
	
	public static ArrayList<Trip> searchByDriver(Driver driver, ArrayList<Trip> trips){
		results =  new ArrayList<Trip>() ; 
		for (int i =0 ; i < trips.size();i++){
			if(trips.get(i).getDriver().equals(driver)){
				results.add(trips.get(i));
			}
		}
		return results;
	}
}
