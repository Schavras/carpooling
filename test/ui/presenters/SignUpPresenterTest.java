package ui.presenters;


import ui.stubs.SignUpUIStub;
import ui.views.SignUpView;
import memorydao.UserMemoryDAOStub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SignUpPresenterTest {
	
	SignUpView view;
	SignUpPresenter presenter;
	boolean actualAttempt;
	
	@Before
	public void setUp(){
		view = new SignUpUIStub();
		presenter =  new SignUpPresenter(view);
		presenter.setDao((new UserMemoryDAOStub()));
	}
	
	@Test
	public void successSignUpTest(){
		actualAttempt = presenter.signup("new", "user", "a_new@email", "password", "20", "123", "bank");
		Assert.assertTrue(actualAttempt);
	}
	
	@Test
	public void falseSignUpTest(){
		actualAttempt = presenter.signup("new", "user", "stavros.z@hotmail.com", "password", "20", "123", "bank");
		Assert.assertFalse(actualAttempt);
	}
	
	

}
