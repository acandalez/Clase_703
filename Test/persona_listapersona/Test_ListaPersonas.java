package persona_listapersona;

import static org.junit.Assert.*;
import java_se.ejercicio_listapersona.InsertarPersonaException;
import java_se.ejercicio_listapersona.ListaPersonas;
import java_se.ejercicio_listapersona.Persona;

import org.junit.Test;

public class Test_ListaPersonas {
	
	public static ListaPersonas lp;
	public static Persona p1 = new Persona("Pedro",30);
	public static Persona p2 = new Persona("Luis",28);
	public static Persona p3 = new Persona("Juan",40);

	@Test
	public void testBuscarPersona() {
		// fail("Not yet implemented");
		assertNotNull(lp);
	}

	public void Listapersonas() {

		ListaPersonas lp = new ListaPersonas();
		lp = new ListaPersonas();
		try {
			lp.insertarPersona(p1);
			lp.insertarPersona(p2);
			lp.insertarPersona(p3);
		} catch (InsertarPersonaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void testBuscarPersonaNombre() {//buscar por nombre
		assertEquals("Test buscar p1",p1,lp.buscarPersona("Pedro"));
	}

	@Test
	public void testBuscarPersonaEdad() {
		assertEquals("Test buscar p1",p1,lp.busarPersona(30));
	}
	// Ejemplos con Matchers

}
