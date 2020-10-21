package excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego
 * calcule �a/b�.<br>
 * Pruebe a introducir b=0 y ver que hace el programa con la divisi�n por
 * cero.<br>
 * Pruebe a introducir b=�Carlos� para ver c�mo se comporta el programa.<br>
 * A�ada excepciones para recoger estas excepciones y avisar del problema al
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
			try {// introducir n� y realizar divisi�n
				System.out.print("Introduce el n� a: ");
				a = sc.nextFloat();
				try {
					System.out.print("Introduce el n� b: ");
					b = sc.nextFloat();
					res = a / b;
					System.out.printf("El resultado es: " + res);
					isError = false;
				} catch (NumberFormatException e) {// si no introduce un n�
					sc.nextLine();// TODO al introducir mal el n� b vuelve a pedir al a
					System.out.println("Debe introducir un n�mero");
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero"); // si divide entre 0
				}
			} catch (NumberFormatException e) {// si no introduce un n�
				sc.nextLine();
				System.out.println("Debe introducir un n�mero");
			} catch (Exception e) {// esta, la gen�rica, siempre la �ltima
				System.out.println("Hemos tenido un problema");
			}
		} while (isError);
		sc.close();
	}

}
