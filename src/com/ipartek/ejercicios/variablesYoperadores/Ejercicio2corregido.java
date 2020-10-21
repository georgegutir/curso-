package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
 * operaciones:
 * <ul>
 * <li>La suma de todos los números</li>
 * <li>La resta de todos los números</li>
 * <li>La media de todos los números</li>
 * </ul>
 *
 * @author ur00
 *
 */
public class Ejercicio2corregido {

	public static void main(String[] args) {

		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, totalsuma, totalresta;
		int array[] = { 10, 5, 1, 2, 9, -10, -5, -1, -2, -9 };
		double sumatoriosemana = 0.0;
		num1 = 10;
		num2 = 5;
		num3 = 1;
		num4 = 2;
		num5 = 9;
		num6 = -10;
		num7 = -5;
		num8 = -1;
		num9 = -2;
		num10 = -9;
		totalsuma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		totalresta = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;

		for (int i = 0; i < array.length; i++) {
			sumatoriosemana = sumatoriosemana + array[i];
		}
		sumatoriosemana = sumatoriosemana / array.length;

		System.out.println("La suma total es: " + totalsuma);
		System.out.println("La resta total es: " + totalresta);
		System.out.println("La media es: " + sumatoriosemana);

		int temperaturaSemana[] = { 10, 16, 19, 20, 23, 21, 20 };
		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		// float mediaSemana;

		for (int i = 0; i < temperaturaSemana.length; i++) {

			System.out.println(diasSemana[i] + " hace " + temperaturaSemana[i] + " grados");
			// mediaSemana += temperaturaSemana[i]; // mediaSemana = mediaSemana +
			// mediaSemana se abrevia +=

		} // for
			// Calcular media con 2 decimales
		double mediasemana = sumatoriosemana / temperaturaSemana.length;
		System.out.printf("Media de la semana es %.2f: ", mediasemana);

	}

}
