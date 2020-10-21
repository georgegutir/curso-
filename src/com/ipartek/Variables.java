package com.ipartek;

/**
 * Es un ejercicio para aprender a declarar variables en java
 * 
 * @author Jorge Gutiérrez
 * @version 1.0
 *
 */

public class Variables {

	/**
	 * Comentario de javadoc que sirve para documentar Usamos el metodo main para
	 * poder ejecutar nuestro codigo java
	 * 
	 * @param args - array de string con los argumentos para ejecutar este argumento
	 */

	public static void main(String[] args) {
		// comentario de linea

		/*
		 * 
		 * Es un comentario de bloque
		 * 
		 */

		// las variables en java se declaran: TIPO nombre = valor;
		String nombre = "Ander";
		int edad = 99;
		float sueldo = 6521.99f;

		char sexo = 'v';
		boolean isCovidAffected = true;

		System.out.println("Hola " + nombre);
		System.out.println("Mi edad es " + edad + " años");
		System.out.println("Mi sueldo es " + sueldo + " €");

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
	}// main

}
