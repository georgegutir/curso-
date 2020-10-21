package excepciones;

import java.util.Scanner;

import com.ipartek.Posicion;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada. Llámelo pasando como parámetro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepción por un paso de parámetros a null, no
 * acabe con la ejecución del programa.<br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
 * no es una maravilla”)
 * 
 * @author g
 *
 */
public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();
		System.out.println("Introduce un nº:");
		int num = sc.nextInt();
		try {
			String resultado = Posicion.letraPosicion(frase, num);
			System.out.println("La letra es: " + resultado);

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

		sc.close();

	}

}
