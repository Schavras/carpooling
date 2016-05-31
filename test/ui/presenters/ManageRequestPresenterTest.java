package ui.presenters;

import static org.junit.Assert.*;
import memorydao.TripMemoryDAO;

import org.junit.Before;
import org.junit.Test;

import ui.ManageRequestsUI;
import ui.stubs.ManageRequestUIStub;

public class ManageRequestPresenterTest {

	ManageRequestPresenter presenter;
	ManageRequestUIStub view;
	
	@Before
	public void setUp() throws Exception {
		presenter  = new ManageRequestPresenter(view);
		presenter.setDao(new TripMemoryDAO());
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
