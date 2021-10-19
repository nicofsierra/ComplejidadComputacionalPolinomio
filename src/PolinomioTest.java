import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolinomioTest {

	@Test
	public void multSucesivas() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarMSucesivas(1), 6, 0.0);
		assertEquals(cubica.evaluarMSucesivas(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarMSucesivas(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "evaluarMSucesivas ");
	}

	@Test
	public void recursiva() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarRecursiva(1), 6, 0.0);
		assertEquals(cubica.evaluarRecursiva(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarRecursiva(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "recursiva ");
	}

	@Test
	public void recursivaPar() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarRecursivaPar(1), 6, 0.0);
		assertEquals(cubica.evaluarRecursivaPar(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarRecursivaPar(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "recursivaPar ");
	}

	@Test
	public void evaluarProgDinamica() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarProgDinamica(1), 6, 0.0);
		assertEquals(cubica.evaluarProgDinamica(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarProgDinamica(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "evaluarProgDinamica ");

	}

	@Test
	public void evaluarMejorada() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarMejorada(1), 6, 0.0);
		assertEquals(cubica.evaluarMejorada(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarMejorada(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "evaluarMejorada ");
	}

	@Test
	public void evaluarPow() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarPow(1), 6, 0.0);
		assertEquals(cubica.evaluarPow(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarPow(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "evaluarPow ");
	}

	@Test
	public void evaluarHorner() {
		Polinomio cuadratica = new Polinomio(new double[] { 1, 2, 3 });// x**2 + 2*x + 3
		Polinomio cubica = new Polinomio(new double[] { 1, 2, 3, 4 }); // x**3 + 2*x**2 + 3*x + 4
		Polinomio largo = new Polinomio(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 });

		assertEquals(cuadratica.evaluarHorner(1), 6, 0.0);
		assertEquals(cubica.evaluarHorner(2), 26, 0.0);// 2**3 + 2* (2**2) + 3*2 + 4 = 26

		// timeado con un polinomio largo
		long startTime = System.nanoTime();
		assertEquals(largo.evaluarHorner(2), 8115, 0.0);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " ns, " + "evaluarHorner ");
	}

}