package service;

/**
 *The interface of class {@link LoginServiceImp}
 */
public interface LoginService {

	/**
	 * Check if the email and the password are valid.	 * 
	 * First check if there is a user with that email. After check if
	 * the password assigned with this email. If it is, return {@code true} and
	 *  assign the user as current user {@link LoginServiceImp#ACTIVE_USER}
	 *  If email does not excist or password is not correct, return {@code false}
	 *  
	 * @param email The email of the user
	 * @param password The password of the user
	 * @return True if loggin was successfull, false otherwise
	 */
	public boolean login(String email, String password);

}