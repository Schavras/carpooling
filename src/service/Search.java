package service;

import java.util.ArrayList;

import domain.Driver;
import domain.Place;

public class Search {
	
	private static ArrayList<Driver> results ;
	
		
	public static ArrayList<Driver> searchByPlace(Place place, ArrayList<Driver> trips){
		results =  new ArrayList<Driver>() ;
		for (int i =0 ; i < trips.size();i++){
			if(trips.get(i).getTrip().getDestination().equals(place)){
				results.add(trips.get(i));
			}
		}
		return results;
	}
	
	public static ArrayList<Driver> searchByDriver(Driver driver, ArrayList<Driver> trips){
		results =  new ArrayList<Driver>() ; 
		for (int i =0 ; i < trips.size();i++){
			if(trips.get(i).equals(driver)){
				results.add(trips.get(i));
			}
		}
		return results;
	}
}
