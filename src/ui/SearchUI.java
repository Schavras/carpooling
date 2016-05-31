package ui;

import java.awt.Color;
import ui.presenters.SearchPresenter;
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

public class SearchUI extends DefaultJPanel implements SearchView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtCountry;
	private JTextField txtRegion;
	private JTextField txtTown;
	private JTextArea txtrWriteAComment;
	private JList<String> resultJList;
	private DefaultListModel<String> resultModel;
	private JButton btnAdd;
	private SearchPresenter presenter;
	private String[] results;
	
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
		
		JButton searchBtn = new JButton("Search Trip");
		searchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				updateList();
			}
		});
		
		searchBtn.setBounds(43, 149, 96, 23);
		add(searchBtn);
		
		JSpinner daySelector = new JSpinner();
		daySelector.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		daySelector.setBounds(10, 118, 42, 20);
		add(daySelector);
		
		JSpinner monthSelector = new JSpinner();
		monthSelector.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		monthSelector.setBounds(62, 118, 42, 20);
		add(monthSelector);
		
		JSpinner yearSelector = new JSpinner();
		yearSelector.setModel(new SpinnerNumberModel(new Integer(2016), new Integer(2016), null, new Integer(1)));
		yearSelector.setBounds(114, 118, 52, 20);
		add(yearSelector);
		
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
		

		resultModel = new DefaultListModel<String>();
		
		
		resultJList = new JList<String>();
		resultJList.setBounds(195, 75, 345, 344);
		resultJList.setModel(resultModel);
		resultJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(resultJList);
		
		btnAdd = new JButton("Add Trip to my Trip List");
		btnAdd.setForeground(new Color(0, 0, 102));
		btnAdd.setBackground(new Color(153, 0, 255));
		btnAdd.setBounds(10, 399, 175, 20);
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		sentRequest();
        	}
        });
        
     
        add(btnAdd);
        
        txtrWriteAComment = new JTextArea();
        txtrWriteAComment.setText("Write a comment...");
        txtrWriteAComment.setWrapStyleWord(true);
        txtrWriteAComment.setToolTipText("Write a comment...");
        txtrWriteAComment.setFont(new Font("Monospaced", Font.ITALIC, 12));
        txtrWriteAComment.setForeground(Color.BLUE);
        txtrWriteAComment.setLineWrap(true);
        txtrWriteAComment.setBounds(10, 299, 175, 89);
        add(txtrWriteAComment);
    }

	@Override
	public String getCountry() {
		return txtCountry.getText();
	}

	@Override
	public String getRegion() {
		return txtRegion.getText();
	}

	@Override
	public String getTown() {
		return txtTown.getText();
	}

	@Override
	public String getComment() {
		return txtrWriteAComment.getText();
	}

	@Override
	public void updateList() {
		results = presenter.updateList(getCountry(), getRegion(), getTown());
		resultModel.clear();
		
		for (int i = 0 ; i <  results.length ; i++){
			resultModel.addElement(results[i]);
		}
		 
		
	}

	@Override
	public void sentRequest() {
		presenter.sentRequest(resultJList.getSelectedIndex(), getComment());
		back();
		
	}

	@Override
	public void setSeachPresenter(SearchPresenter searchPresenter) {
		this.presenter = searchPresenter;
		
	}
}
