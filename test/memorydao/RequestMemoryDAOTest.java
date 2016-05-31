package memorydao;


import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domain.Place;
import domain.Request;
import domain.Trip;
import domain.User;
import types.CreditCard;
import types.Email;
import types.Password;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;


public class RequestMemoryDAOTest {

	private RequestMemoryDAO sample;  
	
	 @Before 
	 public void loadBaseTest() {                
	    	MemoryInitializer base = new MemoryInitializer();
	    	base.initialize();
	        sample = new RequestMemoryDAO();  
	        
	    }
	   
	 @Test
	 public void addRemoveRequestsTest(){
		 Request n=new Request();
		 sample.addRequest(n);
		 sample.removeRequest(n); 
	 }
	 
	 @Test
	 public void getRequestsTest(){
		 Request n=new Request();
		 Trip destin=new Trip(0000,new Place("Greece", "Attiki", "athens"),new Place("Greece","Makedonia","Thessaloniki"),new Date(2016, 6, 17),new Currency(444.5f, CurrencyNamesEnum.EURO),3,null);
		 sample.getRequestsByUser(new User(1, "Nikos", "Papapastamatakis", new Email("nikos.papastamatakis@gmail.com"), new Password("vaggelis"), 20, new CreditCard(420420421, "pireos"), true));
		 sample.getRequestsByTrip(new Trip(0100,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 20),new Currency(425.5f, CurrencyNamesEnum.EURO),3,UserMemoryDAO.users.get(1)));
		 sample.getRequestsByTrip(destin);
		 sample.getRequestsByUser(null);
		 sample.getPendingRequestByUser(new User(6, "name", "surname", new Email("aa"), new Password("aa"), 25, new CreditCard(9846, "pireos"), true));
		 Assert.assertEquals(new User(6, "name", "surname", new Email("aa"), new Password("aa"), 25, new CreditCard(9846, "pireos"), true).getRequests(), sample.getPendingRequestByUser(new User(6, "name", "surname", new Email("aa"), new Password("aa"), 25, new CreditCard(9846, "pireos"), true)));
		 sample.getPendingRequestsByTrip(new Trip(0000,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 20),new Currency(425.5f, CurrencyNamesEnum.EURO),3,UserMemoryDAO.users.get(1)));
	 }  
	  
	  
	  
}
