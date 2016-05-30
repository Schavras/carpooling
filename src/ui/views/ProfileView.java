package ui.views;

import ui.presenters.UserProfilePresenter;

//TODO add javadoc
public interface ProfileView extends View {
	
	/**
	 * @param don't know yet
	 * @return the number of pending requests
	 */
	int setPendingRequestsNumberButton();
	
	/**
	 * 
	 * @param presenter
	 */
	void setUserProfilePresenter(UserProfilePresenter presenter);
	
	/**
	 * sets User's Name
	 */
	void setName();
	
	/**
	 * sets User's Surname
	 */
	void setSurname();
	
	/**
	 * sets User's email
	 */
	void setEmail();
	
	
}

