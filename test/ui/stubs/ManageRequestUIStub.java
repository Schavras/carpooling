package ui.stubs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ui.presenters.ManageRequestPresenter;
import ui.views.ManageRequestsView;

public class ManageRequestUIStub extends ViewStub implements ManageRequestsView {

	ManageRequestPresenter presenter;
	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setManageRequestPresenter(ManageRequestPresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public void getRequests() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		
	}

	

}
