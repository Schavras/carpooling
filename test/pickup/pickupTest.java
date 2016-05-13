package pickup;

import java.util.Date;

import org.junit.Test;

import pickup.PickUp;
import place.AddressPlace;


public class pickupTest {
	
	@Test
	public void ConstructorTest(){
		@SuppressWarnings("unused")
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0);
	}
	
	@Test
	public void testSetter(){
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0);
		pu.setCost(2);
		pu.setDisembarkDateAndTime(new Date());
		pu.setPickUpDateAndTime(new Date());
		pu.setPlace(new AddressPlace());
		
	}
	
	@Test
	public void testGetter(){
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0);
		pu.getCost();
		pu.getDisembarkDateAndTime();
		pu.getPickUpDateAndTime();
		pu.getPlace();
	}
	
	@Test
	public void hashCodeTest(){
		PickUp pu = new PickUp(new AddressPlace(), new Date(), new Date(), 5.0);
		pu.hashCode();
		
		pu.setDisembarkDateAndTime(null);
		pu.setPickUpDateAndTime(null);
		pu.setPlace(null);
		
		pu.hashCode();
	}
}