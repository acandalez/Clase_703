package java_se.colecciones;

import java.util.ArrayList;

import java_se.persona.Persona;

public class Array_list {

	public static void main(String[] args) {

		ArrayList<Persona> listapersona = new ArrayList<Persona>();
		Persona p1 = new Persona("Juan", (byte) 22);
		Persona p2 = new Persona("Pedro", (byte) 25);

		listapersona.add(p1);// Crea el objeto de la lista
		// listapersona.remove(p1);// Elimina objeto de persona p1
		listapersona.add(p2);

		for (Persona persona : listapersona) {// foreach (se lee de esta manera)
												// : para cada persona de esta
												// lista
			System.out.println(persona);
		}

	}

}
