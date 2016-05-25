package service;

import service.interfaces.LoginService;
import dao.UserDAO;
import domain.User;

/**
 * The impelentation of {@link LoginService} interface
 *
 */
public class LoginServiceImp implements LoginService  {
	
	public static User ACTIVE_USER = null;
	private UserDAO userDao; 
	private User user;
	

	
	/**
	 * Implementation of {@link LoginService#login(String, String)}
	 */
	public boolean login(String email, String password){
		user = userDao.getByEmail(email);
		if (user== null){
			return false;
		} 
		if(! user.getPassword().getPassword().equals(password)){
		 return false;
		}
		
		if (!user.isValid()){
			return false;
		}
		ACTIVE_USER = user;
		return true;
	}
	
	public LoginServiceImp(UserDAO mem){
		this.userDao = mem;
		
	}
	
	public User getActiveUser(){
		return ACTIVE_USER;
	}
	
	

}
