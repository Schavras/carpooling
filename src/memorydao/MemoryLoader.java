package memorydao;

import java.util.ArrayList;

import java.util.Date;


import domain.Car;
import domain.Place;
import domain.Trip;
import types.CreditCard;
import types.Email;
import types.Password;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import domain.User;

/*
 * 
 * 
 * 
 * 
 * 			---------------------
 *         //TODO TO BE DELETED //
 * 			----------------------
 * 		
 * 			
 * 
 * 
 * 
 * 
 */


public class MemoryLoader implements Loader {
	
	static ArrayList<User> users ;
	static ArrayList<Driver> trips ;
	
	protected  MemoryLoader() {
		
	}
	
	public void initialize(){
		 users = new ArrayList<User>();
		 trips = new ArrayList<Driver>();
	}
	
	@Override
	public void load() {
		loadUsers();
		loadTrips();
	}

	

	@Override
	public void loadUsers() {
		users.add(new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true));
		users.add(new User(1, "Nikos", "Papastamatakis", new Email("nikos.papastamatakis@gmail.com"), new Password("vaggelis"), 20, new CreditCard(420420421, "pireos"), true));
		users.add(new User(2, "Athanasia", "denThimame", new Email("athanasia@gmail.com"), new Password("lala"), 22, new CreditCard(426520421, "pireos"), true));
		users.add(new User(3, "Dwra", "Dervi", new Email("dwra.dervi@gmail.com"), new Password("dwroul"), 4, new CreditCard(1239871, "alfabank"), true));
		users.add(new User(4, "Dimitris", "Labouris", new Email("fuck.vodka@gmail.com"), new Password("poligono420"), 20, new CreditCard(1234, "ate"), true));
		users.add(new User(5, "Dimitris", "Mpastas", new Email("mpastas@gmail.com"), new Password("oijasd23!"), 25, new CreditCard(9846, "pireos"), false));
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void loadTrips() {
		trips.add(new Driver(users.get(0), new Car("idx231","TOYOTA","COROLA",1990), new Trip(0, new Place("Greece", "Attiki", "athens"), new Place("Greece", "Makedonia","Thessaoniki"), new Date(2016, 4, 20), new Currency(425.5f, CurrencyNamesEnum.EURO), 3)));
		trips.add(new Driver(users.get(1), new Car("asd123","cintroen","saxo",2010), new Trip(1, new Place("Greece", "Attiki", "athens"), new Place("Greece", "Makedonia","Thessaoniki"), new Date(2016, 4, 20), new Currency(420.5f, CurrencyNamesEnum.EURO), 3)));
		trips.add(new Driver(users.get(2), new Car("asd1312","asd","COROLA",1990), new Trip(2, new Place("Greece", "axaia", "patra"), new Place("Greece", "Makedonia","Thessaoniki"), new Date(2016, 4, 20), new Currency(425.5f, CurrencyNamesEnum.EURO), 3)));
	}

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static ArrayList<Driver> getTrips() {
		return trips;
	}
	
	

}
