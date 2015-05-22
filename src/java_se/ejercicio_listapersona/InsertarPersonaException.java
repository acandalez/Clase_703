package java_se.ejercicio_listapersona;

public class InsertarPersonaException extends Exception {

	public static final String mensaje = "Numero de personas excecido. Máximo "
			+ ListaPersonas.CAPACIDAD + " personas";

}