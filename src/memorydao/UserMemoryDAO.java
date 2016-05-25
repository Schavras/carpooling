package memorydao;

import java.util.ArrayList;



import types.CreditCard;
import types.Email;
import types.Password;
import dao.UserDAO;
import domain.User;


public class UserMemoryDAO implements UserDAO  {
	
	protected static ArrayList<User> users = new ArrayList<User>();
	 
	
	@Override
	public User getByEmail(String email) {
		

		 for (int i = 0; i<users.size(); i++){
			 if(users.get(i).getEmail().getFullEmailAdress().equals(email)){
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
