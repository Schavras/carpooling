package ui.presenters;

import memorydao.UserMemoryDAOStub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ui.presenters.LoginPresenter;
import ui.stubs.LoginStub;
import ui.views.LoginView;

public class LoginPresenterTest {

	UserMemoryDAOStub mem;
	LoginView view;
	private LoginPresenter presenter; 
	private LoginStub login;
	boolean success;
	String email,password;
	
	@Before
	public void setUp() throws Exception {
		mem = new UserMemoryDAOStub();
		
		login = new LoginStub();
		presenter = new LoginPresenter(login); 
		presenter.setDAO(mem);
		presenter.start();
	}

	@Test
	public void succededTest() {
		
		email=login.getEmail();
		password= login.getPassword();
		
		success = presenter.login(email, password);
		Assert.assertTrue(success);
	}
	
	@Test
	public void failedEmailTest(){
		email = "wrong@email";
		password = "a";
		
		success = presenter.login(email, password);
		Assert.assertFalse(success);
	}
	
	@Test
	public void failedPasswordTest(){
		email=login.getEmail();
		password = "a";
		
		success = presenter.login(email, password);
		Assert.assertFalse(success);
	}

}
