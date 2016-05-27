package service.interfaces;

import java.util.ArrayList;
import domain.Trip;


public interface SearchService {
	
	ArrayList<Trip> searchByPlace(String country, String region, String town);
	
}
