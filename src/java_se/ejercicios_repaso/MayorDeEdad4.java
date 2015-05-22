package java_se.ejercicios_repaso;

import java.util.Scanner;

//MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
public class MayorDeEdad4 {
	
	private int edad;
	private final static int mayoria = 18; //Atributo constante que no cambia en todo el programa
	
	public MayorDeEdad4 (int e) { //Método constructor donde incicializamos el parámetro por valor que recibimos
		
		this.edad = e;
	}
	
	public boolean esMayor () { //Método que evalua si es mayor de 18 y me devuelve un true o false
		
		boolean mayor = false;
		
		if (this.edad >= MayorDeEdad4.mayoria) {
			
			mayor = true;
		}
		return mayor;
	}
	
	public static void main(String[] args) {
		
		int edad = 0;
		MayorDeEdad4 obj1 = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();
		
		obj1 = new MayorDeEdad4(edad);
		
		if (obj1.esMayor() == true) {
			
			System.out.println("\n¡Usted es mayor de edad!");
		}
		else {
			System.out.println("\n¡No es mayor de edad!");
		}
	}
}
