package memorydao;

import java.util.ArrayList;
import java.util.Date;

import types.Email;
import types.Password;
import types.currency.Currency;
import types.currency.CurrencyNamesEnum;
import dao.TripDAO;
import domain.Place;
import domain.Trip;
import domain.User;

public class TripMemoryDAOStub implements TripDAO{
	
	private ArrayList<Trip> trips = new ArrayList<Trip>();
	
	User user1 = new User(0, "first", "user", new Email("first@email"), new Password() , true);
	User user2 = new User(1, "second", "user", new Email("second@email"), new Password() , true);
	User user3 = new User(2, "third", "user", new Email("third@email"), new Password() , true);
	User user4 = new User(3, "forth", "user", new Email("forth@email"), new Password() , true);
	
	
	public TripMemoryDAOStub(){
		trips.add(new Trip(0100,new Place("Greece", "Attiki", "athens"),new Place("country1", "region1","town1"),new Date(2016, 4, 20),new Currency(425.5f, CurrencyNamesEnum.EURO),3,user1));
		trips.add(new Trip(0200,new Place("Greece", "Attiki", "athens"),new Place("country1", "region1","town1"),new Date(2016, 4, 21),new Currency(425.5f, CurrencyNamesEnum.EURO),4,user2));
		trips.add(new Trip(0300,new Place("Greece", "Attiki", "athens"),new Place("country2", "region2","town2"),new Date(2016, 4, 22),new Currency(425.5f, CurrencyNamesEnum.EURO),2,user3));
		trips.add(new Trip(0400,new Place("Greece", "Attiki", "athens"),new Place("country2", "region2","town1"),new Date(2016, 4, 22),new Currency(425.5f, CurrencyNamesEnum.EURO),2,user1));
		trips.add(new Trip(0500,new Place("Greece", "Attiki", "athens"),new Place("country1", "region1","town1"),new Date(2016, 4, 22),new Currency(425.5f, CurrencyNamesEnum.EURO),2,user4));
		
	}
	
	
	@Override
	public ArrayList<Trip> findByDestination(String country, String region,
			String town) {
		ArrayList<Trip> result = new ArrayList<Trip>();
		result.add(trips.get(0));
		result.add(trips.get(1));
		result.add(trips.get(4));
		
		return result;
	}

	@Override
	public ArrayList<Trip> findByDestination(Place place) {
		ArrayList<Trip> result = new ArrayList<Trip>();
		result.add(trips.get(0));
		result.add(trips.get(1));
		result.add(trips.get(4));

		return result;
	}

	@Override
	public User findByDriver(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNewTrip(Trip new_trip) {
		// TODO Auto-generated method stub
		return false;
	}

}
