package service.interfaces;

public interface SignUpService {

	public boolean newUser(String name, String surname, String email,
			String password, int age, String ccnumber, String ccBank);

}