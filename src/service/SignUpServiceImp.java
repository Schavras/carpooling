package service;

import memorydao.UserMemoryDAO;
import dao.UserDAO;
import domain.User;
import service.interfaces.SignUpService;
import types.Email;
import types.Password;
import types.CreditCard;

public class SignUpServiceImp implements SignUpService {
	
	private UserDAO userDao;

	public SignUpServiceImp(UserDAO dao){
		userDao = dao;
	}
	
	 
	public SignUpServiceImp(){
		userDao = new UserMemoryDAO();
	}
	
	
	
	/* (non-Javadoc)
	 * @see service.SignUpService#newUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean newUser(String name, String surname, String email, String password, int age, String ccnumber, String ccBank){
	
		if (userExist(email)){
			return false;
		}
		
		Email tempEmail = new Email(email);
		Password tempPassword= new Password(password);
		int tempCcNumber;
		try{
			tempCcNumber = Integer.parseInt(ccnumber);
		}catch( NumberFormatException e){
			return false;
		}
		CreditCard cc = new CreditCard(tempCcNumber, ccBank);
		
		//TODO change status to false
		User new_user = new User(0, name, surname, tempEmail, tempPassword, age, cc, true);
		userDao.newUser(new_user);	
				
		return true;
		
	}

	private boolean userExist(String email) {
		if ( userDao.getByEmail(email) != null){
			return true;
		}
		
		return false;
	}
		
	
}
