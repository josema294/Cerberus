package model;

import java.util.Arrays;

public class Model{
	
	
	private String usuario = "jose";
	private char [] password = {'1','2','3'};	
	private String usuarioComprobar;	
	private char [] passwordComprobar;
	
	public void setUsuarioComprobar(String usuarioComprobar) {
		this.usuarioComprobar = usuarioComprobar;
	}
	public void setPasswordComprobar(char[] passwordComprobar) {
		this.passwordComprobar = passwordComprobar;
	}
	
	
	public boolean getIdentity () {
		
		if (checkUsuario() && checkPass()) return true;
		
		else return false;
	}
	
	
	private boolean checkUsuario() {
		
		if (usuario.equals(usuarioComprobar)) {
					
			return true;
			
		}
		return false;
		
	}
	
	private boolean checkPass () {
		
		if(Arrays.equals(password,passwordComprobar)) {return true;}
		else return false;	
			}
			
			
			
		}
		
	






