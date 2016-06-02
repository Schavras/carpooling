package ui.stubs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ui.presenters.ManageRequestPresenter;
import ui.views.ManageRequestsView;

public class ManageRequestUIStub extends ViewStub implements ManageRequestsView {

	ManageRequestPresenter presenter;
	String[] results;
	


	@Override
	public void setManageRequestPresenter(ManageRequestPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public void getRequests() {
		results = new String[2];
		results[0] = "First request";
		results[1] = "Second request";
	}
	
	@Override
	public void back() {}

	@Override
	public void init() {
		 getRequests();
		
	}

	@Override
	public void approve() {}

	@Override
	public void reject() {}

	

}
