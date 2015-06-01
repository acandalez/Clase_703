package examples.basic;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java_se.ejercicio_listapersona.Persona;

import org.junit.Before;
import org.junit.Test;

public class TestPersona {

	Persona persona = null;

	@Before
	// inicializa el primer metodo que se inicia
	public void initPersona() {
		this.persona = new Persona("Juan", 32);
	}

	@Test
	public void testPersona() {// comprueba que persona no es nulo

		assertNotNull(persona);
		assertThat(persona, not(nullValue()));

	}

	@Test
	public void testGetEdad() {
		assertEquals(32, persona.getEdad());
		assertThat(persona.getEdad(), is(32));
	}

	@Test
	public void testSetEdad() {
		persona.setEdad(15);
		assertEquals(15, persona.getEdad());
		assertThat(persona.getEdad(), is(15));
	}

	@Test
	public void testGetNombre() {
		assertEquals("Juan", persona.getNombre());
		assertThat(persona.getNombre(), equalTo("Juan"));
	}

	@Test
	public void testSetNombre() {
		persona.setNombre("Lorenzo");
		assertEquals("Lorenzo", persona.getNombre());
		assertThat(persona.getNombre(), equalTo("Lorenzo"));
	}

	@Test
	public void testToString() {
		assertThat(persona.toString(), containsString("Juan"));
	}

	@Test
	public void testCompareTo() {
		Persona p2 = persona;
		assertTrue(persona.compareTo(p2) == 0);
		assertThat(persona.compareTo(p2), is(0));
	}

	@Test
	public void testEqualsObject() {
		Persona p2 = persona;
		assertTrue(persona.equals(p2));
		assertThat(persona, equalTo(p2));
	}

}
