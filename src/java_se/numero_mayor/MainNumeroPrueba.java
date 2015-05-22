package java_se.numero_mayor;

import java.util.Scanner;

public class MainNumeroPrueba {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int mayor = 0;
		
		for (int cont = 1; cont < 4; cont++) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca Número " + cont + ":");
			n1 = sc.nextInt();
			
			if (n1 > mayor ) {
				
				mayor = n1;
			}
			else {
				mayor = n1;
			}
		}
		System.out.println("El número mayor es: " + mayor);
	}

}
