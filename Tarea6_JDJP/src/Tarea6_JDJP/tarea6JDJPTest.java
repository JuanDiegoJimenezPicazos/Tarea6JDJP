package Tarea6_JDJP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tarea6JDJPTest {

	@Test
	void testEj1() {
		assertEquals(4, tarea6JDJP.ej1(1, 0, 0));
		assertEquals(4, tarea6JDJP.ej1(2, 4, 0));
		assertEquals(4, tarea6JDJP.ej1(2, 6, 3));
		assertEquals(6, tarea6JDJP.ej1(2, 6, 1));
	}

	@Test
	void testEj2() {
		assertEquals(6, tarea6JDJP.ej2(2, 0, 0));
		assertEquals(6, tarea6JDJP.ej2(0, 6, 0));
		assertEquals(6, tarea6JDJP.ej2(0, 0, 1));
		assertEquals(4, tarea6JDJP.ej2(0, 4, 3));
	}

	@Test
	void testEj5() {
		assertEquals(1, tarea6JDJP.ej5(5, 4));
		assertEquals(1, tarea6JDJP.ej5(4, 5));
		assertEquals(3, tarea6JDJP.ej5(3, 3));
	}

	@Test
	void testEj6() {
		assertEquals(1, tarea6JDJP.ej6(1, 1, 5));
		assertEquals(0, tarea6JDJP.ej6(2, 3, 4));
		assertEquals(0, tarea6JDJP.ej6(2, 3, 12));
		assertEquals(-1, tarea6JDJP.ej6(0, 10, 5));
	}

	@Test
	void testEj8() {
		assertEquals(0, tarea6JDJP.ej8(0, -1));
		assertEquals(1, tarea6JDJP.ej8(2, 0));
		assertEquals(2, tarea6JDJP.ej8(3, 5));
	}

}
