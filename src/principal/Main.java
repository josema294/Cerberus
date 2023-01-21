package principal;

import java.awt.EventQueue;

import controller.Controller;
import model.Model;
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
					Model model = new Model();
					Controller controller = new Controller (model, window);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
