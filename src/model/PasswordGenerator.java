package model;

import java.util.Arrays;
import java.util.Random;


public class PasswordGenerator {
	
	private boolean symbols;
	private boolean mayus;
	private boolean minus;
	private boolean numbers;
	private byte longitud;
	
	private char[] minusculas = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private char[] numeros = "0123456789".toCharArray();
	private char[] especiales = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".toCharArray();


	


	
	
	private char [] passwordGen () {
		
		
		char [] finalArray;
		Random rnd = new Random();
		rnd.nextInt(longitud+1);
		
		//Creamos un nuevo array combinacion de todos los tipos de caracteres a usar.
		if (symbols && mayus && minus && numbers) {
			
			finalArray = new char [(minusculas.length + mayusculas.length + numeros.length + especiales.length)];
			char newArray [] = new char [(minusculas.length + mayusculas.length + numeros.length + especiales.length)];
			
			newArray = Arrays.copyOfRange(newArray, 0, minusculas.length);
			newArray = Arrays.copyOfRange(newArray, minusculas.length,mayusculas.length);
			newArray = Arrays.copyOfRange(newArray, mayusculas.length,numeros.length);
			newArray = Arrays.copyOfRange(newArray, numeros.length ,especiales.length);
			
			//Asignamos a ese array al menos 1 caracter aleatorio de cada tipo indicado.
			
			
					
			finalArray [rnd.nextInt(newArray.length)] = minusculas [rnd.nextInt(minusculas.length)];
			
		
			
				
			
			
		}
		
		
		return especiales;
		
		
		
	}
	
	
	private char[] arrayConcat () {
		
		
		
		
	}
	

	
	


}
