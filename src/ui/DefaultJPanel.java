package ui;

import javax.swing.JPanel;

import ui.views.View;

public class DefaultJPanel extends JPanel implements View {

	@Override
	public void open() {
		
		MainUI.scenes.add(this,this.toString());
		MainUI.cl.next(MainUI.scenes);
	

	}

	@Override
	public void close() {
		
		MainUI.cl.previous(MainUI.scenes);
	}

}
