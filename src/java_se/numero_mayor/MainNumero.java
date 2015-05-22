package java_se.numero_mayor;

public class MainNumero {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Numero onum1 = null;
		Numero onum2 = null;
		Numero onum3 = null;
		
//		for (int cont = 0; cont < 3; cont++) {
//		
//		num1 = PedirNumero.pedirNumero();
//		onum1 = new Numero(num);
//	}
	
		num1 = PedirNumero.pedirNumero();
		onum1 = new Numero(num1);
		
		num2 = PedirNumero.pedirNumero();
		onum2 = new Numero(num2);
		
		num3 = PedirNumero.pedirNumero();
		onum3 = new Numero(num3);
		
		System.out.println("");
		
		if (onum1.equals(onum2) && onum1.equals(onum3)) {//num1 es mayor que num2
			
			System.out.print("El número mayor es: ");
			onum1.mostrarNumero();
		}
		else {
			if (onum2.equals(onum3)) {
				
				System.out.print("El número mayor es: ");
				onum2.mostrarNumero();
			}
			else {
				System.out.print("El número mayor es: ");
				onum3.mostrarNumero();
			}
		}
		 
	}
}
