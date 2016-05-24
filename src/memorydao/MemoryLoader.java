package memorydao;

import java.util.ArrayList;

import java.util.Date;

import dao.LoaderDAO;
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


public class MemoryLoader implements LoaderDAO {
	
	static ArrayList<User> users ;
	static ArrayList<Trip> trips ;
	
	protected  MemoryLoader() {
		
	}
	
	public void initialize(){
		 users = new ArrayList<User>();
		 trips = new ArrayList<Trip>();
	}
	
	public void load() {
		loadUsers();
		loadTrips();
	}

	

	public void loadUsers() {
		users.add(new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true));
		users.add(new User(1, "Nikos", "Papastamatakis", new Email("nikos.papastamatakis@gmail.com"), new Password("vaggelis"), 20, new CreditCard(420420421, "pireos"), true));
		users.add(new User(2, "Athanasia", "denThimame", new Email("athanasia@gmail.com"), new Password("lala"), 22, new CreditCard(426520421, "pireos"), true));
		users.add(new User(3, "Dwra", "Dervi", new Email("dwra.dervi@gmail.com"), new Password("dwroul"), 4, new CreditCard(1239871, "alfabank"), true));
		users.add(new User(4, "Dimitris", "Labouris", new Email("fuck.vodka@gmail.com"), new Password("poligono420"), 20, new CreditCard(1234, "ate"), true));
		users.add(new User(5, "Dimitris", "Mpastas", new Email("mpastas@gmail.com"), new Password("oijasd23!"), 25, new CreditCard(9846, "pireos"), false));
		
	}
	
	@SuppressWarnings("deprecation")
	public void loadTrips() {
		trips.add(new Trip(0100,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 20),new Currency(425.5f, CurrencyNamesEnum.EURO),3,users.get(1)));
		trips.add(new Trip(0200,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 21),new Currency(425.5f, CurrencyNamesEnum.EURO),4,users.get(2)));
		trips.add(new Trip(0300,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 22),new Currency(425.5f, CurrencyNamesEnum.EURO),2,users.get(3)));
	}

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static ArrayList<Trip> getTrips() {
		return trips;
	}
	
	

}
