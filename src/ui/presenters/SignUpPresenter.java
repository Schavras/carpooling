package ui.presenters;

import service.SignUpService;
import ui.views.SignUpView;

public class SignUpPresenter {
	private SignUpView view;
	private SignUpService su;
	
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
	
	public void signup(){
		
	}
	
}
