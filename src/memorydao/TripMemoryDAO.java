package memorydao;

import java.util.ArrayList;


import dao.TripDAO;
import domain.Place;
import domain.Trip;
import domain.User;
import types.Email;

public class TripMemoryDAO implements TripDAO {
	
	protected static ArrayList<Trip> trips = new ArrayList<Trip>();
	
	public ArrayList<Trip> findByDestination(String country, String region, String town){
		
		Place the_place=new Place(country,region,town);
		ArrayList<Trip> the_trips = new ArrayList<Trip>(); 
		
		for (int i = 0; i<trips.size(); i++){
			if(trips.get(i).getDestination().equals(the_place)){ 
				the_trips.add(trips.get(i));
			}
		 }
		return the_trips;
	}
	
	
	public User findByDriver(Email mail){
		for (int i = 0; i<UserMemoryDAO.users.size(); i++){
			if(UserMemoryDAO.users.get(i).getEmail().getFullEmailAdress().equals(mail)){
				return UserMemoryDAO.users.get(i);
			}
		 }
		return null;
	}
	
	
	public boolean addNewTrip(Trip new_trip){
		//TODO to be commit 
		return true;
	}
	
}
	

