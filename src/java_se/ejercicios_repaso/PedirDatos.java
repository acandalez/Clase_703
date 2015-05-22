package java_se.ejercicios_repaso;

import java.util.Scanner;

//
public class PedirDatos {

	public String pedirCadena () { //Método que me pide introducir una cadena de texto
		
		String cadena = null;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca la cadena de texto: ");
		cadena = sc.nextLine();
		
		return cadena;
	}
	
	public char pedirCaracter () { //Método que me pide introducir un caracter
		
		char caracter = ' ';
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el caracter a buscar: ");
		caracter = sc.next().charAt(0);
		
		return caracter;
		}
}
