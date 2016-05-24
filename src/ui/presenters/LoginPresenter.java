package ui.presenters;

import service.LoginService;
import ui.views.LoginView;

public class LoginPresenter {
	private LoginView view;
	private LoginService login;
	
	public LoginPresenter(LoginView view){
		this.view=view;
	}
	
	public void setLogin(LoginService login){
		this.login = login;
	}
	
	public void start(){
		view.setLoginPresenter(this);
		view.open();
	}
	
	public void login(String email, String password){
		login.login(email, password);
	}
}
