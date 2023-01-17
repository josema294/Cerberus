package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.eclipse.jface.window.Window;

import model.Model;
import view.Login;

public class Controller implements ActionListener {
	

	private Model model;
	private Login vista;
	
	public Controller(Model model, Login login) {
		super();
		this.model = model;
		this.vista = login;
		
		vista.getBtn_login().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (vista.getBtn_login().getText() =="" ) {
			
			JOptionPane.showInputDialog("Rellenar usuario");
		}
		
	}
	
	


}
