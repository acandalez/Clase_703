package operaciones;

import static org.junit.Assert.assertEquals;
import java_se.jUnit.Operaciones;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test_Operaciones {

	public Test_Operaciones() {

	}

	@BeforeClass
	public static void iniciaclase() {

		Operaciones tester = new Operaciones();

	}

	@Test
	public void testSuma() {
		// fail("Not yet implemented");
		Operaciones tester = null;
		assertEquals("5 mas 3 = 8", 8, tester.suma(5, 3));
	}

	@Test
	public void testMultiplicacion() {
		// fail("Not yet implemented");
		Operaciones tester = null;
		assertEquals("5 por 3 = 8", 8, tester.multiplicacion(5, 3));
	}

	@Test
	public void testDivision() {
		// fail("Not yet implemented");
		Operaciones tester = null;
		assertEquals("5 dividido 3 = 8", 8, tester.division(5, 3));
	}

	@Test
	public void testResta() {
		// fail("Not yet implemented");
		Operaciones tester = null;
		assertEquals("5 mas 3 = 8", 8, tester.resta(5, 3));
	}

}
