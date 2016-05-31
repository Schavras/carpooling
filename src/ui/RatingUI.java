package ui;

import java.awt.Color;

import ui.views.RatingView;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class RatingUI extends DefaultJPanel implements RatingView{
	
	public RatingUI(){
		setLayout(null);
		setBackground(new Color(204, 255, 255));
		
		JLabel lblNewLabel = new JLabel("Do you wish to rate your co-traveller?");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(76, 11, 508, 75);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit Rate");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBounds(315, 363, 162, 39);
		add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.MAGENTA);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnCancel.setBackground(Color.PINK);
		btnCancel.setBounds(76, 363, 162, 39);
		add(btnCancel);
		
		JTextPane txtpnLeaveAComment = new JTextPane();
		txtpnLeaveAComment.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtpnLeaveAComment.setText("Leave a comment..");
		txtpnLeaveAComment.setBounds(100, 134, 335, 207);
		add(txtpnLeaveAComment);
		
		JCheckBox chckbxGood = new JCheckBox("Terrible");
		chckbxGood.setBackground(Color.CYAN);
		chckbxGood.setBounds(70, 93, 67, 23);
		add(chckbxGood);
		
		JCheckBox chckbxBad = new JCheckBox("Bad");
		chckbxBad.setBackground(Color.CYAN);
		chckbxBad.setBounds(166, 93, 49, 23);
		add(chckbxBad);
		
		JCheckBox chckbxMedium = new JCheckBox("Medium");
		chckbxMedium.setBackground(Color.CYAN);
		chckbxMedium.setSelected(true);
		chckbxMedium.setBounds(245, 93, 67, 23);
		add(chckbxMedium);
		
		JCheckBox checkBox_2 = new JCheckBox("Good");
		checkBox_2.setBackground(Color.CYAN);
		checkBox_2.setBounds(335, 93, 58, 23);
		add(checkBox_2);
		
		JCheckBox chckbxTheBest = new JCheckBox("The best");
		chckbxTheBest.setBackground(Color.CYAN);
		chckbxTheBest.setBounds(426, 93, 67, 23);
		add(chckbxTheBest);
		
		
	}
}
