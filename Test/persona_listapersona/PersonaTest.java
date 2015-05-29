package persona_listapersona;

import static org.junit.Assert.assertEquals;
import java_se.ejercicio_listapersona.Persona;

import org.junit.Test;

public class PersonaTest {

	static Persona testpersona;

	public static void Persona() {

		testpersona = new Persona("", 0);

	}

	@Test
	public void testEquals() {
		// fail("Not yet implemented");
		Persona p = new Persona("Juan", 21);
		Persona p1 = new Persona("Juan", 21);
		assertEquals(p.equals(p), p1.equals(p1));
	}

	@Test
	public void PersonaNull() {
		Persona p = new Persona("Juan", 0);

	}
}
