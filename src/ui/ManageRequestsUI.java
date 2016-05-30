package ui;
import java.awt.Color;

import ui.DefaultJPanel;
import ui.views.ManageRequestsView;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ManageRequestsUI extends DefaultJPanel implements ManageRequestsView{
	
	public ManageRequestsUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		JList list = new JList();
		list.setBounds(81, 71, 344, 282);
		add(list);
		
		JLabel lblNewLabel = new JLabel("My Trip Requests");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(154, 28, 239, 31);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Approve Selected");
		btnNewButton.setBounds(106, 364, 135, 23);
		add(btnNewButton);
		
		JButton btnRejectSelected = new JButton("Reject Selected");
		btnRejectSelected.setBounds(269, 364, 135, 23);
		add(btnRejectSelected);
	}

	@Override
	public String[] getRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
