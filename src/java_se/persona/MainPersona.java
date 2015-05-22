package java_se.persona;

//import java.util.Scanner;

public class MainPersona {
	
	public MainPersona () {
//		pedirNombre(); //Sirve a la hora de crear en el main un nuevo objeto,
//		pedirEdad();  //el constructor llame a los dos metodos creados
	}
/*	String pedirNombre () { //Función q devuelve el nombre
		String nombre = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca nombre: "); //El 'print' me deja escribir en la misma línea
		nombre = sc.nextLine();// Recoje la línea entera escrita que recibe de entrada
		
		return nombre;
	}
	byte pedirEdad () {  //Función q devuelve la edad
		byte edad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca edad: ");
		edad = sc.nextByte();		
		
		return edad;
	}
*/
	public static void main(String[] args) {
		String nombre = null;
		byte edad = 0;
	
//		MainPersona obj1 = null;
		Persona person1 = null;
//		Persona person2 = null;
		Persona person3 = null;
		Alumno a = null;
		
//		obj1 = new MainPersona();
//		nombre = obj1.pedirNombre();					
//		edad = obj1.pedirEdad();
		
//		System.out.println(obj1.pedirNombre());
//		System.out.println(obj1.pedirEdad());
		
		for (int cont = 0; cont < 1; cont++) { 
			
			System.out.println("DATOS DE PERSONA " + (cont+1));
			nombre = PedirDatos.pedirNombre(); //Guarda el nombre que devuelve el método pedirNombre de la clase PedirDatos
			edad = PedirDatos.pedirEdad();
//			nombre = obj1.pedirNombre();					
//			edad = obj1.pedirEdad();
			person1 = new Persona(nombre, edad);
//			person2 = new Persona(nombre, edad);
			person3 = new Persona(nombre, edad);
			System.out.println();
			
			
			person1.mostrarPersona();
			if (person1.esMayorEdad()) {
				System.out.println("¡Es mayor de edad!");
			}
			else {
				System.out.println("¡NO es mayor de edad!");
			}
			System.out.println();
		}	
		
//		System.out.println("DATOS DE PERSONA 2");
//		nombre = obj1.pedirNombre();					
//		edad = obj1.pedirEdad();
//		person2 = new Persona(nombre, edad);
//		person2.mostrarPersona();
		
//		person3 = person1; //Guardamos la dirección de memoria del objeto person1 en person3
		
		person3.nombre = "Enry";
//		person1.mostrarPersona();
		person3.mostrarPersona();
		
		person1.equals(person3); //Compara el contenido de person1 con person3. Esto es la llamada al equals
//		if (person3 == person1) { //Estamos comparando la referencia del objeto no el contenido del mismo	
		if (person1.equals(person3) == true) {
			System.out.println("Son personas iguales");
		}
		else {
			System.out.println("Son personas distintas");
		}
		
		System.out.println(person3);
		
		person3 = new Alumno("Juan", (byte)23, (byte)6); //ESto es polimorfismo
		
		a = new Alumno("Pepe", (byte)34, (byte)9);
		System.out.println(a);
		}
}
