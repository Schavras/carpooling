package ui.presenters;

import static org.junit.Assert.*;
import memorydao.UserMemoryDAOStub;

import org.junit.Before;
import org.junit.Test;

import ui.presenters.LoginPresenter;
import ui.stubs.LoginStub;
import ui.views.LoginView;

//TODO test gia ton presenter
public class LoginPresenterTest {

	UserMemoryDAOStub mem;
	LoginView view;
	private LoginPresenter presenter; 
	private LoginStub login;
	boolean success;
	
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
		String email,password;
		email=login.getEmail();
		password= login.getPassword();
		
		success = presenter.login(email, password);
	}

}
