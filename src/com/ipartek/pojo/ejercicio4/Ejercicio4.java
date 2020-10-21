package com.ipartek.pojo.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * Crea una clase Persona con los atributos nombre y edad. <br>
 * En el método setEdad lanzar una excepción si la edad introducida es menor que
 * 0 o mayor que 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
 * creados. Solo introducirá las personas en la lista si están en el rango de
 * edad indicado, comprobándolo mediante el uso de excepciones. <br>
 * Ej: probar a crear las siguientes personas:
 * <ol>
 * <li>“pepe” con 56 años</li>
 * <li>“matusalem” con 199 años</li>
 * </ol>
 *
 * @author ur00
 * @version 1.0
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int numero = 0;
		int contador = 0;
		String nombre = "";
		int edad = 0;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		System.out.println("¿Cuántas personas quieres introducir?");
		Scanner sc = new Scanner(System.in);
		numero = Integer.parseInt(sc.nextLine());
		// contador=numero
		// persona p[] = new persona[numero]

		do {
			try {// Pedir datos por pantalla
				System.out.println("Introduce el nombre de la persona nº " + (contador + 1) + ":");
				nombre = sc.nextLine();
				System.out.println("Introduce la edad de la persona nº " + (contador + 1) + ":");
				edad = Integer.parseInt(sc.nextLine());

				// crear objeto y guardar en array
				Persona p = new Persona();
				p.setnombre(nombre);
				p.setedad(edad);
				personas.add(p);
				contador++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (contador < numero);
		for (Persona pout : personas) {
			System.out.println(pout);
		}
		sc.close();
	}

}
