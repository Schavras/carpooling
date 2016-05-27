package service.interfaces;

import java.util.ArrayList;
import java.util.List;

import domain.Trip;


public interface SearchService {
	
	ArrayList<Trip> searchByPlace(String country, String region, String town);
	
}
