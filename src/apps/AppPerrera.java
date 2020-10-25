package apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario

	public static void main(String[] args) {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);
		boolean salida = true;

		incializarDatos();

		do {
			pintarMenu();
			switch (opcion) {
			case "1":
				listar();
				break;
			case "2":
				crear();
				break;
			case "3":
				eliminar();
				break;
			case "4":
				// TODO
				modificar();
				break;
			case "s":
				salida = false;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;
			default:
				System.out.println("Introduzca una opción válida");
				break;
			}
		} while (salida);
		sc.close();
	}// main

	private static void eliminar() {
		System.out.println("Introduce el nombre del perro que quiere eliminar");
		String nom = sc.nextLine();
		// buscar perros en la lista
		for (int i = 0; i < lista.size(); i++) {
			Perro p = lista.get(i);
			String nombre = p.getNombre();
			// Comprobar nombre
			if (nom.equals(nombre)) {
				lista.remove(i);
				System.out.println("Se ha eliminado a " + nom);
			}
		}
	}

	private static void modificar() {
		System.out.println("Introduzca el nombre del perro a modificar");
		String nom = sc.nextLine();
		for (Perro p : lista) {
			if (p.getNombre().equals(nom)) {
				// Pedir dato a modificar
				System.out.println("Selecciona una opción a modificar:");
				System.out.println("1. Nombre");
				System.out.println("2. Raza");
				String op = sc.nextLine();
				switch (op) {
				case "1":
					System.out.println("Introduzca el nuevo nombre:");
					p.setNombre(sc.nextLine());
					break;
				case "2":
					System.out.println("Introduzca la nueva raza:");
					p.setRaza(sc.nextLine());
					break;
				}
			}
		}
	}

	private static void crear() {
		Perro p = new Perro();
		// pedir datos
		System.out.println("Introduce el nombre:");
		p.setNombre(sc.nextLine());
		System.out.println("Introduce la raza: ");
		p.setRaza(sc.nextLine());
		System.out.println("Introduce el peso: ");
		p.setPeso(sc.nextFloat());
		System.out.println("Introduce si ha sido vacunado: ");
		p.setVacunado(sc.nextBoolean());
		System.out.println("¡Se ha añadido un nuevo perro!");
		// añadir
		lista.add(p);
	}

	private static void listar() {
		for (Perro p : lista) {
			String nom = p.getNombre();
			String raz = p.getRaza();
			System.out.println("- " + nom + " de raza " + raz);
		}
	}

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void incializarDatos() {

		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));

	}

	/**
	 * Se encarga de pintar las posiciones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {
		System.out.println("************************************");
		System.out.println(" 1.- Listar todos los perros");
		System.out.println(" 2.- Crear un perro");
		System.out.println(" 3.- Dar de baja un perro");
		System.out.println(" 4.- Modificar datos de un perro");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();
	}
}// AppPerrera
