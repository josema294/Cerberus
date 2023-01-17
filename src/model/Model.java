package model;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Login;

public class Model{
	
	private String usuario = "jose_ma294@hotmail.com";
	private String password = "123";
	
	
	public String getPassword() {
		return password;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


}
