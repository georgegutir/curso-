package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		int resultado = Calculadora.suma(3, 2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	void testResta() {
		int resultado = Calculadora.resta(3, 2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

}
