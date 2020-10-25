package ejerciciopractico;

import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función:<br>
 * <ul>
 * <li>Crear un array de 5 notas que almacenara en formato double.</li>
 * <li>Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde
 * el teclado.</li>
 * <li>Una vez creado el contenido, se calculara la media de las notas así como
 * se mostraran las notas más altas y más bajas de dicho array.</li>
 * 
 * @author Jorge G
 *
 */
public class EjercicioA {

	public static void main(String[] args) {
		double[] notas = new double[5];// se crea el array
		double media = 0;// para sacar la media de las notas
		double max = 0; // guardar la nota máxima
		double min = 10; // guardar la nota mímima
		Scanner sc = new Scanner(System.in);

		try {
			for (int i = 0; i < 5; i++) {// Ss rellena el array por teclado
				System.out.print("Ingrese una nota: ");
				notas[i] = sc.nextDouble();
				media += notas[i];
				// comprobar nortas mayor y menor
				if (max < notas[i]) {
					max = notas[i];
				} else if (min > notas[i]) {
					min = notas[i];
				}
			} // fin for
				// Mostrar resultados
			System.out.println("La nota media es " + media / 5);
			System.out.println("La nota más alta es " + max);
			System.out.println("La nota más baja es " + min);
		} catch (NumberFormatException e) {
			System.out.println("Error debe de introducir un nº.");
		} catch (Exception e) {
			System.out.println("Error, no ha introducido un nº válido");
		}
		sc.close();
	}

}
