package condicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido
 * 
 * @author Marcelo kleibson
 *
 * @version 1.0
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int num1 = 0;
		Scanner sc = new Scanner(System.in);

		// Procedemos a capturar los valores.
		System.out.print("Ingrese un nº entre 0 y 50: ");
		num1 = Integer.parseInt(sc.nextLine());

		// comprobar que el nº esté dentro del rango
		while (num1 > 50 || num1 < 0) {
			System.out.print("Ha introducido un nº erróneo, Ingrese un nº entre 0 y 50: ");
			num1 = Integer.parseInt(sc.nextLine());
		}
		System.out.println("el nº introducido es valido! el nº es: " + num1);

		sc.close();
	}

}
