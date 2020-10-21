package com.ipartek.ejercicios.variablesYoperadores;

/**
 * 
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor. <br>
 * Meterle valores enteros y positivos. Realizar la operación división y mostrar
 * el resultado en pantalla<br>
 * Repetir el mismo código con estas variaciones: entero y real, real y entero,
 * real y real Por ultimo, intentar dividir en los cuatro casos anteriores entre
 * 0 y mostrar el resultado en pantalla
 *
 * 
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int entero1 = 10;
		int entero2 = 3;
		float real1 = 7.8f;
		float real2 = 2.1f;
		float division1 = entero1 / entero2;
		float division2 = entero1 / real2;
		float division3 = real1 / entero2;
		float division4 = real1 / real2;
		System.out.println("La división entero/entero es " + division1);
		System.out.println("La división entero/real es " + division2);
		System.out.println("La division real/entero es " + division3);
		System.out.println("La division real/real es " + division4);
		System.out.println("La division es" + division1 / 0);
		System.out.println(division2 / 0);
		System.out.println(division3 / 0);
		System.out.println(division4 / 0);

	}

}
