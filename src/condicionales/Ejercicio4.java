package condicionales;

import java.util.Scanner;

/**
 * Mostrar al usuario el siguiente menú:<br>
 * Por favor escoja una opción:<br>
 * <ul>
 * <li>A: calcular área de un triángulo</li>
 * <li>B: calcular área de un cuadrado</li>
 * <li>C: calcular área de un círculo</li>
 * <li>D: calcular área de un pentágono</li>
 * </ul>
 * Realizad las operaciones adecuadas indicadas en cada categoría. En caso de
 * que no se escoja una opción adecuada, se mostrará un mensaje de error.<br>
 * No deberá realizarse este menú en bucle.
 * 
 * @author g
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		boolean letra = true;
		// Mostrar menú
		System.out.println("A: calcular área de un triángulo");
		System.out.println("B: calcular área de un cuadrado");
		System.out.println("C: calcular área de un círculo");
		System.out.println("D: calcular área de un pentágono");
		// Introducir opción
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elige una opción:");
			String op = sc.next();
			// comprobar opción seleccionada
			if (op == "a") {// área del triángulo.
				System.out.println("Introduce la altura:");
				int h = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce la base:");
				int b = Integer.parseInt(sc.nextLine());
				float triangulo = (float) ((h * b) / 2);
				System.out.println("El área es: " + triangulo);
				letra = false;
			} else if (op == "b") {// área del cuadrado
				System.out.println("Introduce el lado:");
				int l = Integer.parseInt(sc.nextLine());
				int cuadrado = l * l;
				System.out.println("El área es: " + cuadrado);
				letra = false;
			} else if (op == "c") {// área del círculo
				System.out.println("Introduce el rádio:");
				int r = Integer.parseInt(sc.nextLine());
				float circulo = (float) (2 * 3.14 * (r * r));
				System.out.println("El área es: " + circulo);
				letra = false;
			} else if (op == "d") {// área del pentágono
				System.out.println("Introduce el lado:");
				int lado = Integer.parseInt(sc.nextLine());
				float pentagono = (float) (lado * 1.72048);
				System.out.println("El área es: " + pentagono);
				letra = false;
			} else {// si son erróneas
				System.out.println("No ha introducido una opción válida");
			}
		} while (letra);
		sc.close();
	}

}
