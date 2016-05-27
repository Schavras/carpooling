package ui;

import java.awt.Color;
import java.awt.Component;

import memorydao.MemoryInitializer;
import ui.presenters.SearchPresenter;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.LayoutStyle.ComponentPlacement;

import domain.Trip;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import java.awt.ScrollPane;
import java.awt.Canvas;
import java.awt.TextArea;
import java.awt.Point;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class SearchUI extends DefaultJPanel{
	private JTextField txtCountry;
	private JTextField txtRegion;
	private JTextField txtTown;
	private JList<Trip> resultJList;
	private DefaultListModel resultModel;
	private JButton btnAdd;
	private SearchPresenter presenter;
	private JPanel contentPane;
	
	public SearchUI() {
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		txtCountry = new JTextField();
		txtCountry.setText("Country");
		txtCountry.setBackground(new Color(255, 255, 255));
		txtCountry.setBounds(10, 11, 129, 20);
		add(txtCountry);
		txtCountry.setColumns(10);
		
		txtRegion = new JTextField();
		txtRegion.setText("Region");
		txtRegion.setToolTipText("");
		txtRegion.setColumns(10);
		txtRegion.setBounds(10, 42, 129, 20);
		add(txtRegion);
		
		txtTown = new JTextField();
		txtTown.setText("Town");
		txtTown.setToolTipText("");
		txtTown.setColumns(10);
		txtTown.setBounds(10, 73, 129, 20);
		add(txtTown);
		
		JButton btnNewButton = new JButton("Search Trip");
		btnNewButton.setBounds(32, 149, 96, 23);
		add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner.setBounds(10, 118, 42, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_1.setBounds(62, 118, 42, 20);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(2016), new Integer(2016), null, new Integer(1)));
		spinner_2.setBounds(114, 118, 52, 20);
		add(spinner_2);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(10, 104, 28, 14);
		add(lblDay);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(62, 104, 42, 14);
		add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(114, 104, 28, 14);
		add(lblYear);
		
		JLabel lblSearchResults = new JLabel("Search Results");
		lblSearchResults.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSearchResults.setForeground(SystemColor.activeCaption);
		lblSearchResults.setBounds(277, 35, 137, 29);
		add(lblSearchResults);
		
		resultJList = new <Trip> JList();
		resultJList.setBounds(239, 75, 200, 313);
		resultJList.setModel(resultModel);
		resultJList.setCellRenderer(new DefaultListCellRenderer() {
			
            public Component getListCellRendererComponent(JList list,
                    Object value, int index, boolean isSelected, boolean cellHasFocus) {
               
                Trip resultTrip = (Trip) value;
                String line = String.valueOf(resultTrip.getDestination()) 
                	+ " " + resultTrip.getDriver() 
                	+ " " + resultTrip.getStatus()
                	+ " " + resultTrip.getTotalPrice()
                	+ " " + resultTrip.getMaxTravelers();
                	
                return super.getListCellRendererComponent(list, 
                		line, 
                		index, isSelected, cellHasFocus);
            }
        });
		
		resultJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		btnAdd = new JButton("Add Trip to my Trip List");
		btnAdd.setForeground(new Color(0, 0, 102));
		btnAdd.setBackground(new Color(153, 0, 255));
		btnAdd.setBounds(249, 406, 187, 20);
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//TODO na kanoume add to Trip sti lista
        		//presenter.addTrip();
        	}
        });
        
        resultJList.add("aaa",null);
        add(resultJList);
        add(btnAdd);
    }
        
}
