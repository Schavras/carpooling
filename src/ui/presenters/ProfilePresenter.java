package ui.presenters;

import service.ProfileService;
import ui.views.ProfileView;

public class ProfilePresenter {
	private ProfileView view;
	private ProfileService ps;
	
	public ProfilePresenter(ProfileView view){
		this.view = view;
	}
	
	public void setProfile(ProfileService profile){
		ps = profile;
	}
	
	public void start(){
		view.setProfilePresenter(this);
		view.open();
	}
	
	public void signup(){
		
	}
	
}
