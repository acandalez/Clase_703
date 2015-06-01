package persona_listapersona;

import static org.junit.Assert.assertEquals;
import java_se.ejercicio_listapersona.ListaPersonas;
import java_se.ejercicio_listapersona.Persona;

import org.junit.Test;

public class Test_ListaPersonas {

	Persona persona;
	public static ListaPersonas lp;
	public static Persona p1 = new Persona("Pedro", 30);
	public static Persona p2 = new Persona("Luis", 28);
	public static Persona p3 = new Persona("Juan", 40);

	// @Test
	// public void testBuscarPersona() {
	// // fail("Not yet implemented");
	// assertNotNull(lp);
	// }

	// @Before
	// public void Listapersonas() {
	//
	// ListaPersonas lp = new ListaPersonas();
	// lp = new ListaPersonas();
	// try {
	// lp.insertarPersona(p1);
	// lp.insertarPersona(p2);
	// lp.insertarPersona(p3);
	// } catch (InsertarPersonaException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }
	//
	// @Test
	// public void testGetNombre() {
	// // assertEquals("Juan", persona.getNombre());
	// assertThat(persona.getNombre(), IsEqual.equalTo("Juan"));
	// }
	//
	// @Test
	// public void testListaPersonas() {
	// assertNotNull(lp);
	// }

	@Test
	public void testGetCapacidad() {
		assertEquals("Test capacidad", 10, lp.CAPACIDAD);
	}

	// Ejemplos con Matchers

}
