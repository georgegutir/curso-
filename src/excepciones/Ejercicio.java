package excepciones;

import java.util.Scanner;

import com.ipartek.Posicion;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada. Ll�melo pasando como par�metro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepci�n por un paso de par�metros a null, no
 * acabe con la ejecuci�n del programa.<br>
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el
 * tama�o del string, capturara el error y nos solicitara meter un numero
 * valido, indic�ndonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto �La lluvia en Sevilla
 * no es una maravilla�)
 * 
 * @author g
 *
 */
public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();
		System.out.println("Introduce un n�:");
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
