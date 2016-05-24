package memorydao;

import java.util.ArrayList;


import dao.UserDAO;
import domain.User;


public class UserMemoryDAO implements UserDAO  {
	
	protected static ArrayList<User> users = new ArrayList<User>();
	 
	
	@Override
	public User getByEmail(String email) {
		
		// User ni=new User();
		 int k=-1;
		// users.add(ni);
		 for (int i = 0; i<users.size(); i++){
			 k=users.indexOf(email);
			 
		 }
		 if(k == -1){
			 System.out.println("User not found");
			 return null;
		 }else{
			 return users.get(k);
		 }
	}

	@Override
	public boolean newUser(User new_user) {
		
		return users.add(new_user);
		}

}
