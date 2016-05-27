package ui.stubs;

import ui.views.View;

public abstract class ViewStub implements View {
	 private boolean opened;
	 
	@Override
	public void open() {
		opened = true;

	}

	@Override
	public void close() {
		opened = false;
	}

}
