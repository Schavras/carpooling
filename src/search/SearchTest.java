package search;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import car.Car;
import place.Place;
import trip.Trip;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import user.Driver;
import user.User;

public class SearchTest {

	@Test
	public void testSearchByPlace() {
		Place placeToSearch = new Place("Greece", "Makedonia", "thessaloniki");
		Place place = new Place("Greece", "Makedonia", "thessaloniki", "asda");
		
		Driver driver1 = new Driver(new User(), new Car(), new Trip(0, new Place(), place, new Date(), new Currency(5.0f, CurrencyNamesEnum.EURO), 2));
		Driver driver2 = new Driver(new User(), new Car(), new Trip(0, new Place(), new Place(), new Date(), new Currency(2.0f, CurrencyNamesEnum.EURO), 2));
		Driver driver3 = new Driver(new User(), new Car(), new Trip(0, new Place(), place, new Date(), new Currency(6.0f, CurrencyNamesEnum.EURO), 2));
		ArrayList<Driver> datas = new ArrayList<Driver>();
		datas.add(driver1);
		datas.add(driver2);
		datas.add(driver3);
		
		ArrayList<Driver> searchResult;
		
		searchResult=Search.searchByPlace(placeToSearch, datas);
		Assert.assertEquals(2 , searchResult.size());
		Assert.assertSame( driver1, searchResult.get(0));
		Assert.assertSame(driver3 , searchResult.get(1));
		
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
