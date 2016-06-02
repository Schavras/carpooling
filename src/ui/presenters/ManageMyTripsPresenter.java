package ui.presenters;

import java.util.ArrayList;

import service.LoginServiceImp;
import domain.EnumTripStatus;
import domain.Trip;

public class ManageMyTripsPresenter {

	/**
	 * The temp result, for keeping active trips,
	 * with indexes. 
	 */
	ArrayList<Trip> results;
	
	/**
	 * Finds all {@link EnumTripStatus#OPEN open} or {@link EnumTripStatus#CLOSE close} trips
	 * of the user : {@link LoginServiceImp#ACTIVE_USER}
	 * @return result string array of the results
	 */
	public String[] getRequests() {
		// TODO ilipoiisi simfona me to javadoc
		return null;
	}
	
	/**
	 * Cancel a trip, seting {@link EnumTripStatus#CANCELED} of 
	 * Trip number from the {@link #results }
	 * @param selectedIndex
	 */
	public void cancelTrip(int selectedIndex) {
		// TODO ilipoiisi simfona me to javadoc
	}

	
	
	
}
