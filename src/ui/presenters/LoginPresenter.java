package ui.presenters;

import dao.UserDAO;
import memorydao.UserMemoryDAO;
import memorydao.UserMemoryDAOStub;
import service.LoginServiceImp;
import service.interfaces.LoginService;
import ui.views.LoginView;

public class LoginPresenter {
	private LoginView view;
	private LoginService login;
	
	public LoginPresenter(LoginView view){
		this.view=view;
		login= new LoginServiceImp(new UserMemoryDAO());
	}
	
	void setDAO(UserDAO dao){
		login= new LoginServiceImp(dao);
	}
	
	public void setLogin(LoginService login){
		this.login = login;
	}
	
	public void start(){
		view.setLoginPresenter(this);
		view.open();
	}
	
	public boolean login(String email, String password){
		return login.login(email, password);
	}
}
  