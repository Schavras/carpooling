package memorydao;

import java.util.ArrayList;

import types.CreditCard;
import types.Email;
import types.Password;
import dao.UserDAO;
import domain.User;

public class UserMemoryDAOStub implements UserDAO  {
	
	ArrayList<User> users;
	User newUser;
	public UserMemoryDAOStub(){
		users = new ArrayList<User>();
		users.add(new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true));
		users.add(new User(0, "Stavros", "Zarpas", new Email("invalid@email.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), false));
		users.add(new User(0, "name", "surname", new Email("some@email"), new Password("password"), 21, new CreditCard(420120420, "Eurobank"), true));
	}
	
	@Override
	public User getByEmail(String email) {
		if(email.equals("stavros.z@hotmail.com")){
			return users.get(0);
		}else if (email.equals("invalid@email.com")){			
			return users.get(1);
		}else if(email.equals("new@email")){
			return newUser;
		}else{
			return null;
		}
	}
	
	public User get(int index){
		return users.get(index);
	}

	@Override
	public boolean newUser(User new_user) {
		newUser=new_user;
		users.add(new_user);
		return true;
	}

}
