package ui;

import java.awt.Color;

import ui.presenters.ManageMyTripsPresenter;
import ui.presenters.SearchPresenter;
import ui.views.ManageMyTripsView;
import ui.views.SearchView;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractListModel;
import ui.DefaultJPanel;
import ui.presenters.ManageRequestPresenter;
import ui.views.ManageRequestsView;



public class ManageMyTripsUI extends DefaultJPanel implements ManageMyTripsView{
	
	private JList<String> list = new <String>JList();
	private DefaultListModel<String> resultModel;
	private ManageMyTripsPresenter presenter;
	private JButton btnRemove = new JButton("Remove from list");
	private String[] results;
	
	public ManageMyTripsUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		resultModel = new DefaultListModel<String>();
		
		list.setBounds(162, 84, 200, 201);
		list.setModel(resultModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(list);
		
		btnRemove.setForeground(new Color(0, 0, 102));
		btnRemove.setBackground(new Color(153, 0, 255));
		btnRemove.setBounds(177, 334, 175, 20);
		btnRemove.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		removeTrip();
        	}
        });
		add(btnRemove);
		
	}
	
	
	
	
	@Override
	public void removeTrip() {
		presenter.removeTrip(list.getSelectedIndex());
		 getRequests();
		
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
	public void setManageMyTripsPresenter(ManageMyTripsPresenter presenter) {
		// TODO Auto-generated method stub
		
	}

}
