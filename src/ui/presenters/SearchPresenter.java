package ui.presenters;

import java.util.ArrayList;
import java.util.List;

import dao.TripDAO;
import domain.Trip;
import service.SearchServiceImpl;
import service.interfaces.SearchService;
import ui.views.SearchView;

public class SearchPresenter {
	
	private SearchView view;
	private SearchService search;
	String[] results;
	ArrayList<Trip> tripResults;
	
	
	/**
	 * 
	 */
	public SearchPresenter(SearchView view) {
		tripResults = new ArrayList<Trip>();
		setSearch(new SearchServiceImpl());
	} 
	
	protected SearchPresenter(SearchView view, TripDAO dao){
		tripResults = new ArrayList<Trip>();
		SearchServiceImpl src  = new SearchServiceImpl();
		src.setDAO(dao);
		setSearch(src);
	}
	
	public void setSearch(SearchService search){
		this.search = search;
	}
	
	public void start(){
		view.setSeachPresenter(this);
		view.open();
	}
	
	public String[] updateList(String country, String region, String town){
		tripResults = search.searchByPlace(country, region, town);
		
		if(tripResults.isEmpty()){
			results = new String[1];
			results[0] = "No results.";
			return results; 
		}
		results = new String[tripResults.size()];
		for (int i = 0 ; i < tripResults.size() ; i++){
			results[i]=(StringCreator(tripResults.get(i), i));
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
