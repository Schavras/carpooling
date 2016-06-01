package ui.presenters;

import org.junit.Test;

import dao.TripDAO;
import memorydao.TripMemoryDAO;
import ui.views.NewTripView;
import ui.presenters.NewTripPresenter;

public class NewTripPresenterTest {
	private NewTripView view; 
	String sCountry=" ",sRegion=" ",sTown=" ",sComment=" ",dCountry=" ",dRegion=" ",dTown=" ",dComment=" ",
	day=" ",month=" ",year=" ",price=" ",currency=" ",numberOfTravelers=" ";
	private NewTripPresenter presenter;
	private TripDAO dao;
	private int tempyear, tempmonth , tempday;	
	
	@Test
	public void makeNewTrip(){
		presenter = new NewTripPresenter(view);
		dao = new TripMemoryDAO();
		presenter.newtrip(sCountry,sRegion,sTown,sComment,dCountry,dRegion,dTown,dComment,
				day,month,year,price,currency,numberOfTravelers);
		presenter.start();
	}
	
		
	
	
	
	
	
}
