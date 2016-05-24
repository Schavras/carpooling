package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewTripUI extends JPanel{

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
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JTextField price;
	private JTextField not;
	
	
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
		
		JLabel lblNot = new JLabel("Number of Travellers");
		lblNot.setBounds(10, 280, 120, 14);
		add(lblNot);
		
		
		
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
		
		day = new JTextField();
		day.setBounds(125, 240, 50, 20);
		day.setToolTipText("Insert day");
		add(day);
		day.setColumns(20);
		
		month = new JTextField();
		month.setBounds(180, 240, 50, 20);
		month.setToolTipText("Insert month");
		add(month);
		month.setColumns(20);
		
		year = new JTextField();
		year.setBounds(235, 240, 50, 20);
		year.setToolTipText("Insert year");
		add(year);
		year.setColumns(20);
		
		price = new JTextField();
		price.setBounds(125, 260, 50, 20);
		price.setToolTipText("Insert price");
		add(price);
		price.setColumns(20);
		
		not = new JTextField();
		not.setBounds(130, 280, 45, 20);
		not.setToolTipText("Insert the available number of travellers");
		add(not);
		not.setColumns(20);
		
		
		
	}
		
}