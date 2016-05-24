package memorydao;

import java.util.ArrayList;


import dao.UserDAO;
import domain.User;


public class UserMemoryDAO implements UserDAO  {
	
	protected static ArrayList<User> users = new ArrayList<User>();
	 
	
	@Override
	public User getByEmail(String email) {
		

		 for (int i = 0; i<users.size(); i++){
			 if(users.get(i).getEmail().equals(email)){
				 return users.get(i);
			 } 	
		 }
		 return null;
	}


	@Override
	public boolean newUser(User new_user) {
		return users.add(new_user);
		
		}

}
