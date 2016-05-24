package ui;

import ui.presenters.LoginPresenter;
import ui.views.LoginView;

public class LoginStub extends ViewStub implements LoginView{

	private LoginPresenter presenter;
	
	@Override
	public void setLoginPresenter(LoginPresenter presenter) {
		this.presenter = presenter;
		
	}
	
	

}
