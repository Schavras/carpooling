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
		
		JLabel lblNewLabel = new JLabel(LoginServiceImp.ACTIVE_USER.getName());
		lblNewLabel.setBounds(38, 168, 131, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Athanasia\\Downloads\\rsz_5c34ddf69fa711e3b9ca1287e245a320_8.jpg"));
		lblNewLabel_1.setBounds(10, 11, 159, 150);
		add(lblNewLabel_1);
	
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
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