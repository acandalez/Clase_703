package java_se.colecciones.practicas;

import java.util.LinkedHashMap;
import java.util.Map;

import java_se.persona.Alumno;
import java_se.persona.Persona;

public class Practica3A_Colecciones {
	/**
	 * CREAMOS PRIMERO LAS CLAVES - LUEGO LOS OBJETOS DE PERSONA Y POR ULTIMO
	 * LOS INICIAMOS EN EL MAP
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno;
		String clave = "Persona 1 ";
		String clave2 = "Persona 2";
		String clave3 = "Persona 3";

		Persona p1 = new Persona("Juan", (byte) 22);
		Persona p2 = new Persona("Pedro", (byte) 25);
		Persona p3 = new Persona("Petra", (byte) 24);

		Map<String, Persona> al = new LinkedHashMap<String, Persona>();

		// instanciamos los objetos
		al.put(clave, p1);
		al.put(clave2, p2);
		al.put(clave3, p3);

		System.out.println(al);

	}
}
