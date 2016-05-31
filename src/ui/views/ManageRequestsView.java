package ui.views;

import ui.presenters.ManageRequestPresenter;


public interface ManageRequestsView extends View{
		
	void setManageRequestPresenter(ManageRequestPresenter presenter);
	
	/**
	 * Creates the request list
	 */
	void getRequests();
	
	/**
	 * initialize the list
	 */
	void init();
	
	void approve();
	
	void reject();
}
