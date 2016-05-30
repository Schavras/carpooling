package ui.presenters;

import service.LoginServiceImp;
import service.ProfileService;
import ui.views.ProfileView;

public class UserProfilePresenter {
	private ProfileView view;
	private ProfileService ps;
	
	public UserProfilePresenter(ProfileView view){
		this.view = view;
	}
	
	public void setUserProfilePresenter(ProfileService profile){
		ps = profile;
	}
	
	public void start(){
	
		view.setUserProfilePresenter(this);
		view.open();
	}
	
	public String getName(){
		return LoginServiceImp.ACTIVE_USER.getName();
	}
	
	public String getSurname(){
		return LoginServiceImp.ACTIVE_USER.getSurname();
	}
	
	public String getEmail(){
		return LoginServiceImp.ACTIVE_USER.getEmail().getFullEmailAdress();
	}
	
			

	
}
