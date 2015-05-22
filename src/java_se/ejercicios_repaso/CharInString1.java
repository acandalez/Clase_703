package java_se.ejercicios_repaso;

//MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO
public class CharInString1 {

	private String cadena;
	private char caracter;
	
	public CharInString1 (String cad, char car) {//Método constructor donde incicializamos los parámetros por valor que recibimos
		
		this.cadena = cad;
		this.caracter = car;
	}
	
	public boolean charEnCadena () {//Método que un caracter en una cadena, nos devuelve true o false
		
		boolean existechar = false;
		int cont = 0;	
		
		do { 
			if (this.cadena.charAt(cont) == this.caracter) {
				
				existechar = true;
			}
			cont++;
		}while (!existechar && cont < this.cadena.length());
		
		return existechar;
	}
	
	public static void main(String[] args) {
		
		String s = null;
		char c = ' ';
		
		PedirDatos pstring = null; //Creamos un objeto de la clase PedirDatos
		CharInString1 charstring = null;
		
		pstring = new PedirDatos(); //Instanciamos el objeto
				
		s = pstring.pedirCadena();
		c = pstring.pedirCaracter();
		
		charstring = new CharInString1(s,c); //Instanciamos el objeto pasando dos parámetros por referencia
		
		if (charstring.charEnCadena() == true) {
			
			System.out.println("\nEl caracter " + "'" + c + "'" + " pertenece a la cadena");
		}
		else {
			System.out.println("\nNo pertence a la cadena");
		}
				
//		// Texto
//	    String sTexto = "palabrap o palabra y palabra";
//	    // Texto que vamos a buscar
//	    String sTextoBuscado = "p";
//	    // Contador de ocurrencias 
//	   	int contador = 0;
//	    int cont = 1;
//
//	    while (sTexto.indexOf(sTextoBuscado) > -1) {
//	      sTexto = sTexto.substring(sTexto.indexOf(
//	        sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
//	      cont = sTexto.indexOf(sTextoBuscado);
//	      contador++; 
//	    }
//	    
//	    System.out.println(contador);		
	}
}
