package excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos
 * usando la clase Scanner mediante la funci�n nextLine(). <br>
 * Transformar ambos strings a n�meros enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido).<br>
 * Agrupar el c�digo entre un bloque try catch y procesar para que no se
 * produzca una interrupci�n y finalizaci�n del programa si alguno de los
 * n�meros le�dos no puede convertirse, retomando el control en el punto del
 * fallo, hasta que se solucione
 *
 * @author ur00
 * @version 1.0
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		boolean isError = true;

		// 1� numero, Bucle para repetir hasta que no haya error
		do {

			System.out.println("Dime el 1� numero entero:");
			try {
				a = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("**error, necesito un numero valido");
			}

		} while (isError);

		// 2� numero, Bucle para repetir hasta que no haya error
		isError = true;
		do {

			System.out.println("Dime el 2� numero entero:");
			try {
				b = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("**error, necesito un numero valido");
			}

		} while (isError);

		System.out.println("Resultado a/b=" + (a / b));

		sc.close();
	}

}