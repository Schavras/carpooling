package domain;


import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import domain.EnumTripStatus;
import domain.Place;
import domain.Trip;
import junit.framework.Assert;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import domain.Traveller;
@SuppressWarnings({ "unused", "deprecation" })
public class TripTest {

	@Test
	public void DefaultConstractor(){
		Trip trip = new Trip();
	}
	
	@Test
	public void Constructor(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 5);
		
	}
	
	@Test
	public void addTravelerTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1);
		Assert.assertTrue(trip.addTraveler(new Traveller()));
		Assert.assertFalse(trip.addTraveler(new Traveller()));
	}
	
	@Test
	public void settersTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1);
		
		trip.setDateOfDeparture(new Date());
		trip.setDestination(new Place());
		trip.setId(4);
		trip.setMaxTravelers(2);
		trip.setStartingPoint(new Place());
		trip.setStatus(EnumTripStatus.OPEN);
		trip.setTotalPrice(new Currency(9,  CurrencyNamesEnum.DOLLAR));
		trip.setTravelers(new ArrayList<Traveller>());
	}
	
	@Test
	public void getterTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1);
		
		trip.getDateOfDeparture();
		trip.getDestination();
		trip.getId();
		trip.getMaxTravelers();
		trip.getStartingPoint();
		trip.getStatus();
		trip.getTotalPrice();
		trip.getTravelers();
	}
	
	@Test
	public void hashCodeTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1);
		trip.hashCode();
		
		trip.setDateOfDeparture(null);
		trip.setDestination(null);
		trip.setStartingPoint(null);
		trip.setStatus(null);
		trip.setTotalPrice(null);
		trip.setTravelers(null);
	}
}
