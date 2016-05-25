package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import memorydao.MemoryInitializer;
import ui.presenters.LoginPresenter;

import java.awt.CardLayout;

public class MainUI {

	static JFrame frmCarpooling;
 	static JPanel scenes = new JPanel();
  	static CardLayout cl = new CardLayout();
  	LoginPresenter lgpresenter;
  	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
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
		MemoryInitializer init = new MemoryInitializer();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarpooling = new JFrame();
		frmCarpooling.setTitle("CarPooling ");
		frmCarpooling.setBounds(100, 100, 567, 431);
		frmCarpooling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scenes.setLayout(cl);
		/*		
		JPanel login = new LoginUI();
		
		
		scenes.add(login,"login");
		
		cl.show(scenes, "login");
		
		frmCarpooling.getContentPane().add(scenes);
		*/
		
		LoginUI login = new LoginUI();
		lgpresenter = new LoginPresenter(login);
		lgpresenter.start();
		MainUI.frmCarpooling.getContentPane().add(MainUI.scenes);
	}

}
