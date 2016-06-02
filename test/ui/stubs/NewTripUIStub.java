package ui.stubs;

import ui.presenters.NewTripPresenter;
import ui.views.NewTripView;

public class NewTripUIStub extends ViewStub implements NewTripView {

	NewTripPresenter presenter;
	
	@Override
	public void back() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNewTripPresenter(NewTripPresenter presenter) {
		this.presenter = presenter;

	}

	@Override
	public String getNumberOfTravelers() {
		return "4";
	}

	@Override
	public String getCurrency() {
		return "Euros";
	}

	@Override
	public String getPrice() {
		return "40";
	}

	@Override
	public String getYear() {
		return "2016";
	}

	@Override
	public String getMonth() {
		return "1";
	}

	@Override
	public String getDay() {
		return "1";
	}

	@Override
	public String getDComment() {
		return "d comment";
	}

	@Override
	public String getDTown() {
		return "d town";
	}

	@Override
	public String getDRegion() {
		return "d region";
	}

	@Override
	public String getDCountry() {
		return "d country";
	}

	@Override
	public String getSComment() {
		return "s comment";
	}

	@Override
	public String getSTown() {
		return "s town";
	}

	@Override
	public String getSRegion() {
		return "s region";
	}

	@Override
	public String getSCountry() {
		return "s country";
	}

}
