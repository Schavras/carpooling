package memorydao;

import types.CreditCard;
import types.Email;
import types.Password;
import dao.UserDAO;
import domain.User;

public class UserMemoryDAOStub implements UserDAO  {

	
	
	@Override
	public User getByEmail(String email) {
		return new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true);
	}

}
