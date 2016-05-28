package memorydao;

import java.util.Date;

import dao.InitializerDAO;
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


public class MemoryInitializer implements InitializerDAO {

	public  MemoryInitializer() {
		load();
	}
	 
	public void initialize(){
		 load();
	}
	
	public void load() {
		loadUsers();
		loadTrips();
	}
   
	  

	public void loadUsers() {
		
		UserMemoryDAO.users.add(new User(0, "Stavros", "Zarpas", new Email("stavros.z@hotmail.com"), new Password("klmr420"), 21, new CreditCard(420420420, "Eurobank"), true));
		UserMemoryDAO.users.add(new User(1, "Nikos", "Papapastamatakis", new Email("nikos.papastamatakis@gmail.com"), new Password("vaggelis"), 20, new CreditCard(420420421, "pireos"), true));
		UserMemoryDAO.users.add(new User(2, "Athanasia", "Karajohn", new Email("athanasia@gmail.com"), new Password("lala"), 22, new CreditCard(426520421, "pireos"), true));
		UserMemoryDAO.users.add(new User(3, "Dwra", "Dervi", new Email("dwra.dervi@gmail.com"), new Password("dwroul"), 4, new CreditCard(1239871, "alfabank"), true));
		UserMemoryDAO.users.add(new User(4, "Dimitris", "Labouris", new Email("fuck.vodka@gmail.com"), new Password("poligono420"), 20, new CreditCard(1234, "ate"), true));
		UserMemoryDAO.users.add(new User(5, "Dimitris", "Mpastas", new Email("mpastas@gmail.com"), new Password("oijasd23!"), 25, new CreditCard(9846, "pireos"), false));
		
	}
	
	@SuppressWarnings("deprecation")
	public void loadTrips() {
		TripMemoryDAO.trips.add(new Trip(0100,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 20),new Currency(425.5f, CurrencyNamesEnum.EURO),3,UserMemoryDAO.users.get(1)));
		TripMemoryDAO.trips.add(new Trip(0200,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 21),new Currency(425.5f, CurrencyNamesEnum.EURO),4,UserMemoryDAO.users.get(2)));
		TripMemoryDAO.trips.add(new Trip(0300,new Place("Greece", "Attiki", "athens"),new Place("Greece", "Makedonia","Thessaoniki"),new Date(2016, 4, 22),new Currency(425.5f, CurrencyNamesEnum.EURO),2,UserMemoryDAO.users.get(3)));
		TripMemoryDAO.trips.add(new Trip(0400,new Place("Greece", "Attiki", "athens"),new Place("aa", "aa","aa"),new Date(2016, 4, 22),new Currency(425.5f, CurrencyNamesEnum.EURO),2,UserMemoryDAO.users.get(3)));
		TripMemoryDAO.trips.add(new Trip(0400,new Place("Greece", "Attiki", "athens"),new Place("aa", "aa","aa"),new Date(2016, 4, 22),new Currency(800.0f, CurrencyNamesEnum.EURO),2,UserMemoryDAO.users.get(2)));
	}
	

}
