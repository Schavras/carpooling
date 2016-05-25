package memorydao;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domain.Place;
import domain.Trip;
import domain.User;
import types.CreditCard;
import types.Email;
import types.Password;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;


public class TripDAOTest {

	private TripMemoryDAO sample;
	
	 @Before 
	 public void loadBase() {                
	    	MemoryInitializer base = new MemoryInitializer();
	    	base.initialize();
	        sample = new TripMemoryDAO();  
	        
	    }
	 
	 @Test
	 public void findDestination(){
		 User fresh=new User(12,"Nikos","Papas", new Email("nikospapass@"), new Password("123321"), 21, new CreditCard(123456789, "Pireus"),true);
		 @SuppressWarnings("deprecation")
		Trip destin=new Trip(0000,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaloniki"),new Date(2016, 6, 17),new Currency(444.5f, CurrencyNamesEnum.EURO),3,fresh);
		 sample.findByDestination("Greece", "Makedonia","Thessaloniki");
		 Assert.assertEquals(new Place("Greece", "Makedonia","Thessaloniki"), destin.getDestination());
		 
	 }
	 
	 @Test
	 public void findDriver(){
		 User fresh=new User(12,"Nikos","Papas", new Email("nikospapass@"), new Password("123321"), 21, new CreditCard(123456789, "Pireus"),true);
		 sample.findByDriver(new Email("nikospapass@"));
		 Assert.assertEquals(new Email("nikospapass@"), fresh.getEmail());
	 }
	
	
}
