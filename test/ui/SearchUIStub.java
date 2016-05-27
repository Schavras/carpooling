package ui;

import ui.presenters.SearchPresenter;
import ui.views.SearchView;

public class SearchUIStub implements SearchView {



	@Override
	public void back() {}

	@Override
	public String getCountry() {
		return "country1";
	}

	@Override
	public String getRegion() {
		return "region1";
	}

	@Override
	public String getTown() {
		return "town1";
	}

	@Override
	public void updateList() {}

	@Override
	public void sentRequest() {	}

	@Override
	public void setSeachPresenter(SearchPresenter searchPresenter) {}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {}

}
