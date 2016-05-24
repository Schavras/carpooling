package memorydao;

import java.util.ArrayList;
import java.util.List;


import dao.UserDAO;
import domain.Place;
import domain.Trip;
import domain.User;

public class UserMemoryDAO implements UserDAO  {
	
	protected static List<User> users = new ArrayList<User>();
	
	//TODO se alli klasi
	protected static List<Trip> trips = new ArrayList<Trip>(); 
	
	@Override
	public User getByEmail(String email) {
		
		// User ni=new User();
		 int k=-1;
		// users.add(ni);
		 //TODO kanto na girnaei ton user me to pou ton vrei, min psaxnei olo ton pinaka, kathe user einai mia fora mono
		 for (int i = 0; i<users.size(); i++){
			 k=users.indexOf(email);
		 }
		 if(k == -1){
			// System.out.println("User not found");
			 return null;
		 }else{
			 return users.get(k);
		 }
	}

	//TODO Min kaneis elexno ama iparxei idi, apla na to prostheteis
	@Override
	public boolean newUser(User new_user) {
		
		int k=1;
		for (int i = 0; i<users.size(); i++){
			// TODO equals anti gia ==
			 if(users.get(i).getEmail()==new_user.getEmail()){
				 k=-1;
			 }
		 }
		if (k==-1){
			return false;
		}else{
		users.add(new_user);
		return true;
		}
	}
	
	
	//TODO valto se alli ksexoristi klasi mazi me to list trips, kai alakse to onoma se findByPlace
	public List<Trip> find(String country, String region, String town){
		
		Place the_place=new Place(country,region,town);
		ArrayList<Trip> the_trips = new ArrayList<Trip>(); 
		
		for (int i = 0; i<users.size(); i++){
			//TODO equals anti gia ==
			if(trips.get(i).getDestination()==the_place){
				the_trips.add(trips.get(i));
			}
		 }
		return the_trips;
	}

}
