package service;

import java.util.ArrayList;
import java.util.Date;

import memorydao.TripMemoryDAOStub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.TripDAO;
import domain.Place;
import domain.Trip;
import service.interfaces.SearchService;
import types.Email;
import types.Password;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import domain.User;


//TODO to be fixed

public class SearchTest {
	
	TripDAO mem;
	SearchService search;
	ArrayList<Trip> results;
	
	@Before
	public void setUp(){
		mem =  new TripMemoryDAOStub();
		search = new SearchServiceImpl(mem);
		results = new ArrayList<Trip>();
	}
	
	@Test
	public void searchByPlaceTest(){
		results =search.searchByPlace("country1", "region1", "town1");
		
		Trip testTrip = results.get(0);
		@SuppressWarnings("deprecation")
		Trip expectedTrip = new Trip(0100,new Place("Greece", "Attiki", "athens"),new Place("country1", "region1","town1"),new Date(2016, 4, 20),new Currency(400.0f, CurrencyNamesEnum.EURO),4,new User(0, "first", "user", new Email("first@email"), new Password() , true));
		Assert.assertEquals(3, results.size());
		Assert.assertEquals("first", results.get(0).getDriver().getName());
		Assert.assertEquals("forth", results.get(2).getDriver().getName());
		Assert.assertEquals(expectedTrip,testTrip);
	}
	
	@Test
	public void searchByPlaceNoResults(){
		results= search.searchByPlace("wrong", "wrong", "wrong");
		Assert.assertEquals(0, results.size());
	}
	
	
			


}