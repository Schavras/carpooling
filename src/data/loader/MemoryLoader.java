package data.loader;

import java.util.ArrayList;

import user.Driver;
import user.User;

public class MemoryLoader implements Loader {

	@Override
	public void load() {
		loadUsers();
		loadTrips();
	}

	

	@Override
	public ArrayList<User> loadUsers() {
		ArrayList<User> temp = new ArrayList<User>();
		temp.add(new User());
		return null;
	}
	
	@Override
	public ArrayList<Driver> loadTrips() {
		// TODO Auto-generated method stub
		return null;
	}

}
