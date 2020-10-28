package ejerciciopractico2;

import java.util.Scanner;

public class Funciones {

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
