package service;

import domain.User;
import types.Email;
import types.Password;

public class LoginService {
	private boolean validEmail;
	private boolean validPassword;
	
	public User login(User user){
		
		if (validEmail && validPassword){
			
		}
		
		return null;
	}
	
	private boolean checkPassword(Password password) {
		
		return false;
	}

	private boolean checkEmail(Email email){
		
		return false;
	}
}
