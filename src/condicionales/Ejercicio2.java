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
		System.out.print("Ingrese un n� entre 0 y 50: ");
		num1 = Integer.parseInt(sc.nextLine());

		// comprobar que el n� est� dentro del rango
		while (num1 > 50 || num1 < 0) {
			System.out.print("Ha introducido un n� err�neo, Ingrese un n� entre 0 y 50: ");
			num1 = Integer.parseInt(sc.nextLine());
		}
		System.out.println("el n� introducido es valido! el n� es: " + num1);

		sc.close();
	}

}
