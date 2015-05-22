package java_se.numero_mayor;

import java.util.Scanner;

public class MainNumeroCorrecto {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca Número 1:");
		n1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduzca Número 2:");
		n2 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduzca Número 3:");
		n3 = sc2.nextInt();
		
		if (n1 > n2) {
			
			if (n1 > n3) {
				
				System.out.println("El mayor es: " + n1);
			}
			else {
				
				System.out.println("El mayor es: " + n3);
			}
		}
		else {
			
			if (n2 > n3){
				
				System.out.println("El mayor es: " + n2);
			}
			else {
				
				System.out.println("El mayor es: " + n3);
			}
		}	
	}
}
