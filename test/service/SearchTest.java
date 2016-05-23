package service;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import domain.Car;
import domain.Place;
import domain.Trip;
import service.Search;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import domain.User;


//TODO to be fixed
/*
public class SearchTest {
	
	

	@Test
	public void testSearchByPlace() {
		Place placeToSearch = new Place("Greece", "Makedonia", "thessaloniki");
		Place place = new Place("Greece", "Makedonia", "thessaloniki", "asda");
		
		User driver1 = new User();
		User driver2 = new User();
		User driver3 = new User();
		
		Trip trip1 =  new Trip(0, new Place(), place, new Date(), new Currency(5.0f, CurrencyNamesEnum.EURO), 2, driver1);
		Trip trip2 = new Trip(0, new Place(), new Place(), new Date(), new Currency(2.0f, CurrencyNamesEnum.EURO), 2, driver2);
		Trip trip3 = new Trip(0, new Place(), new Place(), new Date(), new Currency(2.0f, CurrencyNamesEnum.EURO), 2, driver3);
				
				
		ArrayList<Trip> datas = new ArrayList<Trip>();
		datas.add(trip1);
		datas.add(trip2);
		datas.add(trip3);
		
		ArrayList<Trip> searchResult;
		
		searchResult=Search.searchByPlace(placeToSearch, datas);
			Assert.assertEquals(1 , searchResult.size());
		Assert.assertSame( driver1, searchResult.get(0).getDriver());
		
	}
	
	@Test
	public void testSearchByDriver() {
		
		Place place = new Place("Greece", "Makedonia", "thessaloniki", "asda");
		
		Driver driver1 = new Driver(new User(), new Car(), new Trip(0, new Place(), place, new Date(), new Currency(5.0f, CurrencyNamesEnum.EURO), 2));
		Driver driver2 = new Driver(new User(), new Car(), new Trip(0, new Place(), new Place(), new Date(), new Currency(2.0f, CurrencyNamesEnum.EURO), 2));
		Driver driver3 = new Driver(new User(), new Car(), new Trip(0, new Place(), place, new Date(), new Currency(6.0f, CurrencyNamesEnum.EURO), 2));
		ArrayList<Driver> datas = new ArrayList<Driver>();
		datas.add(driver1);
		datas.add(driver2);
		datas.add(driver3);
		
		Driver driverToSearch = new Driver(new User(), new Car(), new Trip(0, new Place(), place, new Date(), new Currency(6.0f, CurrencyNamesEnum.EURO), 2));
		
		ArrayList<Driver> searchResult1;
		
		searchResult1=Search.searchByDriver(driverToSearch, datas);
		Assert.assertEquals(1, searchResult1.size());
		Assert.assertSame(searchResult1.get(0), driver3);
		
		
	}
	

}
*/