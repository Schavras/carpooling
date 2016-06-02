package ui.presenters;

import org.junit.Test;

import dao.TripDAO;
import memorydao.TripMemoryDAO;
import ui.stubs.NewTripUIStub;
import ui.views.NewTripView;
import ui.presenters.NewTripPresenter;

public class NewTripPresenterTest {
	private NewTripView view; 
	String sCountry=" ",sRegion=" ",sTown=" ",sComment=" ",dCountry=" ",dRegion=" ",dTown=" ",dComment=" ",
	day="1",month="1",year="1",price="5",currency=" ",numberOfTravelers="2";
	private NewTripPresenter presenter;
	private TripDAO dao;
	private String tempyear="1", tempmonth="1" , tempday="1";	
	
	@Test
	public void makeNewTrip(){
		view  = new NewTripUIStub();
		presenter = new NewTripPresenter(view);
		dao = new TripMemoryDAO();
		presenter.newtrip(sCountry,sRegion,sTown,sComment,dCountry,dRegion,dTown,dComment,
				day,month,year,price,currency,numberOfTravelers);
		presenter.start();
	}
	
		
	
	
	
	
	
}
