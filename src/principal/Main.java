package principal;

import java.awt.EventQueue;

import view.Login;

public class Main {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
