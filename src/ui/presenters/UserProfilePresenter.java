package ui.presenters;

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
	
	public void signup(){
		
	}
	
}
