package java_se.password;

public class Password {

	private String palabraclave = null;
	private int longitud;
	private final int min = 8; //Creo un atributo constante en toda mi clase con lo cual le pongo el final
	/**
	 * @ Mi pass es buena si tiene mín. 8 caracteres 
	 * @ Si contiene mayúsculas y minúsculas 
	 * @ Si contiene caracteres especiales 
	 * @ Si contiene algún número
	 * 
	 * @return
	 */
	public Password (String pw) {
		
		this.palabraclave = pw;
		this.longitud = this.palabraclave.length();//Optimiza el código, ya que llamammos a length una vez en vez
		//de i veces en el for y ahorramos proceso de ejecución
	}
	
	public boolean esPasswordBuena () {
		
		boolean esbuena = false;
//		this.length(); //Me da la longitud del Strng
//		this.charAt(int cont); //Me recorre el String carácter a carácter;
		
		if (min8Caracteres() && siMayuscula() && siMinuscula() && siNumero() && siEspeciales()) {
			
			esbuena = true;
		}
		else {
			System.out.println("La contraseña que va crear no es correcta. Recuerde los requisitos:" +
					"\n* Tiene que tener un mínimo 8 caracteres" +
					"\n* Tiene que contener al menos una mayúscula" +
					"\n* Tiene que contener al menos una minúcula" +
					"\n* Tiene que contener algún carácter especial" +
					"\n* Y al menos contener un número");
			esbuena = false;
		}
		return esbuena;
	}

	public boolean min8Caracteres() { //Determina si mi pass es menor de 8 caracteres

		boolean minimo8 = false;

		if (palabraclave.length() >= min) { //Longitud de pass es mayor o igual de constante global

			minimo8 = true;
		} else {
			minimo8 = false;
		}
		return minimo8;
	}
	
	public boolean siMayuscula() { //Comprueba si mi pass contiene alguna mayúscula
		
		boolean mayuscula = false;
			
		for (int i = 0; i < this.longitud; i++) {
			
			if (Character.isUpperCase(palabraclave.charAt(i))) {
			//Determina si mi caracter i es una mayúscula	
				mayuscula = true;
			}
		}
		return mayuscula;		
	}
	
	public boolean siMayuscula2() { //Método perfecto del profe
		
		boolean mayuscula = false;
		int cont = 0;
		char c = ' ';
		
		do {
			c = this.palabraclave.charAt(cont);
			mayuscula = Character.isUpperCase(c);
			cont++;
		} while((!mayuscula) && (cont < this.longitud));//Recorre la cadena mientras no encuentre una mayúscula y no llegue al final
		
		return mayuscula;
	}
	
	public boolean siMinuscula() { //Comprueba si mi pass contiene alguna minúscula
		
		boolean minuscula = false;
		
		for (int i = 0; i < this.longitud; i++) {
			
			if (Character.isLowerCase(palabraclave.charAt(i))) {
			//Character.isLowerCase: Determina si mi caracter i es una mínuscula	
				minuscula = true;
			}
		}
		return minuscula;
	}
	
	public boolean siNumero() {
		
		boolean numero = false;
				
		for (int i = 0; i < this.longitud; i++) {
			
			if (Character.isDigit(palabraclave.charAt(i))) {
			//Character.isDigit: Determina si mi caracter i que recibe es un número	
				numero = true;
			}
		}
		return numero;
	}
	
	public  boolean siEspeciales() {
		
		boolean especial= false;
		char [] c = {'!', '"', '·', '$', '%', '&', '/', '(', ')', '=', '?', '¿', '+', '*', 'Ç', 'ç', '[', ']', '{', '}',
		',', '.', '-', ';', ':', '_', 'ª','º', '|', '\\', '@', '#','~','€', '§'};
		int longarray = 0;
		int pcaracter = 0; //Contador donde se irá guardando la posición del caracter de mi palabraclave
		int carray = 0; //Contador donde se irá guardando la posición del caracter de mi array 'c'
		
		longarray = c.length; //El length para los arrays no llevan paréntesis xk no es una llamada sino es un campo
		do {
			do {
				if (this.palabraclave.charAt(pcaracter) == c[carray]) {
					especial = true;		
				}
				carray++;
			}while ((!especial) && (carray < longarray));
			pcaracter++;
			carray = 0;
		}while((!especial) && (pcaracter < this.longitud));//Recorre la cadena mientras no encuentre una mayúscula y no llegue al final
		
//		for (int i = 0; i < this.longitud; i++) {
//			
//			for (int j = 0; j < longarray; j++) {
//				do {
//					if (this.palabraclave.charAt(i) == c[j]) {
//						
//						especial = true;
//					}				
//				} while (!especial == true);
//			}	
//
//		}
		return especial;
	}
	
}
