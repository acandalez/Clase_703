package java_se.serializacion;

import java.util.Scanner;

public class PedirDatos {
	
	public static String pedirNombre () { //Función q devuelve el nombre
		String nombre = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca nombre: "); //El 'print' me deja escribir en la misma línea
		nombre = sc.nextLine();// Recoje la línea entera escrita que recibe de entrada
		
		return nombre;
	}
	public static byte pedirEdad () {  //Función q devuelve la edad
		byte edad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca edad: ");
		edad = sc.nextByte();		
		
		return edad;
	}
}
