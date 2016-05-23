package service;

import memorydao.MemoryLoader;
import memorydao.UserMemoryDAO;
import memorydao.UserMemoryDAOStub;
import dao.UserDAO;
import domain.User;
import types.Password;

public class LoginServiceImp implements LoginService  {
	
	public static User ACTIVE_USER = null;
	
	private UserDAO userDao;
	private User user;
	

	
	/**
	 * 
	 */
	@Override
	public boolean login(String email, String password){
		user = userDao.getByEmail(email);
		
		if (user != null){
			System.out.println(user.getPassword() == new Password(password));
			if( user.getPassword() == new Password(password)){
				ACTIVE_USER = user;
				return true;
			}
		}
		
		return false;
	}
	
	public LoginServiceImp(UserDAO mem){
		this.userDao = mem;
	}

}
