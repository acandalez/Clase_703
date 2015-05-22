package java_se.ejemplos_basicos;

public class Prueba {
	
	public int calcula() {
		
		return 1+1;
	}
	public static void main(String[] args) {
		
		int resultado = 0; // Declaro una variable auxiliar de tipo entero
		Prueba prueba = null; //Declaro e inicialización un objeto de la clase Prueba
		prueba = new Prueba(); //Instancio o creo un objeto de la clase Prueba
		resultado = prueba.calcula(); //Guardo el resultado en la variable auxliar
		System.out.println(resultado); //Mostrar el resultado
	}
}
