package ui.views;

import ui.presenters.NewTripPresenter;

public interface NewTripView extends View {

	void setNewTripPresenter(NewTripPresenter presenter);
	
	public String getNumberOfTravelers();
	
	public String getCurrency();
	
	public String getPrice();
	
	public String getYear();
	
	public String getMonth();
	
	public String getDay();
	
	public String getDComment();
	
	public String getDTown();
	
	public String getDRegion();
	
	public String getDCountry();
	
	public String getSComment();
	
	public String getSTown();

	public String getSRegion();
	
	public String getSCountry();
	
}
