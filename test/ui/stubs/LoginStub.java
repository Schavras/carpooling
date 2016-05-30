package ui.stubs;

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
	public String getPassword() {
		return "password";
	}

	

	@Override
	public void setLoginError(String error) {
		return;
		
	}

	@Override
	public void back() {
		return;
		
	}
	
	

}
