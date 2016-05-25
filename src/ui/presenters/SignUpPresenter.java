package ui.presenters;

import memorydao.UserMemoryDAOStub;
import service.SignUpServiceImp;
import service.interfaces.SignUpService;
import ui.views.SignUpView;

public class SignUpPresenter {
	private SignUpView view;
	//TODO change to real dao
	private SignUpService su = new SignUpServiceImp(new UserMemoryDAOStub());
	
	public SignUpPresenter(SignUpView view){
		this.view = view;
	}
	
	public void setSignUp(SignUpService signup){
		su = signup;
	}
	
	public void start(){
		view.setSignUpPresenter(this);
		view.open();
	}
	
	public void signup(String name, String surname, String email, String password, String age, String ccnumber, String ccBank){
		su.newUser(name, surname, email, password, Integer.parseInt(age), ccnumber, ccBank);
	}
	
}
