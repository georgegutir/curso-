package com.ipartek.ejercicios.variablesYoperadores;

/**
 * 
 * @author Jorge Guti�rrez Realizar un programa que cree una variable de cada
 *         uno de los tipos de datos simples que podemos encontrar en el
 *         lenguaje de programaci�n Java, asign�ndoles un valor Una vez creadas,
 *         se mostraran por pantalla los valores de cada una de ellas De manera
 *         adicional, se buscara por internet o otras fuentes, los valores
 *         m�ximos y m�nimos que pueden albergar
 *
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		String nombre = "Ander";
		int edad = 99;
		float sueldo = 6521.99f;
		char sexo = 'v';
		boolean isCovidAffected = true;

		System.out.println("Hola " + nombre);
		System.out.println("Mi edad es " + edad + " a�os");
		System.out.println("Mi sueldo es " + sueldo + " �");

		if (isCovidAffected) {
			System.out.println("** Tienes que hacerte un PCR.");
		} else {
			System.out.println("Estas sano");
		}

		switch (sexo) {
		case 'v':
			System.out.println("Eres Varon");
			break; // es importante usar 'break', podeis probar a comentarlo para ver que pasa

		case 'm':
			System.out.println("Eres Mujer");
			break;

		default: // si no entra por lo casos de arriba, ejecuta este por 'defecto'
			System.out.println("**No sabemos lo que eres");
			break;
		}// switch

	}

}
