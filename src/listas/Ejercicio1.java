package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static ArrayList<String> Alumnos;

	public static void main(String[] args) {

		introducirAlumnos();
		verAlumnos();

	}

	private static void introducirAlumnos() {
		Alumnos = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el nombre del alumno nº" + (i + 1) + ":");
			Alumnos.add(sc.nextLine());
		}
		sc.close();
	}

	private static void verAlumnos() {
		for (String alum : Alumnos) {
			System.out.println(alum);
		}

	}

}
