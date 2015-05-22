package java_se.ficheropropiedades;

import java_se.serializacion.Persona;

public class Excepciones {

	/*
	 * 1. creo la array de string y le asigno un espacio 2. creo un try catch y
	 * le asigno una excepcion 3.
	 */

	public static void main(String[] args) throws MessageError {
		// TODO Auto-generated method stub

		Persona personas[] = new Persona[4];// creamos el array de personas y
											// asignamos un espacio
		String name = null;
		byte age = 0;
		Excepciones ip = null;
		int length = 0;
		length = personas.length + 1;// asignamos la funcion para no recargar la
										// maquina

		try {
			for (int i = 0; i < length; i++) {// recorremos la longitud

				System.out.println("Pesona" + (i + 1));
				// name = PedirDatos.pedirNombre();
				// age = PedirDatos.pedirEdad();

				personas[i] = new Persona(name, age);

			}
		} catch (ArrayIndexOutOfBoundsException e) {// creamos la excepcion para
													// cuando introduscamos
													// una array fuera del
													// espacio salte y diga un
													// mensaje
			throw new MessageError();// llama la clase que hemos creado la
										// excepcion.

		}

	}
}
