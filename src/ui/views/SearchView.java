package ui.views;

import ui.presenters.SearchPresenter;


//TODO add javadoc
public interface SearchView extends View{
	
	String getCountry();
	
	String getRegion();
	
	String getTown();
	
	String getComment();
	
	void updateList(/* TODO tha doume ti thelei san orisma*/);
	
	void sentRequest(/* TODO tha doume ti thelei san orisma*/);

	void setSeachPresenter(SearchPresenter searchPresenter);
	
}
