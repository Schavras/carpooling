package ui;
import java.awt.Color;

import ui.DefaultJPanel;
import ui.presenters.ManageRequestPresenter;
import ui.views.ManageRequestsView;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

import java.awt.Font;

import javax.swing.JButton;

public class ManageRequestsUI extends DefaultJPanel implements ManageRequestsView{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7649062668080087625L;
	ManageRequestPresenter presenter;
	String[] results;
	
	private JList<String> resultJList;
	private DefaultListModel<String> resultModel;
	
	public ManageRequestsUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		resultJList = new JList<String>();
		resultJList.setBounds(81, 71, 344, 282);
		resultModel = new DefaultListModel<String>();
		
		
		resultJList = new JList<String>();
		resultJList.setBounds(10, 75, 530, 170);
		resultJList.setModel(resultModel);
		resultJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(resultJList);
		
		JLabel lblNewLabel = new JLabel("My Trip Requests");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(154, 28, 239, 31);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Approve Selected");
		btnNewButton.setBounds(101, 313, 135, 23);
		add(btnNewButton);
		
		JButton btnRejectSelected = new JButton("Reject Selected");
		btnRejectSelected.setBounds(277, 313, 135, 23);
		add(btnRejectSelected);
	}

	@Override
	public void getRequests() {
		results = presenter.getRequests();
		resultModel.clear();
		
		for (int i = 0 ; i <  results.length ; i++){
			resultModel.addElement(results[i]);
		}
		

	}

	@Override
	public void init() {
		
		getRequests();
	}

	@Override
	public void setManageRequestPresenter(ManageRequestPresenter presenter) {
		this.presenter = presenter;
		
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
