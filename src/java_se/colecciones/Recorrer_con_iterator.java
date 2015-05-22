package java_se.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java_se.persona.Persona;

public class Recorrer_con_iterator /* implements Iterator<Array_list> */{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> al = new ArrayList<Persona>();
		// PRIMERO SE CREA LA LISTA Y LUEGO SE ITERA
		Persona p1 = new Persona("Juan", (byte) 22);
		Persona p2 = new Persona("Pedro", (byte) 25);

		al.add(p1);// Crea el objeto de la lista
		al.add(p2);

		Iterator<Persona> i_p = al.iterator();// ITERAMOS LA LISTA CON EL WHILE
		while (i_p.hasNext()) {
			Persona persona = (Persona) i_p.next();

			System.out.println(persona);
		}

		List<Persona> l = new ArrayList<Persona>();// list es padre de array
		// Linkedlist // list, si tuvieramos que
		// realizar modificaciones
		// envez de leer usaremos el
		// metodo LinkedList

		// ------------------------------------------------------------------------

		// DECLARAR UN MAPA

		Map<String, Persona> mi_mapa = new HashMap<String, Persona>();

		System.out.println();
	}

}
