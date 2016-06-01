package ui.views;

import ui.presenters.ManageMyTripsPresenter;
import ui.presenters.NewTripPresenter;

public interface ManageMyTripsView {
	/**
	 * tha diagrafei ena Trip apo tin lista me ta Trips tou user
	 */
	public void removeTrip();
	
	void getRequests();

	void setManageMyTripsPresenter(ManageMyTripsPresenter presenter);
	
	
}
