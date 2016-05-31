package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ui.presenters.SignUpPresenter;
import ui.views.SignUpView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpUI extends DefaultJPanel implements SignUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 770324917071752792L;
	private JTextField name;
	private JTextField surname;
	private JTextField email;
	private JTextField password;
	private JTextField age;
	private JTextField ccnumber;
	private JTextField ccbank;

	/**
	 * Create the panel.
	 */

	NewTripUI nt;
	
	@SuppressWarnings("unused")
	private SignUpPresenter presenter;
	
	public SignUpUI() {
		setLayout(null);
		
		setBackground(new Color(204, 255, 255));
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 46, 14);
		add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(10, 32, 46, 14);
		add(lblSurname);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 54, 46, 14);
		add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 79, 46, 14);
		add(lblPassword);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 104, 46, 14);
		add(lblAge);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card ");
		lblCreditCardNumber.setBounds(10, 129, 64, 32);
		add(lblCreditCardNumber);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(10, 151, 46, 14);
		add(lblNumber);
		
		JLabel lblCreditCard = new JLabel("Credit Card");
		lblCreditCard.setBounds(10, 172, 64, 14);
		add(lblCreditCard);
		
		JLabel lblBank = new JLabel("Bank");
		lblBank.setBounds(10, 183, 46, 14);
		add(lblBank);
		
		name = new JTextField();
		name.setBounds(76, 8, 150, 20);
		add(name);
		name.setColumns(10);
		
		surname = new JTextField();
		surname.setBounds(76, 29, 150, 20);
		add(surname);
		surname.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(76, 51, 150, 20);
		add(email);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(76, 76, 150, 20);
		add(password);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(76, 101, 46, 20);
		add(age);
		
		ccnumber = new JTextField();
		ccnumber.setColumns(10);
		ccnumber.setBounds(76, 135, 150, 20);
		add(ccnumber);
		
		ccbank = new JTextField();
		ccbank.setColumns(10);
		ccbank.setBounds(76, 169, 150, 20);
		add(ccbank);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				signup();
				
			}
		});
		btnSignUp.setBounds(10, 218, 89, 23);
		add(btnSignUp);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				close();
			}
		});
		btnBack.setBounds(110, 218, 89, 23);
		add(btnBack);
		
	}

	@Override
	public void setSignUpPresenter(SignUpPresenter presenter) {
		 this.presenter = presenter;
	}
	
	 public void signup(){
		presenter.signup(
				getName(),
				getSurname(),
				getEmail(),
				getPassword(),
				getAge(),
				getCreditNumber(),
				getCreditBank()
				);
	}

	 public String getName() {
		return name.getText();
	}
	 
	 
	@Override
	public String getSurname() {
		return surname.getText();
	}

	@Override
	public String getEmail() {
		return email.getText();
	}

	@Override
	public String getPassword() {
		return password.getText();
	}

	@Override
	public String getAge() {
		return age.getText();
	}

	@Override
	public String getCreditNumber() {
		return ccnumber.getText();
	}
	
	public String getCreditBank(){
		return ccbank.getText();
	}
	
	
}
