package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class Utilidades implements IFunciones {

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	static public String calcularLetraDni(String numeros) throws Exception {

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int num = Integer.parseInt(numeros);
		int resto = num % 23;
		char l = letras.charAt(resto);
		return numeros + String.valueOf(l);
	}

	@Override
	public String pedirNombre() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre:");
		String nombre = sc.nextLine();
		sc.close();
		if (nombre.length() <= 1) {
			throw new Exception("El nombre no puede tener menos de 1 letra");
		}
		for (int i = 0; i < nombre.length(); i++) {
			char letra = nombre.charAt(i);
			boolean isNumber = Character.isDigit(letra);
			if (isNumber) {
				throw new Exception("El nombre no puede contener numeros");
			}
		}
		return nombre;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {
		switch (tipoLoteria) {
		case LOTERIA_BONOLOTO:
			System.out.println("01 04 05 16 23 43 15 00");
			break;
		case LOTERIA_EUROMILLON:
			System.out.println("6 - 15 - 37 - 42 Estrellas: 3 - 4");
			break;
		case LOTERIA_QUINIELA:
			System.out.println("2 - 2 - X - 1 - 1 - 2 - 1 - X - 1 - 1 - 2 - 2 Pleno al 15: X");
			break;
		default:
			throw new Exception("No existe ese tipo de loteria");
		}
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		float vueltas;
		if (precioProducto > dineroEntregado) {
			throw new Exception("No tiene suficiente dinero");
		} else {
			vueltas = dineroEntregado - precioProducto;
		}
		return vueltas;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		// TODO Auto-generated method stub
		return null;
	}

}
