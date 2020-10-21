package excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”.<br>
 * Pruebe a introducir b=0 y ver que hace el programa con la división por
 * cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa.<br>
 * Añada excepciones para recoger estas excepciones y avisar del problema al
 * usuario
 * 
 * @param args
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// crear variables
		boolean isError = true;
		float a, b, res;
		Scanner sc = new Scanner(System.in);
		do {
			try {// introducir nº y realizar división
				System.out.print("Introduce el nº a: ");
				a = sc.nextFloat();
				try {
					System.out.print("Introduce el nº b: ");
					b = sc.nextFloat();
					res = a / b;
					System.out.printf("El resultado es: " + res);
					isError = false;
				} catch (NumberFormatException e) {// si no introduce un nº
					sc.nextLine();// TODO al introducir mal el nº b vuelve a pedir al a
					System.out.println("Debe introducir un número");
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero"); // si divide entre 0
				}
			} catch (NumberFormatException e) {// si no introduce un nº
				sc.nextLine();
				System.out.println("Debe introducir un número");
			} catch (Exception e) {// esta, la genérica, siempre la última
				System.out.println("Hemos tenido un problema");
			}
		} while (isError);
		sc.close();
	}

}
