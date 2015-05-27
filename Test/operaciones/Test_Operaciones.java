package operaciones;

import static org.junit.Assert.assertEquals;
import java_se.jUnit.Operaciones;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_Operaciones {
	static Operaciones tester;

	public Test_Operaciones() {

	}

	@BeforeClass
	public static void iniciaclase() {

		tester = new Operaciones();

	}

	@Test
	public void testSuma() {
		// fail("Not yet implemented");

		assertEquals("5 mas 3 = 8", 8, tester.suma(5, 3));
	}

	@Test
	public void testMultiplicacion() {
		// fail("Not yet implemented");

		assertEquals("5 por 3 = 15", 15, tester.multiplicacion(5, 3));
	}

	@Test
	public void testDivision() {
		// fail("Not yet implemented");

		assertEquals("6 dividido 2 = 3", 3, tester.division(6, 2));
	}

	@Test
	public void testResta() {
		// fail("Not yet implemented");

		assertEquals("5 menos 3 = 2", 2, tester.resta(5, 3));
	}

	// AfterClass es para indicar que hacer despues del test
	@AfterClass
	// Dice que al acabar el test nos ponga el objeto a null
	public static void finTest() {
		tester = null;
	}

}
