/**
 * 
 */
package service;

import memorydao.UserMemoryDAOStub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Σταύρος
 * 
 */
public class LoginServiceTest {

	UserMemoryDAOStub mem;
	LoginServiceImp lg;
	String email;
	String password;
	boolean result;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true);
		mem = new UserMemoryDAOStub();
		lg= new LoginServiceImp(mem);
		
	}

	@Test
	public void WrongEmailTest() {
		email = "wrong@email.com";
		password = "klmr420";
		result = lg.login(email, password );
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void WrongPasswordTest() {
		email = "stavros.z@hotmail.com";
		password = "wrongpassword";
		result = lg.login(email, password );
		Assert.assertFalse(result);
		
	}
	
	@Test
	public void UserNotFoundTest() {
		email = "invalid_email";
		password = "wrongpassword";
		result = lg.login(email, password );
		Assert.assertFalse(result);;
		
	}
	
	@Test
	public void userNotValid(){
		email = "invalid@email.com";
		password = "klmr420";
		result = lg.login(email, password );
		Assert.assertFalse(result);
	}

	 
	@Test
	public void SuccessLoginTest(){
		email = "stavros.z@hotmail.com";
		password = "klmr420";
		result = lg.login(email, password );
		Assert.assertTrue(result);
	}
	
	@Test
	public void activeUser(){
		lg.getActiveUser();
	}

}
