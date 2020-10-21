package com.ipartek.ejercicios.variablesYoperadores;

/**
 * 
 * Realizar un programa que realice la siguiente operación:
 * <UL>
 * <LI>crear tres variables de tipo Byte, llamadas num1, num2, resultado.</LI>
 * <LI>Asignar los valores 255 y 223.</LI>
 * <LI>Sumarlas y guardarlo en resultado.</LI>
 * <LI>Comprueba si el resultado da 478. Si no lo da, buscar una solución al
 * problema para solucionarlo</LI>
 * </UL>
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		byte num1 = (byte) 255;
		byte num2 = (byte) 223;
		byte resultado = (byte) (num1 + num2);
		System.out.println("La suma es " + resultado);

		if (resultado == 478) {
			// int resultado1 = (int) num1 + (int) num2;

		} else {
			int num1entero = (num1 & 0xFF); // 255
			int num2entero = (num2 & 0xFF); // 223
			int resultado1 = num1entero + num2entero;
			System.out.println("La suma es " + resultado1);

		}

	}
}
