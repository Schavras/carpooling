package domain;


import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;


import junit.framework.Assert;
import types.CreditCard;
import types.Email;
import types.Password;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;

@SuppressWarnings({ "unused", "deprecation" })
public class TripTest {
	
	User user;
	User driver;
	User traveler;
	
	@Before
	public void setUp(){
		Password pass = new Password("abc");
		Email email = new Email("def");
		CreditCard cd = new CreditCard(5,"gh");
		driver = new User(1,"abc","dfg", email , pass , 5 , cd , true  );
		 traveler = new User(2,"abc","dfg", email , pass , 5 , cd , true  );
		 user = new User();
	}

	@Test
	public void DefaultConstractor(){
		Trip trip = new Trip();
	}
	
	@Test
	public void Constructor(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 5, user);
		
	}
	
	@Test
	public void addRequestTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1, null);
		Request req = new Request("asd", new Date(2931, 2, 32), new AddressPlace(), user);
		trip.addRequest(req);
		Assert.assertEquals(req,  trip.getPendingRequest().get(0));
		Assert.assertEquals(1 , trip.getPendingRequest().size());
	}
	
	@Test
	public void rejectRequestTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1, null);
		Request req = new Request("asd", new Date(2931, 2, 32), new AddressPlace(), traveler);
		trip.addRequest(req);
		
		trip.rejectRequest(req);
		Assert.assertEquals(0 , trip.getPendingRequest().size());
	}
	
	@Test
	public void acceptRequestTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1, null);
		Request req = new Request("asd", new Date(2931, 2, 32), new AddressPlace(), traveler);
		trip.addRequest(req);
		trip.acceptRequest(trip.getPendingRequest().get(0));
		Assert.assertEquals(1, trip.getTravelers().size());
		Assert.assertEquals(0 , trip.getPendingRequest().size());
		Assert.assertEquals(traveler , trip.getTravelers().get(0));
	}
	
	
	
	
	@Test
	public void settersTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1, user);
		
		trip.setDateOfDeparture(new Date());
		trip.setDestination(new Place());
		trip.setId(4);
		trip.setMaxTravelers(2);
		trip.setStartingPoint(new Place());
		trip.setStatus(EnumTripStatus.OPEN);
		trip.setTotalPrice(new Currency(9,  CurrencyNamesEnum.DOLLAR));

	}
	
	@Test
	public void getterTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1, user);
		
		trip.getDateOfDeparture();
		trip.getDestination();
		trip.getId();
		trip.getMaxTravelers();
		trip.getStartingPoint();
		trip.getStatus();
		trip.getTotalPrice();

	}
	
	@Test
	public void hashCodeTest(){
		Trip trip = new Trip(1, new Place(), new Place(), new Date(), new Currency(5, CurrencyNamesEnum.EURO), 1, user);
		
		trip.hashCode();
		
		trip.setDateOfDeparture(null);
		trip.setDestination(null);
		trip.setStartingPoint(null);
		trip.setStatus(null);
		trip.setTotalPrice(null);
		trip.setTravelers(null);
		
		trip.hashCode();
	}
}
