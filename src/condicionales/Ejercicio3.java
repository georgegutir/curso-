package condicionales;

import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm<br>
 * Una vez introducida, se solicitará que escoja a que unidad se van a
 * convertir, introduciendo la opción por teclado<br>
 * <ul>
 * <li>A convertir a metros</li>
 * <li>B: convertir a pulgadasz/li>
 * <li>C: Convertir a pies</li>
 * <li>D: Convertir a yardas</li>
 * </ul>
 * 
 * @author g
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// ingresar nº
		System.out.print("Ingrese una distancia en cm: ");
		Scanner sc = new Scanner(System.in);
		float cm = sc.nextFloat();
		// pedir unidad a convertir
		System.out.println("A qué unidad quiere convertirla?:");
		Scanner sc1 = new Scanner(System.in);
		String unidad = sc1.next();
		if (unidad.equals("metro")) {
			System.out.println("Son " + cm / 100 + "m");
		} else if (unidad.equals("pulgadas")) {
			System.out.println("Son " + cm / 2.54 + " pulgadas");
		} else if (unidad.equals("pies")) {
			System.out.println("Son " + cm / 30.48 + " pies");
		} else if (unidad.equals("yardas")) {
			System.out.println("Son " + cm / 91.44 + " yardas");
		} else {
			System.out.println("No has introducido una unidad correcta");
		}
		sc.close();
		sc1.close();
	}

}
