package ui.views;

import ui.presenters.LoginPresenter;

public interface LoginView extends View{

	/**
	 * Binds the view with the presenter
	 */
	void setLoginPresenter(LoginPresenter presenter);
	
	String getEmail();
	
	void setEmail(String email);
	
	String getPassword();
	
	void setPassword(String password);
}