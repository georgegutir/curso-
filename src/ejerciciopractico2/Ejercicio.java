package ejerciciopractico2;

import java.util.ArrayList;
import java.util.Scanner;

import ejerciciopractico2.Funciones;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendrá los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada Para rellenar la lista se creara un menú que nos
 * solicitara introducir los datos por teclado, y una vez leídos todos, se
 * guardaran en un objeto que se añadirá a la lista y nos pedirá que indiquemos
 * si queremos introducir un vehículo más o no. Una vez que no queramos
 * introducir más coches, nos mostrara todo el contenido en pantalla Realizar el
 * ejercicio en base a las reglas de programación orientada a objetos
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

		System.out.println("Introduce la matrícula:");
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
