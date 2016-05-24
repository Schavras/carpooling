package memorydao;

import java.util.ArrayList;


import dao.TripDAO;
import domain.Place;
import domain.Trip;
import domain.User;
import types.Email;

public class TripMemoryDAO implements TripDAO {
	
	protected static ArrayList<Trip> trips = new ArrayList<Trip>();
	protected static ArrayList<User> users = new ArrayList<User>();
	
	public ArrayList<Trip> findByDestination(String country, String region, String town){
		
		Place the_place=new Place(country,region,town);
		ArrayList<Trip> the_trips = new ArrayList<Trip>(); 
		
		for (int i = 0; i<users.size(); i++){
			if(trips.get(i).getDestination().equals(the_place)){
				the_trips.add(trips.get(i));
			}
		 }
		return the_trips;
	}
	
	public User findByDriver(Email mail){
		for (int i = 0; i<users.size(); i++){
			if(users.get(i).getEmail().equals(mail)){
				return users.get(i);
			}
		 }
		return null;
	}
	}
	

