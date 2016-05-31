package ui.presenters;

import java.util.ArrayList;
import dao.TripDAO;
import domain.Request;
import domain.Trip;
import service.LoginServiceImp;
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
		this.view = view;
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
	
	
	/**
	 * Generate a string with the information about the trip.
	 * The format is : {index}. {name} {surname} {cost}
	 * @param trip
	 * @param index
	 * @return
	 */
	private String StringCreator(Trip trip, int index){
		String str = ""	;
		if (trip==null){
			return str ;
		}
		//Index of result
		str+=index + ". ";
		//Name and surname of driver
		str+=  "by "+trip.getDriver().getName()+ " " + trip.getDriver().getSurname() + " ";
		//RatingSummary
		str+= "Rating: " + 	trip.getDriver().getAverageRate() + " ";
		//total cost
		str+= "Cost/Traveller: "+ trip.getCostPerTraveller().print();
			
		return str;
	}
	
	
	
	/**
	 *  Take the index of the selected sea4rch result, and sent a request for that trip
	 *  @param index the number of the search result
	 *  @param comment The comment of the request
	 */
	public void sentRequest(int index, String comment){
		
		Request req= new Request(comment, LoginServiceImp.ACTIVE_USER);
		if(tripResults==null || tripResults.isEmpty()) return ;
		tripResults.get(index).addRequest(req);
		
	}
	
	
	
}
