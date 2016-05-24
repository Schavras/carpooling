package ui;

import javax.swing.JPanel;

import ui.views.View;

public class DefaultJPanel extends JPanel implements View {

	@Override
	public void open() {
		
		MainUI.scenes.add(this,this.toString());
		System.out.println(this.toString());
		MainUI.cl.show(MainUI.scenes, this.toString());
		
		MainUI.frmCarpooling.getContentPane().add(MainUI.scenes);

	}

	@Override
	public void close() {
		
		//TODO na doume ti vazoume edw mesa
	}

}
