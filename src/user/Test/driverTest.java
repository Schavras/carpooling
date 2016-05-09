package user.Test;
import request.EnumStatus;
import trip.Trip;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import user.Driver;
import user.Traveller;
import user.User;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import car.Car;
import place.AddressPlace;
import place.Place;

public class driverTest {

	@Test
	public void testConstactor(){
		@SuppressWarnings("unused")
		Driver dr = new Driver(new User(),new Car(),new Trip());
		
		
	}
	
	@Test
	public void testAddRequest(){
		Driver dr = new Driver(new User(),new Car(),new Trip());
		dr.addRequest(new Traveller());
	}
	
	@Test 
	public void testApproveRequest(){
		Driver dr = new Driver(new User(),new Car(),new Trip(0, new Place(), new Place(), new Date(), new Currency(0,CurrencyNamesEnum.EURO), 3)); 
		@SuppressWarnings("unused")
		Traveller tr = new Traveller(new User(), dr, new AddressPlace(), "");
		Assert.assertEquals(1, dr.getRequests().getRequests().size());
		dr.approveRequest(0);
		Assert.assertEquals(EnumStatus.APPROVED,dr.getRequests().get(0).getRequest().getStatus());
		
	}
	
	@Test 
	public void testDeclineRequest(){
		Driver dr = new Driver(new User(),new Car(),new Trip(0, new Place(), new Place(), new Date(), new Currency(0,CurrencyNamesEnum.EURO), 3));
		@SuppressWarnings("unused")
		Traveller tr = new Traveller(new User(), dr, new AddressPlace(), "");
		Assert.assertEquals(1, dr.getRequests().getRequests().size());
		dr.declineRequest(0);
//		Assert.assertEquals(EnumStatus.REJECTED,dr.getRequests().get(0).getRequest().getStatus());
		
	}
}