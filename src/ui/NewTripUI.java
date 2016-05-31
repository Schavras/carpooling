package ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

import ui.presenters.NewTripPresenter;
import ui.views.NewTripView;

public class NewTripUI extends DefaultJPanel implements NewTripView{

	/**
	 * 
	 */
	private static final long serialVersionUID = 145455645;
	
	
	
	
	private JTextField Country;
	private JTextField CountryB;
	private JTextField Region;
	private JTextField RegionB;
	private JTextField Town;
	private JTextField TownB;
	private JTextField Comment;
	private JTextField CommentB;	
	private JTextField price;
	private JSpinner spinner = new JSpinner();
	private JSpinner dayspinner; 
	private JSpinner monthspinner;
	private JSpinner yearspinner;
	private JComboBox<String> currency;

	//TODO vale oles tis metavlites apo ta JTextfield pou exoume
	JLabel lblCountry ;


	private NewTripPresenter presenter;
	
	
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public NewTripUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		
		JLabel lblStartingPoint = new JLabel("Starting Point:");
		lblStartingPoint.setBounds(10, 15, 120, 14);
		add(lblStartingPoint);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(50, 40, 120, 14);
		add(lblCountry);
		
		JLabel lblRegion = new JLabel("Region");
		lblRegion.setBounds(50, 60, 120, 14);
		add(lblRegion);
		
		JLabel lblTown = new JLabel("Town");
		lblTown.setBounds(50, 80, 120, 14);
		add(lblTown);
		
		JLabel lblComment = new JLabel("Comment");
		lblComment.setBounds(50, 100, 120, 14);
		add(lblComment);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(10, 135, 120, 14);
		add(lblDestination);
		
		JLabel lblCountryB = new JLabel("Country");
		lblCountryB.setBounds(50, 160, 120, 14);
		add(lblCountryB);
		
		JLabel lblRegionB = new JLabel("Region");
		lblRegionB.setBounds(50, 180, 120, 14);
		add(lblRegionB);
		
		JLabel lblTownB = new JLabel("Town");
		lblTownB.setBounds(50, 200, 120, 14);
		add(lblTownB);
		
		JLabel lblCommentB = new JLabel("Comment");
		lblCommentB.setBounds(50, 220, 120, 14);
		add(lblCommentB);
		
		JLabel lblDateOfDeparture = new JLabel("Date of Departure");
		lblDateOfDeparture.setBounds(10, 240, 120, 14);
		add(lblDateOfDeparture);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 260, 120, 14);
		add(lblPrice);
		
		JLabel lblTravellers = new JLabel("Travellers");
		lblTravellers.setBounds(10, 280, 120, 14);
		add(lblTravellers);
		
		Country = new JTextField();
		Country.setBounds(125, 40, 200, 20);
		Country.setToolTipText("Insert PickUp Country");
		add(Country);
		Country.setColumns(10);
		
		Region = new JTextField();
		Region.setBounds(125, 60, 200, 20);
		Region.setToolTipText("Insert PickUp Region");
		add(Region);
		Region.setColumns(20);
		
		Town = new JTextField();
		Town.setBounds(125, 80, 200, 20);
		Town.setToolTipText("Insert PickUp Town");
		add(Town);
		Town.setColumns(20);
		
		Comment = new JTextField();
		Comment.setBounds(125, 100, 200, 20);
		Comment.setToolTipText("Leave a comment");
		add(Comment);
		Comment.setColumns(20);
		
		CountryB = new JTextField();
		CountryB.setBounds(125, 160, 200, 20);
		CountryB.setToolTipText("Insert Destination's Country");
		add(CountryB);
		CountryB.setColumns(20);
		
		RegionB = new JTextField();
		RegionB.setBounds(125, 180, 200, 20);
		RegionB.setToolTipText("Insert Destination's Region");
		add(RegionB);
		RegionB.setColumns(20);
		
		TownB = new JTextField();
		TownB.setBounds(125, 200, 200, 20);
		TownB.setToolTipText("Insert Destination's Town");
		add(TownB);
		TownB.setColumns(20);
		
		CommentB = new JTextField();
		CommentB.setBounds(125, 220, 200, 20);
		CommentB.setToolTipText("Leave a comment");
		add(CommentB);
		CommentB.setColumns(20);
		
		price = new JTextField();
		price.setBounds(125, 260, 50, 20);
		price.setToolTipText("Insert price");
		add(price);
		price.setColumns(20);
		
		dayspinner = new JSpinner();
		dayspinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		dayspinner.setBounds(125, 241, 50, 20);
		dayspinner.setToolTipText("Trip's Day");
		add(dayspinner);
		
		monthspinner = new JSpinner();
		monthspinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		monthspinner.setBounds(174, 241, 50, 20);
		monthspinner.setToolTipText("Trip's Month");
		add(monthspinner);
		
		//TODO na to doume giati to emfanizei 2,016 <--
		yearspinner = new JSpinner();
		yearspinner.setModel(new SpinnerNumberModel(new Integer(2016), new Integer(2016), null, new Integer(1)));
		yearspinner.setBounds(223, 241, 50, 20);
		yearspinner.setToolTipText("Trip's Year");
		add(yearspinner);
		
		
		currency = new JComboBox<String>();
		currency.setModel(new DefaultComboBoxModel<String>(new String[] {"Euros", "Dollars"}));
		currency.setMaximumRowCount(2);
		currency.setBounds(174, 260, 67, 20); 
		add(currency);
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(125, 280, 50, 20); 
		add(spinner);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				createTrip();
			}
		});
		btnCreate.setBounds(351, 243, 89, 23);
		add(btnCreate);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBounds(351, 270, 89, 23);
		add(btnBack);
		
		
		
	}

	public void createTrip(){
		presenter.newtrip(getSCountry(), getSRegion(), getSTown(), getSComment(), getDCountry(), getDRegion(), 
							getDTown(), getDComment(), getDay(), getMonth(), 
							getYear(), getPrice(), getCurrency(), getNumberOfTravelers());
		close();
	}
	
	public String getNumberOfTravelers(){
		return String.valueOf(spinner.getValue());
	}
	
	public String getCurrency(){
		return String.valueOf(currency.getSelectedItem());
	}
	
	public String getPrice(){
		return price.getText();
	}
	
	public String getYear(){
		return String.valueOf(yearspinner.getValue());
	}
	
	public String getMonth(){
		return String.valueOf(monthspinner.getValue());
	}
	
	public String getDay(){
		return String.valueOf(dayspinner.getValue());
	}
	
	public String getDComment(){
		return CommentB.getText();
	}
	
	public String getDTown(){
		return TownB.getText();
	}
	
	public String getDRegion(){
		return RegionB.getText();
	}
	
	public String getDCountry(){
		return CountryB.getText();
	}
	
	public String getSComment(){
		return Comment.getText();
	}
	
	public String getSTown(){
		return Town.getText();
	}
	
	public String getSRegion(){
		return Region.getText();
	}
	
	public String getSCountry(){
		return Country.getText();
	}
	
	
	@Override
	public void setNewTripPresenter(NewTripPresenter presenter) {
		this.presenter = presenter;
		
	}
	
	
}