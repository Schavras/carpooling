package ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import service.LoginServiceImp;
import ui.presenters.UserProfilePresenter;
import ui.views.ProfileView;

import javax.swing.JButton;


public class UserProfileUI extends DefaultJPanel implements ProfileView{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -72892101291699734L;
	
	@SuppressWarnings("unused")
	private UserProfilePresenter presenter;
	 
	public UserProfileUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		JLabel lblNewLabel = new JLabel(LoginServiceImp.ACTIVE_USER.getName());
		lblNewLabel.setBounds(38, 168, 131, 14);
		add(lblNewLabel);
		

	
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBounds(351, 270, 89, 23);
		add(btnBack);
		
		JButton btnSearchForA = new JButton("Search for a Trip");
		btnSearchForA.setBounds(268, 111, 122, 23);
		add(btnSearchForA);
		
		JButton btnMakeNewTrip = new JButton("Make new Trip");
		btnMakeNewTrip.setBounds(268, 75, 122, 23);
		add(btnMakeNewTrip);
		
		JButton btnManageMyTrips = new JButton("Manage my Trips");
		btnManageMyTrips.setBounds(28, 227, 122, 23);
		add(btnManageMyTrips);
		
	}
	
	@Override
	public void setUserProfilePresenter(UserProfilePresenter presenter) {
		 this.presenter = presenter;
		
	}
	@Override
	public void setSurname(String surname) {
		// TODO ilipoiisi
		
	}
	@Override
	public void setEmail(String email) {
		// TODO ilipoiisi
		
	}
}