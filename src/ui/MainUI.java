package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;

public class MainUI {

 static JFrame frmCarpooling;
 	
  	static JPanel scenes = new JPanel(new CardLayout(0, 0));
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					MainUI.frmCarpooling.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarpooling = new JFrame();
		
		frmCarpooling.setTitle("CarPooling ");
		frmCarpooling.setBounds(100, 100, 567, 431);
		frmCarpooling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarpooling.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel login = new LoginUI();
		scenes.add(login);
		frmCarpooling.getContentPane().add(scenes);
	}

}
