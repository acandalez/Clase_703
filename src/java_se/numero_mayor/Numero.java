package java_se.numero_mayor;

public class Numero {
	
	int num = 0;

	/**
	 * Constructor de la clase que recibe tres parámetros
	 * @param n1: Parámetro de entrada de tipo int
	 * @param n2: Parámetro de entrada de tipo int
	 * @param n3
	 */
	public Numero(int n1) {
		
		this.num = n1;

	}
	
	public void mostrarNumero() {
		
		System.out.println(this.num);
		
	}
	
	public boolean equals(Object ob) { //El objeto ob recibe como entrada al objeto de la clase MainNumero
		
		boolean esmayor = false;
		Numero number = null; //Este es el objeto que hará la llamada al equals
		
		if (ob instanceof Numero) { //Sirve para comprobar si el objeto es una instancia de la clase Numero
			
			number = (Numero)ob; //Es el Casting es la conversión de un tipo de dato a otro equivalente y para objetos que guardan una relación de jerarquía
		}
		
		if (number.num <= this.num) {
			esmayor = true;
		}
		else {
			esmayor = false;
		}
		return esmayor;
	}
}
