package service;

import java.util.ArrayList;

import memorydao.UserMemoryDAO;
import dao.UserDAO;
import domain.User;
import types.Email;
import types.Password;

public class LoginServiceImp implements LoginService  {
	
	public static User ACTIVE_USER = null;
	
	private User user;
	
	UserDAO userDao;
	
	/**
	 * 
	 */
	@Override
	public boolean login(String email, String password){
		userDao= new UserMemoryDAO();
		user = userDao.getByEmail(email);
		if (user == null){
			if(user.getPassword() == new Password(password)){
				ACTIVE_USER = user;
				return true;
			}
		}
		
		return false;
	}
	

}
