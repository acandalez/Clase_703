package persona_listapersona;

import static org.junit.Assert.assertNull;
import java_se.ejercicio_listapersona.ListaPersonas;
import java_se.ejercicio_listapersona.Persona;

import org.junit.Test;

public class Test_ListaPersonas {

	@Test
	public void testBuscarPersona() {
		// fail("Not yet implemented");
	}

	public void Listapersonas_array() {

		ListaPersonas lp = new ListaPersonas();
		Persona[] array = lp.getListaPersonas();

		for (Persona p : array) {
			assertNull(p);// comprobamos que en array cada posicion de null.
		}

	}

	// Ejemplos con Matchers

}
