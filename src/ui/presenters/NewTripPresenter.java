package ui.presenters;

import java.util.Date;

import memorydao.TripMemoryDAO;
import dao.TripDAO;
import domain.Place;
import domain.Trip;
import ui.views.NewTripView;
import service.LoginServiceImp;
import types.currency.*;

public class NewTripPresenter {

	private NewTripView view ; 
	private TripDAO dao;
	
	public NewTripPresenter(NewTripView view){
		this.view= view;
		dao = new TripMemoryDAO();
	}
	
	public void newtrip(String sCountry,String sRegion,String sTown,String sComment,
						String dCountry,String dRegion,String dTown,String dComment,
						String day, String month, String year,
						String price, String currency,
						String numberOfTravelers){
		
		Place start = new Place(sCountry, sRegion, sTown, sComment);
		Place end = new Place(dCountry, dRegion, dTown, dComment);
		
		int tempyear, tempmonth , tempday;
		tempyear = Integer.parseInt(year);
		tempmonth =  Integer.parseInt(month);
		tempday =  Integer.parseInt(day);
		@SuppressWarnings("deprecation")
		Date date = new Date(tempyear, tempmonth, tempday);
		
		float tempPrice = Float.parseFloat(price);
		CurrencyNamesEnum currSign = CurrencyNamesEnum.searchSign(currency);
		Currency curr = new Currency(tempPrice,  currSign);
		
		int tempnumber = Integer.parseInt(numberOfTravelers);
		
		Trip trip = new Trip(0, start, end, date, curr, tempnumber, LoginServiceImp.ACTIVE_USER);
		dao.addNewTrip(trip);
	}

	public void start() {
		view.setNewTripPresenter(this);
		view.open();
		
	}
}
