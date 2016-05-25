package ui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class NewTripUI extends DefaultJPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 145455645;
	private JTextField Place;
	private JTextField PlaceB;
	private JTextField Country;
	private JTextField CountryB;
	private JTextField Region;
	private JTextField RegionB;
	private JTextField Town;
	private JTextField TownB;
	private JTextField Comment;
	private JTextField CommentB;	
	private JTextField price;
	private final JSpinner spinner = new JSpinner();
	
	
	/**
	 * Create the panel.
	 */
	public NewTripUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		
		JLabel lblStartingPoint = new JLabel("Starting Point:");
		lblStartingPoint.setBounds(10, 0, 120, 14);
		add(lblStartingPoint);
		
		JLabel lblPlace = new JLabel("Place");
		lblPlace.setBounds(50, 20 , 120, 14);
		add(lblPlace);
		
		JLabel lblCountry = new JLabel("Country");
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
		lblDestination.setBounds(10, 120, 120, 14);
		add(lblDestination);
		
		JLabel lblPlaceB = new JLabel("Place");
		lblPlaceB.setBounds(50, 140, 120, 14);
		add(lblPlaceB);
		
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
		
		
		
		Place = new JTextField();
		Place.setBounds(125, 20, 200, 20);
		Place.setToolTipText("Insert PickUp Place");
		add(Place);
		Place.setColumns(20);
		
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
		
		PlaceB = new JTextField();
		PlaceB.setBounds(125, 140, 200, 20);
		PlaceB.setToolTipText("Insert Destination's Place");
		add(PlaceB);
		PlaceB.setColumns(20);
		
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
		
		JSpinner dayspinner = new JSpinner();
		dayspinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		dayspinner.setBounds(125, 241, 50, 20);
		dayspinner.setToolTipText("Trip's Day");
		add(dayspinner);
		
		JSpinner monthspinner = new JSpinner();
		monthspinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		monthspinner.setBounds(174, 241, 50, 20);
		monthspinner.setToolTipText("Trip's Month");
		add(monthspinner);
		
		JSpinner yearspinner = new JSpinner();
		yearspinner.setModel(new SpinnerNumberModel(new Integer(2016), new Integer(2016), null, new Integer(1)));
		yearspinner.setBounds(223, 241, 50, 20);
		yearspinner.setToolTipText("Trip's Year");
		add(yearspinner);
		
		JComboBox Currency = new JComboBox();
		Currency.setModel(new DefaultComboBoxModel(new String[] {"Euros", "Dollars"}));
		Currency.setMaximumRowCount(2);
		Currency.setBounds(174, 260, 67, 20);
		add(Currency);
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(125, 280, 50, 20);
		add(spinner);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(351, 243, 89, 23);
		add(btnNext);
		
		
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
}