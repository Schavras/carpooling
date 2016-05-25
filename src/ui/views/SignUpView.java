package ui.views;

import types.CreditCard;
import types.Email;
import types.Password;
import ui.presenters.SignUpPresenter;

public interface SignUpView extends View {
	
 
	public String getName() ;
	public String getSurname();	
	public String getEmail();
	public String getPassword();
	public String getAge();
	public String getCreditNumber();	
	public String getCreditBank();
	
	void signup();
	
	void setSignUpPresenter(SignUpPresenter presenter);
}
