package ui.stubs;

import ui.presenters.SearchPresenter;
import ui.views.SearchView;

public class SearchUIStub extends ViewStub implements SearchView {



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
	public String getComment() {
		// TODO Auto-generated method stub
		return null;
	}


}
