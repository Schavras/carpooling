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
	
	
	/*	
	 * TODO gia tin arxikopoiisi
	 * @Override
	public void loadUsers() {
		users.add(new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true));
		users.add(new User(1, "Nikos", "Papastamatakis", new Email("nikos.papastamatakis@gmail.com"), new Password("vaggelis"), 20, new CreditCard(420420421, "pireos"), true));
		users.add(new User(2, "Athanasia", "denThimame", new Email("athanasia@gmail.com"), new Password("lala"), 22, new CreditCard(426520421, "pireos"), true));
		users.add(new User(3, "Dwra", "Dervi", new Email("dwra.dervi@gmail.com"), new Password("dwroul"), 4, new CreditCard(1239871, "alfabank"), true));
		users.add(new User(4, "Dimitris", "Labouris", new Email("fuck.vodka@gmail.com"), new Password("poligono420"), 20, new CreditCard(1234, "ate"), true));
		users.add(new User(5, "Dimitris", "Mpastas", new Email("mpastas@gmail.com"), new Password("oijasd23!"), 25, new CreditCard(9846, "pireos"), false));
		
	}
	 */
}
