package com.ipartek;

import java.util.Scanner;

public class ProbarInterfaz {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Utilidades util = new Utilidades();
		try {
			// pedirNombre();
			String nombre = util.pedirNombre();
			System.out.println("Tu nombre es: " + nombre);

			// imprimirNumeroLoteria
			System.out.println("Introduce un tipo de loteria:");
			int loteria = Integer.parseInt(sc.nextLine());
			util.imprimirNumeroLoteria(loteria);

			// calcularVueltas
			System.out.println("Cuánto cuesta el producto comprado:");
			float precio = (float) sc.nextFloat();
			System.out.println("Cantidad entregada:");
			float dinero = (float) sc.nextFloat();
			float vueltas = util.calcularVueltas(precio, dinero);
			System.out.println("Devolver: " + vueltas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fin del programa");
		sc.close();

	}
}