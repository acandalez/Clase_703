package java_se.ejercicios_repaso;

//PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
public class SecuenciaTres7 {
	
	public static void main(String[] args) {
		
		int sec3 = 0;
		final int aux = 3;
		
		System.out.println("La secuencia numérica sería: ");
		
		do {
			sec3 = sec3 + aux;
			
			if (sec3 == 99) {
				System.out.println(sec3);
			}
			else {
				System.out.print(sec3 + ", ");
			}
		}while(sec3 < 99);
		
	}

}
