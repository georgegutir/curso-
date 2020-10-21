package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde código valores (se recomienda valores entre -10 y 10) realizar las siguientes operaciones:
 * <UL>
 * <LI>La suma de todos los números</LI>
 * <LI>La resta de todos los números</LI>
 * <LI>La media de todos los números</LI>
 * </UL>
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = -5;
		int num3 = 7;
		int num4 = 10;
		int num5 = -9;
		float num6 = 6.3f;
		float num7 = -3.4f;
		float num8 = -5.7f;
		float num9 = 2.9f;
		float num10 = 5.1f;
		float suma = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
		float resta = num1-num2-num3-num4-num5-num6-num7-num8-num9-num10;
		float media = suma/10;
		
		System.out.println("La suma es "+suma);
		System.out.println("La resta es "+resta);
		System.out.println("La media es "+media);

	}//for

}
