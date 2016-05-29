package ui;

import java.awt.Color;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JPasswordField;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import service.LoginServiceImp;
import ui.presenters.SignUpPresenter;
import ui.presenters.UserProfilePresenter;
import ui.views.ProfileView;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;


public class UserProfileUI extends DefaultJPanel implements ProfileView{
	
	private UserProfilePresenter presenter;
	 
	public UserProfileUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		JLabel lblName = new JLabel(LoginServiceImp.ACTIVE_USER.getName());
		lblName.setBounds(19, 54, 106, 14);
		add(lblName);

		

	
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
		
		JLabel lblEmail = new JLabel(LoginServiceImp.ACTIVE_USER.getEmail().getFullEmailAdress());
		lblEmail.setBounds(59, 79, 131, 14);
		add(lblEmail);
		
		JLabel lblLastName = new JLabel();
		lblLastName.setBounds(135, 54, 122, 14);
		add(lblLastName);
		
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