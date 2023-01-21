package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.print.DocFlavor.INPUT_STREAM;
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
		
		System.out.println("Confirmada la pulsa");
		
		if (vista.getText_email().getText().equals("") || vista.getPwdPass().getPassword().length==0) {			
			
			JOptionPane.showMessageDialog(null, "No puede dejar en blanco correo o password","Login incorrecto", 0);
			
		}
		
		else {
			
			model.setPasswordComprobar(vista.getPwdPass().getPassword());
			model.setUsuarioComprobar(vista.getText_email().getText());
			
			if (model.getIdentity()) { System.out.println("Identidad asegurada");}
			
		}
		
		}
		
	
		
		
	}
	
		



