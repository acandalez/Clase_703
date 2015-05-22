package java_se.ejercicios_repaso;

import java.util.Scanner;

//MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
public class ParOImpar3 {
	
	private int numero;
	
	public ParOImpar3 (int n) { //Método constructor donde incicializamos el parámetro por valor que recibimos
		
		this.numero = n;
	}

	public String esParOImpar () { //Método que nos indica si un número es par o impar y nos lo devuelve como texto
		
		String result = null;
		
		if ((this.numero%2) == 0) {
			
			result = "par";
		}
		else {
			result = "impar";
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		String resultado = null;
		ParOImpar3 pi1 = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número a valorar: ");
		num = sc.nextInt();
		
		pi1 = new ParOImpar3(num);
		
		resultado = pi1.esParOImpar();
		
		System.out.println("\nEl número introducido es " + resultado);
	}
}
