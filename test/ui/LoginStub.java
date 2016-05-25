package ui;

import ui.presenters.LoginPresenter;
import ui.views.LoginView;

public class LoginStub extends ViewStub implements LoginView{

	private LoginPresenter presenter;
	
	@Override
	public void setLoginPresenter(LoginPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public String getEmail() {
		
		return "some@email";
	}

	@Override
	public void setEmail(String email) {
		return;
		
	}

	@Override
	public String getPassword() {
		return "password";
	}

	@Override
	public void setPassword(String password) {
		return;
		
	}

	@Override
	public void setLoginError(String error) {
		return;
		
	}
	
	

}
