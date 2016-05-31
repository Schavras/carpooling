package ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import service.LoginServiceImp;
import ui.presenters.ManageRequestPresenter;
import ui.presenters.NewTripPresenter;
import ui.presenters.SearchPresenter;
import ui.presenters.UserProfilePresenter;
import ui.views.ProfileView;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UserProfileUI extends DefaultJPanel implements ProfileView{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -72892101291699734L;
	
	JLabel lblName;
	JLabel lblLastName;
	JLabel lblEmail;
	
	private UserProfilePresenter presenter;
	 
	public UserProfileUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		lblName = new JLabel();
		lblName.setBounds(19, 54, 106, 14);
		add(lblName);

		lblLastName = new JLabel();
		lblLastName.setBounds(135, 54, 122, 14);
		add(lblLastName);
		
		lblEmail = new JLabel();
		lblEmail.setBounds(59, 79, 131, 14);
		add(lblEmail);
		
		ManageRequestsUI manage = new ManageRequestsUI();
		ManageRequestPresenter presenter = new ManageRequestPresenter(manage);

	
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
		btnSearchForA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				openSearch();
			}

		
		});
		btnSearchForA.setBounds(268, 111, 122, 23);
		add(btnSearchForA);
		
		JButton btnMakeNewTrip = new JButton("Make new Trip");
		btnMakeNewTrip.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startTrip();
			}
		});
		btnMakeNewTrip.setBounds(268, 75, 122, 23);
		add(btnMakeNewTrip);
		
		//TODO get requests number
		JButton btnRequests = new JButton("TRIP REQUESTS (" + presenter.getRequests().length + ")");
	btnRequests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				openTripRequest();
			}
		});
		btnRequests.setBounds(28, 227, 148, 23);
		add(btnRequests);
		
		JButton btnManageMyTrips = new JButton("Manage my Trips");
		btnManageMyTrips.setBounds(28, 270, 148, 23);
		add(btnManageMyTrips);
		
	
	}
	
	protected void openTripRequest() {
		ManageRequestsUI manage = new ManageRequestsUI();
		ManageRequestPresenter presenter = new ManageRequestPresenter(manage);
		presenter.start();
		manage.init();
		
		
	}

	private void startTrip() {
		NewTripUI newTrip = new NewTripUI();
		NewTripPresenter presenter =  new NewTripPresenter(newTrip);
		presenter.start();
		
	}

	void infoInit() {
		setName();
		setSurname();
		setEmail();
		
	}
	
	private void openSearch() {
		SearchUI search = new SearchUI();
		SearchPresenter presenter = new SearchPresenter(search);
		presenter.start();
		
	}

	@Override
	public void setUserProfilePresenter(UserProfilePresenter presenter) {
		 this.presenter = presenter;
	}
	@Override
	public void setSurname() {
		lblLastName.setText(presenter.getSurname());
		
	}
	@Override
	public void setEmail() {
		lblEmail.setText(presenter.getEmail());
		
	}
	
	public void setName(){
		lblName.setText(presenter.getName());
	}

	@Override
	public int setPendingRequestsNumberButton() {
		// TODO Auto-generated method stub
		return 0;
	}
}