package condicionales;

import java.util.Scanner;

/**
 * Mostrar al usuario el siguiente men�:<br>
 * Por favor escoja una opci�n:<br>
 * <ul>
 * <li>A: calcular �rea de un tri�ngulo</li>
 * <li>B: calcular �rea de un cuadrado</li>
 * <li>C: calcular �rea de un c�rculo</li>
 * <li>D: calcular �rea de un pent�gono</li>
 * </ul>
 * Realizad las operaciones adecuadas indicadas en cada categor�a. En caso de
 * que no se escoja una opci�n adecuada, se mostrar� un mensaje de error.<br>
 * No deber� realizarse este men� en bucle.
 * 
 * @author g
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		boolean letra = true;
		// Mostrar men�
		System.out.println("A: calcular �rea de un tri�ngulo");
		System.out.println("B: calcular �rea de un cuadrado");
		System.out.println("C: calcular �rea de un c�rculo");
		System.out.println("D: calcular �rea de un pent�gono");
		// Introducir opci�n
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elige una opci�n:");
			String op = sc.next();
			// comprobar opci�n seleccionada
			if (op == "a") {// �rea del tri�ngulo.
				System.out.println("Introduce la altura:");
				int h = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce la base:");
				int b = Integer.parseInt(sc.nextLine());
				float triangulo = (float) ((h * b) / 2);
				System.out.println("El �rea es: " + triangulo);
				letra = false;
			} else if (op == "b") {// �rea del cuadrado
				System.out.println("Introduce el lado:");
				int l = Integer.parseInt(sc.nextLine());
				int cuadrado = l * l;
				System.out.println("El �rea es: " + cuadrado);
				letra = false;
			} else if (op == "c") {// �rea del c�rculo
				System.out.println("Introduce el r�dio:");
				int r = Integer.parseInt(sc.nextLine());
				float circulo = (float) (2 * 3.14 * (r * r));
				System.out.println("El �rea es: " + circulo);
				letra = false;
			} else if (op == "d") {// �rea del pent�gono
				System.out.println("Introduce el lado:");
				int lado = Integer.parseInt(sc.nextLine());
				float pentagono = (float) (lado * 1.72048);
				System.out.println("El �rea es: " + pentagono);
				letra = false;
			} else {// si son err�neas
				System.out.println("No ha introducido una opci�n v�lida");
			}
		} while (letra);
		sc.close();
	}

}
