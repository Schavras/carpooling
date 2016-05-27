package ui.presenters;

import java.util.ArrayList;
import java.util.List;

import domain.Trip;
import service.SearchServiceImpl;
import service.interfaces.SearchService;
import ui.views.SearchView;

public class SearchPresenter {
	
	private SearchView view;
	private SearchService search;
	ArrayList<String> results;
	ArrayList<Trip> TripResults;
	
	
	/**
	 * 
	 */
	public SearchPresenter(SearchView view) {
		results = new ArrayList<String>();
		TripResults = new ArrayList<Trip>();
		setSearch(new SearchServiceImpl());
	}
	
	public void setSearch(SearchService search){
		this.search = search;
	}
	
	public void start(){
		view.setSeachPresenter(this);
		view.open();
	}
	
	
	public ArrayList<String> updateList(String country, String region, String town){
		TripResults = search.searchByPlace(country, region, town);
		
		for (int i = 0 ; i < TripResults.size() ; i++){
			results.add(StringCreator(TripResults.get(i), i));
		}
		
		return results;
	}
	
	
	private String StringCreator(Trip trip, int index){
		if (trip==null){
			return "" ;
		}
		String str = ""	;
		
		//Index of result
		str+=index + ". ";
		
		//Name and surname of driver
		str+= trip.getDriver().getName()+ " " + trip.getDriver().getSurname() + " ";
		
		//total cost
		str+= trip.getTotalPrice().print();
		
		
		
		return str;
	}
}
