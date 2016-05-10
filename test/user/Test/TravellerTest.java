package user.Test;

import org.junit.Test;

import junit.framework.Assert;
import place.AddressPlace;
import request.Request;
import trip.Trip;
import user.Driver;
import user.Traveller;
import user.User;

public class TravellerTest {
	
	@Test
	public void testDefault(){
		@SuppressWarnings("unused")
		Traveller traveler = new Traveller();
	}
	
	@Test
	public void testConstructor(){
		@SuppressWarnings("unused")
		Traveller traveler = new Traveller(new User(),new Driver(),new AddressPlace(), "abc");
	}
	
	@Test
	public void testSetters(){
		Traveller traveler = new Traveller();
		traveler.setAddress(new AddressPlace());
		traveler.setRequest(new Request());
		traveler.setTraveller(new User());
		traveler.setTrip(new Trip());
	}
	
	@Test
	public void testGetters(){
		Traveller traveler = new Traveller(new User(),new Driver(),new AddressPlace(), "abc");
		traveler.getAddress();
		traveler.getRequest();
		traveler.getTraveller();
		traveler.getTrip();
	}
	
	@Test
	public void testHashCode(){
		Traveller traveler = new Traveller(new User(),new Driver(),new AddressPlace(), "abc");
		traveler.hashCode();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testEquals(){
		Traveller traveler = new Traveller(new User(),new Driver(),new AddressPlace(), "abc");
		Traveller traveler2 = null;
		Assert.assertFalse("empty",traveler.equals(traveler2));
		
		traveler2 = new Traveller(new User(),new Driver(),new AddressPlace(), "abc");
		Assert.assertTrue("empty",traveler.equals(traveler2));
		
		Assert.assertFalse("empty",traveler.equals(" "));
		
		traveler2.setTrip(null);
		Assert.assertFalse("empty",traveler.equals(traveler2));
		Trip trip = new Trip();
		trip.setId(1);
		traveler2.setTrip(trip);
		Assert.assertFalse("empty",traveler.equals(traveler2));
		
		
		traveler2.setAddress(null);
		Assert.assertFalse("empty",traveler.equals(traveler2));
		
		
	}
	

}
	