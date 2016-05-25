package ui;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JPasswordField;

import service.LoginServiceImp;
import ui.presenters.LoginPresenter;
import ui.presenters.SignUpPresenter;
import ui.presenters.UserProfilePresenter;
import ui.views.LoginView;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginUI extends DefaultJPanel implements LoginView{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7054777390854307971L;
	private JTextField emailTF;
	private JPasswordField passwordField;
	
	private LoginPresenter presenter;
	boolean succededlogin;
	JLabel loginErrorMsg;
	
	SignUpUI su;
	/**
	 * Create the panel.
	 */
	public LoginUI() {
		setBackground(new Color(204, 255, 255));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			/**
			 * Attempt to login
			 * Checks if there is user with this email and password
			 * Calls {@link service.LoginServiceImp#login(String email, String email) login(string,string)}
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				
				login();
			}
		});
		btnLogin.setBounds(35, 120, 117, 25);
		
		emailTF = new JTextField();
		emailTF.setBounds(130, 55, 114, 19);
		emailTF.setColumns(10);
		
		JLabel title = new JLabel("CarPooling");
		title.setBounds(340, 12, 161, 32);
		title.setFont(new Font("Dialog", Font.BOLD, 26));
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(35, 57, 169, 15);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(35, 84, 70, 15);
		setLayout(null);
		add(emailLabel);
		add(passwordLabel);
		add(emailTF);
		add(btnLogin);
		add(title);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 82, 114, 19);
		add(passwordField);
		
		
	
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUpUI signup = new SignUpUI();
				SignUpPresenter presenter = new SignUpPresenter(signup);
				presenter.start();
				
			}
		});
		btnSignUp.setBounds(169, 120, 117, 25);
		add(btnSignUp);
		
		loginErrorMsg = new JLabel("");
		loginErrorMsg.setForeground(Color.RED);
		loginErrorMsg.setFont(new Font("Tahoma", Font.PLAIN, 22));
		loginErrorMsg.setBounds(35, 166, 269, 32);
		add(loginErrorMsg);
		
		
		
	}

	
	@Override
	public void setLoginPresenter(LoginPresenter presenter) {
		 this.presenter = presenter;
		
	}
	@Override
	public String getEmail() {
		return emailTF.getText();
	}
	@Override
	public void setEmail(String email) {
		emailTF.setText(email);
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public String getPassword() {
		return passwordField.getText();
	}
	@Override
	public void setPassword(String password) {
		passwordField.setText(password);
	}


	@Override
	public void setLoginError(String error) {
		 loginErrorMsg.setText(error);
	}

	public void login(){
		succededlogin= presenter.login(getEmail(), getPassword());
		if(!succededlogin){
			setLoginError("Wrong email or password.");
		}else{
			//TODO anoigei to profil scene
			//System.out.println(LoginServiceImp.ACTIVE_USER);
			UserProfileUI signup = new UserProfileUI();
			UserProfilePresenter presenter = new UserProfilePresenter(signup);
			presenter.start();
		}
	}
	
}
