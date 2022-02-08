//Juan Diego Jimenez Picazos

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Iterator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calculate = new Calculadora();

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}

	@Test
	void testCalculadora() {
		System.out.println("Casos de prueba de todos los métodos");
		assertEquals(8, calculate.suma(3, 5));
		assertEquals(-2, calculate.resta(3, 5));
		assertEquals(15, calculate.multiplica(3, 5));
		assertEquals(3, calculate.divide(15, 5));
	}

	@Test
	void testSuma() {
		System.out.println("Casos de prueba del método suma");
		assertEquals(2, calculate.suma(1, 1));
		assertNotEquals(3, calculate.suma(1, 1));
	}

	@Test
	public void testDivision() {
		System.out.println("Casos de prueba del método división");
		try {
			assertEquals(0, calculate.divide(15, 0));
		} catch (Exception e) {
			System.out.println("División por 0 producida");
		}
	}
	
	@Test
	public void testResta() {
		System.out.println("Casos de prueba del método resta");
			int[] al = new int[10];
			for (int i = 0; i < al.length; i++)
				al[i] = (int) (Math.random() * 10 + 1);
			
		for (int j = 0; j < al.length; j++) {
			assertEquals(al[j]-al[j], calculate.resta(al[j], al[j]));
		}
			
	}
	
	@Test
	public void testMultiplica() {
		System.out.println("Casos de prueba del método multiplicación");
			int[] al = new int[10];
			for (int i = 0; i < al.length; i++)
				al[i] = (int) (Math.random() * 10 + 1);
			
		for (int j = 0; j < al.length; j++) {
			assertEquals(al[j] * al[j], calculate.multiplica(al[j], al[j]));
		}
			
	}

	
}
