package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static ArrayList<String> Futbolistas;

	public static void main(String[] args) {

		introducirFutbolistas();
		verFutbolistas();

	}

	private static void introducirFutbolistas() {
		Futbolistas = new ArrayList<String>();
		boolean opcion = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce nombre del futbolista:");
			Futbolistas.add(sc.nextLine());
			System.out.println("Introduce dorsal del futbolista:");
			// Futbolistas.add(Integer.parseInt(sc.nextLine()));
		} while (opcion);
		sc.close();
	}

	private static void verFutbolistas() {
		for (String fut : Futbolistas) {
			System.out.println(fut);
		}

	}

}
