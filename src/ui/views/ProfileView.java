package ui.views;

import ui.presenters.UserProfilePresenter;

//TODO add javadoc
public interface ProfileView extends View {
	
	void setUserProfilePresenter(UserProfilePresenter presenter);
	
	void setName(String name);
	
	void setSurname(String surname);
	
	void setEmail(String email);
	
	
}

