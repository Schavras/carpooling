package ui;

import java.awt.Color;

import ui.views.RatingView;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.MAGENTA);
		comboBox.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" *", " * *", "* * *", "* * * *", "* * * * *"}));
		comboBox.setBounds(215, 97, 124, 20);
		add(comboBox);
		
		
	}
}
