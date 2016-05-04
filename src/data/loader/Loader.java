package data.loader;

import java.util.ArrayList;
import user.Driver;
import user.User;

public interface Loader {
	
	public void load();
	
	public ArrayList<Driver> loadTrips();
	
	public ArrayList<User> loadUsers();
	 
}
