package ui.stubs;

import ui.presenters.UserProfilePresenter;
import ui.views.ProfileView;

public class ProfileUIStub extends ViewStub implements ProfileView {

	UserProfilePresenter presenter;
	
	@Override
	public void back() {}

	@Override
	public int setPendingRequestsNumberButton() {
		return 0;
	}

	@Override
	public void setUserProfilePresenter(UserProfilePresenter presenter) {
		this.presenter = presenter;
		
	}

	@Override
	public void setName() {}

	@Override
	public void setSurname() {}

	@Override
	public void setEmail() {}

}
