package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Funciones {
	// crear arraylist
	static ArrayList<Vehiculo> lista = new ArrayList<>();

	public static void pedirDatosPorConsola() throws Exception {// te piden los datos a introducir de cada coche a
																// guardar.
		// arraylist
		Vehiculo car = new Vehiculo();
		Scanner sc = new Scanner(System.in);
		boolean isError = true;
		do {
			try {
				System.out.println("Introduce la matrícula:");
				car.setMatricula(sc.nextLine());

				System.out.println("Introduce la marca:");
				car.setMarca(sc.nextLine());

				System.out.println("Introduce el modelo:");
				car.setModelo(sc.nextLine());

				System.out.println("Introduce el color:");
				car.setColor(sc.nextLine());

				System.out.println("Introduce la potencia:");
				car.setPotencia(Integer.parseInt(sc.nextLine()));

				System.out.println("Introduce la cilindrada:");
				car.setCilindrada(Integer.parseInt(sc.nextLine()));

				isError = false;

			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un nº");
				sc.nextLine();
			} catch (Exception e) {
				throw new Exception("Error");
			}
		} while (isError);

		lista.add(car);
	}

	public static void listarCoches() {// ver todos los coches que hay guardados en el arraylist

		System.out.println("******LISTADO  DE  COCHES******");

		for (Vehiculo car : lista) {
			System.out.println(car);
		}

		System.out.println("------------------");
		System.out.printf("%s coches en total\n", lista.size());
		System.out.println("------------------");
	}

	public static void pintarMenu() {// Mostrar las opciones del menú

		System.out.println("*******************************");
		System.out.println(" 1.- Añadir coche");
		System.out.println(" 2.- Listar coches");
		System.out.println(" 3.- Salir");
		System.out.println("*******************************");
		System.out.println("Selecciona una opción del menú:");

	}
}
