package java_se.ejercicio_listapersona;

import java.util.HashMap;
import java.util.Map;

import NotaException.NotaException;

public class Pruebas {

	public static void main(String[] args) throws NotaException {
		// TODO Auto-generated method stub

		Persona persona;
		Persona j = new Persona("juan", 22);
		Persona p1 = new Persona("Juan", 22);
		Persona p2 = new Persona("Pedro", 25);

		// List<Persona> l = new ArrayList<Persona>();// list es padre de array
		// Linkedlist // list, si tuvieramos que
		// realizar modificaciones
		// envez de leer usaremos el
		// metodo LinkedList

		// --------------------------

		// DECLARAR UN MAPA

		Map<String, Persona> mi_mapa = new HashMap<String, Persona>();

		System.out.println(mi_mapa);

	}
}
