package ui.presenters;

import dao.UserDAO;
import memorydao.UserMemoryDAO;
import service.SignUpServiceImp;
import service.interfaces.SignUpService;
import ui.views.SignUpView;

public class SignUpPresenter {
	private SignUpView view;
	//TODO change to real dao
	UserDAO dao ;
	private SignUpService su = new SignUpServiceImp(new UserMemoryDAO());
	
	public SignUpPresenter(SignUpView view){
		dao = new UserMemoryDAO();
		su = new SignUpServiceImp(dao);
		this.view = view;
	}
	
	protected void setDao(UserDAO dao){
		this.dao = dao;
		su = new SignUpServiceImp(dao);
	}
	
	public void start(){
		view.setSignUpPresenter(this);
		view.open();
	}
	
	public boolean signup(String name, String surname, String email, String password, String age, String ccnumber, String ccBank){
		boolean result = su.newUser(name, surname, email, password, Integer.parseInt(age), ccnumber, ccBank);
		return result;
	}
	
}
