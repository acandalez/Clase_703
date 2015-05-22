package java_se.colecciones.practicas;

import java.util.Map;
import java.util.TreeMap;

import NotaException.NotaException;
import java_se.persona.Alumno;
import java_se.persona.Persona;

public class Practica3B_Colecciones {

	public static void main(String[] args) throws NotaException {
		// TODO Auto-generated method stub

		Alumno alumno;

		Persona p1 = new Alumno("Juan", 24, 10);
		Persona p2 = new Alumno("Pedro", 25, 7);
		Persona p3 = new Alumno("Petra", 24, 5);

		// Integer es la clase de int, como lo que queremos ordenar son notas de
		// tipo int debemos de usar su clase que es INTEGER
		Map<Integer, Alumno> al = new TreeMap<Integer, Alumno>();// llama al
																	// to.string
																	// de
																	// alumno

		al.put(((Alumno) p1).getNota(), (Alumno) p1);
		al.put(((Alumno) p2).getNota(), (Alumno) p2);
		al.put(((Alumno) p3).getNota(), (Alumno) p3);

		System.out.println(al);
	}
}
