package java_se.ejercicio_listapersona;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author alexander
 *
 */

public class ListaPersonas {

	public static final int CAPACIDAD = 10;

	private Persona[] array_personas;
	private int n_Personas;// numero personas

	/**
	 * Es muy posible que haga falta añadir algún campo más
	 */

	public ListaPersonas() {
		// TODO HAY QUE HACER UN CONSTRUCTOR
		// RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
		// RESERVAR MEMORIA
		// INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS

		this.array_personas = new Persona[CAPACIDAD];
		this.n_Personas = 0;

	}

	public Persona[] getListaPersonas() {
		// TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA

		return array_personas;
	}

	public Persona buscarPersona(String nombre) {
		// TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		// SI NO ESTÁ, DEVOLVER NULO
		Persona buscarPersona = null;

		for (Persona i : array_personas) {// Recorriendo la array, genera i que
											// es la variable de persona
			if (nombre.equalsIgnoreCase(i.getNombre())) {// mira si nombre es
															// igual a
															// i.getNombre y
															// este equals
															// ignora las
															// mayusculas y
															// minusculas.
				buscarPersona = i;
			}
		}

		return buscarPersona;
	}

	public Persona busarPersona(int edad) {
		// TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		// SI NO ESTÁ, DEVOLVER NULO
		// [=int npersonas]

		Persona buscarPersona = null;
		for (Persona i : array_personas) {// Recorriendo la array, genera i que
											// es la variable de persona
			if (edad == i.getEdad()) {// mira si edad es igual a i.getedad y
										// este equals ignora las mayusculas y
										// minusculas.
				buscarPersona = i;
			}
		}

		return buscarPersona;
	}

	public boolean serializar(String nombre, byte edad) throws Throwable {
		// Hacer uso del fichero de propiedades serializa.properties,
		// para obtener de él el valor de la clave destino,
		// que representa el nombre del fichero de salida

		boolean serializar = false;
//		Persona [] a
//
//		for (Persona i : array_personas){
//			
//			= "" + i;
//			
//		}
		
		
		for (int i = 0; i < array_personas.length; i++) {// agrupamos en una array

			
			 nombre = "" + i;// asigna que es automaticamente un string//modo
			// rudo
			

			// edad
			System.out.println("Introduzca edad:");
			edad = (byte) i;// lo mismo pero con byte//modo rudo
			// es sin el modo scanner para agrupar rapidamente y ver el
			// resultado.
			

			array_personas[i] = new Persona(nombre, edad);

		}
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(
					"serializar_array.dat"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			out.writeObject(array_personas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
		
		
		return serializar;

		// Persona[] array_personas = null;
		// array_personas = Persona[CAPACIDAD];
		//
		// for (int i = 0; i < array_personas; i++) {// agrupamos en una array
		//
		// array_personas[i] = new Persona(persona);
		//
		// }
		// ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
		// "serializa.properties"));
		//
		// out.writeObject(array_personas);
		// out.close();

	}

	public boolean deserializar() throws Throwable, Throwable {
		boolean desserializar = false;
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"serializar_array.dat"));
		array_personas = (Persona[]) in.readObject();
		in.close();

		// mostar la array para comprobar
		for (int i = 0; i < n_Personas; i++) {
			System.out.println(array_personas[i]);
		}


		return false;
	}

	public void insertarPersona(Persona p) throws InsertarPersonaException {

		if (!estaLlena()) {
			/**
			 * código del insertar
			 */
		} else {
			throw new InsertarPersonaException();
		}
		n_Personas++;
	}

	public int numeroPersonas() {

		return this.n_Personas;
	}

	public boolean estaLlena() {
		// excepciones

		boolean estaLlena = false;

		estaLlena = (this.n_Personas == CAPACIDAD);// si n_personas es igual a
													// capacidad el array esta
													// llena

		return estaLlena;

		/*
		 * int length = 0; String nombre = null; int edad = 0; Persona
		 * personas[] = new Persona[CAPACIDAD];
		 * 
		 * try { for (int i = 0; i < numeroPersonas(); i++) {// recorremos la //
		 * longitud
		 * 
		 * System.out.println("Pesona" + (i + 1)); // name =
		 * PedirDatos.pedirNombre(); // age = PedirDatos.pedirEdad();
		 * 
		 * personas[i] = new Persona(nombre, edad);
		 * 
		 * } } catch (ArrayIndexOutOfBoundsException e) {// creamos la excepcion
		 * para // cuando introduscamos // una array fuera del // espacio salte
		 * y diga un // mensaje throw new MessageError();// llama la clase que
		 * hemos creado la // excepcion.
		 * 
		 * }
		 * 
		 * return estaLlena;
		 */
	}

	public void mostrar() {
		// TODO MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del método toString de persona
		//array_personas.toString();//muestra el array de persona
		for (Persona i : array_personas) {
            
            System.out.println("su nombre es:" +i.getNombre()+" y su edad es :"+i.getEdad());
        }
		
	}

	

}
