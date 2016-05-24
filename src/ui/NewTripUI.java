package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
	private JTextField StartingPoint;
	private JTextField DateOfDeparture;
	
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
		
		
		
		
		
		
		Place = new JTextField();
		Place.setBounds(125, 20, 200, 20);
		add(Place);
		Place.setColumns(20);
		
		Country = new JTextField();
		Country.setBounds(125, 40, 200, 20);
		add(Country);
		Country.setColumns(10);
		
		Region = new JTextField();
		Region.setBounds(125, 60, 200, 20);
		add(Region);
		Region.setColumns(20);
		
		Town = new JTextField();
		Town.setBounds(125, 80, 200, 20);
		add(Town);
		Town.setColumns(20);
		
		Comment = new JTextField();
		Comment.setBounds(125, 100, 200, 20);
		add(Comment);
		Comment.setColumns(20);
		
		PlaceB = new JTextField();
		PlaceB.setBounds(125, 140, 200, 20);
		add(PlaceB);
		PlaceB.setColumns(20);
		
		CountryB = new JTextField();
		CountryB.setBounds(125, 160, 200, 20);
		add(CountryB);
		CountryB.setColumns(20);
		
		RegionB = new JTextField();
		RegionB.setBounds(125, 180, 200, 20);
		add(RegionB);
		RegionB.setColumns(20);
		
		TownB = new JTextField();
		TownB.setBounds(125, 200, 200, 20);
		add(TownB);
		TownB.setColumns(20);
		
		CommentB = new JTextField();
		CommentB.setBounds(125, 220, 200, 20);
		add(CommentB);
		CommentB.setColumns(20);
	}
}
