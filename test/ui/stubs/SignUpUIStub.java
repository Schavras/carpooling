package ui.stubs;

import ui.presenters.SignUpPresenter;
import ui.views.SignUpView;

public class SignUpUIStub extends ViewStub implements SignUpView {

	@SuppressWarnings("unused")
	private SignUpPresenter presenter;

	@Override
	public void back() {}

	@Override
	public String getName() {
		return "name";
	}

	@Override
	public String getSurname() {
		return "surname";
	}

	@Override
	public String getEmail() {
		return "email";
	}

	@Override
	public String getPassword() {
		return "password";
	}

	@Override
	public String getAge() {
		return "20";
	}

	@Override
	public String getCreditNumber() {
		return "123";
	}

	@Override
	public String getCreditBank() {
		return "bank";
	}

	@Override
	public void signup() {}

	@Override
	public void setSignUpPresenter(SignUpPresenter presenter) {
		this.presenter = presenter;
	}

}
