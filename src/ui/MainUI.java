package ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
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
  	SearchUI srch ;
  	
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
		frmCarpooling.setBounds(100, 100, 550, 450);
		frmCarpooling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scenes.setLayout(cl);
	
		ImageIcon img = new ImageIcon("icon.png");
		frmCarpooling.setIconImage(img.getImage());
		
		LoginUI login = new LoginUI();
		lgpresenter = new LoginPresenter(login);
		lgpresenter.start();
		MainUI.frmCarpooling.getContentPane().add(MainUI.scenes);
	
		
	/*	LoginServiceImp.ACTIVE_USER = new User();
		
		 srch = new SearchUI();
		SearchPresenter pr = new SearchPresenter(srch);
		pr.start();*/
		
		
		//MainUI.frmCarpooling.getContentPane().add(MainUI.scenes);
	}

}
