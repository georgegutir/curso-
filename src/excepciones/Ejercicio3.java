package excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Realice un programa q nos solicite los nº del dni y nos calcule la letra.<br>
 * Usar el mçetodo de la Clase Utilidades<br>
 * Tenemos q capturar la excepción q nos lanza la función <b<calcularletraDNI<b>
 * 
 * @author g
 *
 */
public class Ejercicio3 {// throws

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los 8 nº de tu dni:");
		String dniNumeros = sc.nextLine();

		try {
			String dniCompleto = Utilidades.calcularLetraDni(dniNumeros);
			System.out.println("Tu DNI completo es: " + dniCompleto);

		} catch (Exception e) {
			System.out.println(" Lo sentimos pero tu dni no es valido " + dniNumeros);
		}

		sc.close();
	}

}
