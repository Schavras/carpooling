package ui.views;

import ui.presenters.LoginPresenter;

public interface LoginView extends View{

	/**
	 * Binds the view with the presenter
	 */
	void setLoginPresenter(LoginPresenter presenter);
	
	String getEmail();
	
	
	String getPassword();
	
	void setLoginError(String error);
}