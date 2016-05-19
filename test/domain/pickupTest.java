package domain;

import java.util.Date;

import org.junit.Test;

import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import domain.AddressPlace;
import domain.PickUp;


public class pickupTest {
	
	@Test
	public void ConstructorTest(){
		@SuppressWarnings("unused")
		User us=new User();
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0,us);
	}
	
	@Test
	public void testSetter(){
		User us=new User();
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(),5.0,us);
		pu.setCost(2);
		pu.setDisembarkDateAndTime(new Date());
		pu.setPickUpDateAndTime(new Date());
		pu.setPlace(new AddressPlace());
		
	}
	
	@Test
	public void testGetter(){
		User us=new User();
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0,us);
		pu.getCost();
		pu.getDisembarkDateAndTime();
		pu.getPickUpDateAndTime();
		pu.getPlace();
	}
	
	@Test
	public void hashCodeTest(){
		User us=new User();
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0,us);
		pu.hashCode();
		
		pu.setDisembarkDateAndTime(null);
		pu.setPickUpDateAndTime(null);
		pu.setPlace(null);
		
		pu.hashCode();
	}
	
	@Test
	public void test123(){
		User us = new User();
		Place ne=new Place("ena","dyo","tria");
		us.newTrip(1,ne, ne, new Date(), new Currency(5, CurrencyNamesEnum.EURO), 5, us);
		us.newTrip(2, new Place(), new Place(), new Date(), new Currency(3, CurrencyNamesEnum.EURO), 3, us);
		User us2 = new User();
		us2.newRequest("...",us.getOwnedTrips().get(0),new Date(),new AddressPlace());
	//	us.getOwnedTrips().get(0).acceptRequest(us.getOwnedTrips().get(0).getPendingRequest().get(0));
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(),5.0,us2);
		System.out.println(us.getOwnedTrips().get(0));
	}
	
	
}
