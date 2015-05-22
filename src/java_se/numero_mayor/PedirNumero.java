package java_se.numero_mayor;

import java.util.Scanner;

public class PedirNumero {
	
	static int cont = 1;

	public static int pedirNumero () {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca número " + cont + ":");
		num = sc.nextInt();
		cont ++;
		
		return num;
	}
}
