package java_se.ejercicio_listapersona;

import java.io.Serializable;

public class Persona implements Serializable {

	private int edad;
	private String nombre;

	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre + " " + this.edad;
	}

	public int compareTo(Persona p2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
