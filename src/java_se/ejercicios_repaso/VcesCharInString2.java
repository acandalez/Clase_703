package java_se.ejercicios_repaso;

//MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
public class VcesCharInString2 {
	
	private String cadena;
	private char caracter;
	
	public VcesCharInString2 (String cad, char car) {//Método constructor donde incicializamos los parámetros por valor que recibimos
		
		this.cadena = cad;
		this.caracter = car;
	}
	
	public int nVecesCharInString () { //Método que nos devuelve el número de veces que aparece un caracter en una cadena
		
		int cont = 0;
		int nveceschar = 0;
		
		while (cont < this.cadena.length()) {
			
			if (this.cadena.charAt(cont) == this.caracter) {
				
				nveceschar++;
			}
			cont++;
		}
		return nveceschar;
	}
	
	public static void main(String[] args) {
		
		String s = null;
		char c = ' ';
		int nveces = 0;
		
		PedirDatos pcadena = null;
		PedirDatos pcaracter = null;
		VcesCharInString2 obj = null;
		
		pcadena = new PedirDatos();
		pcaracter = new PedirDatos();
				
		s = pcadena.pedirCadena();
		c = pcaracter.pedirCaracter();
		
		obj = new VcesCharInString2(s,c);
		
		nveces = obj.nVecesCharInString();
		
		if (nveces > 0) {
		
			if (nveces == 1) {
				
				System.out.println("\nEl caracter " + "'" + c + "'" + " aparece " + nveces + " vez");
			}
			else {
				System.out.println("\nEl caracter " + "'" + c + "'" + " aparece " + nveces + " veces");
			}
		}
		else {
			System.out.println("\nEl caracter introducido no aparece en la cadena");
		}
	}
}
