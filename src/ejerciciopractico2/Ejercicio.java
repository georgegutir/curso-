package ejerciciopractico2;

import java.util.ArrayList;
import java.util.Scanner;

import ejerciciopractico2.Funciones;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deber�
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendr� los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada Para rellenar la lista se creara un men� que nos
 * solicitara introducir los datos por teclado, y una vez le�dos todos, se
 * guardaran en un objeto que se a�adir� a la lista y nos pedir� que indiquemos
 * si queremos introducir un veh�culo m�s o no. Una vez que no queramos
 * introducir m�s coches, nos mostrara todo el contenido en pantalla Realizar el
 * ejercicio en base a las reglas de programaci�n orientada a objetos
 * 
 * @author g
 *
 */

public class Ejercicio {

	public static void main(String[] args) {
		boolean opcion = true;

		ArrayList<Coche> lista = new ArrayList<>();
		do {
			pedi
			
			
		} while (opcion);

	}

	public Coche pedirDatosPorConsola() {
		Coche coche = new Coche("");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la matr�cula:");
		coche.setMatricula(sc.nextLine());

		System.out.println("Introduce la marca:");
		coche.setMarca(sc.nextLine());

		System.out.println("Introduce el modelo:");
		coche.setModelo(sc.nextLine());

		System.out.println("Introduce el color:");
		coche.setColor(sc.nextLine());

		System.out.println("Introduce la potencia:");
		coche.setPotencia(Integer.parseInt(sc.nextLine()));

		System.out.println("Introduce la cilindrada:");
		coche.setCilindrada(Integer.parseInt(sc.nextLine()));

		sc.close();
		return coche;
	}

}
