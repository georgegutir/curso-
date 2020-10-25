package ejerciciopractico;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones<br>
 * <ul>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author Jorge G
 *
 */
public class EjercicioB {

	static private Scanner sc = null;
	static private String opcion = ""; // opción seleccionada en el menu por el usuario

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean salida = true;
		try {
			do {
				mostrarMenu();
				switch (opcion) {
				case "1":
					calcularDni();
					break;
				case "2":
					calcularMedida();
					break;
				case "3":
					salida = false;
					System.out.println("************END*************");
					break;
				default:
					System.out.println("Introduzca una opción válida");
					break;
				}
			} while (salida);
		} catch (Exception e) {
			System.out.println("Error");
		}
		sc.close();
	}

	/**
	 * Se encarga de mostrar el menu.
	 */
	private static void mostrarMenu() {
		System.out.println("**************************************");
		System.out.println(" 1.- Calcular la letra del DNI");
		System.out.println(" 2.- Calcular medida de cm a pulgadas");
		System.out.println(" 3 - Salir");
		System.out.println("**************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		opcion = sc.nextLine();
	}

	/**
	 * Pide el nº del DNI y calcula la letra
	 */
	private static void calcularDni() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("Dime los 8 nº de tu dni:");
		String dniNumeros = sc.nextLine();
		if (dniNumeros.length() == 8) {
			int num = Integer.parseInt(dniNumeros);
			int resto = num % 23;
			char l = letras.charAt(resto);
			System.out.println("Tu DNI completo es: " + dniNumeros + l);
		} else {
			System.out.println("los nº del DNI son 8");
		}
	}

	/**
	 * Pide una medida en cm y la devuelve en pulgadas
	 */
	private static void calcularMedida() {
		try {
			System.out.print("Ingrese una medida en cm: ");
			float cm = sc.nextFloat();
			System.out.println("Son " + cm / 2.54 + " pulgadas");
		} catch (NumberFormatException e) {
			System.out.println("Error debe de introducir un nº.");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
