package com.ipartek;

public class Utilidades {

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

		// TODO rellenar codigo
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int num = Integer.parseInt(numeros);
		int resto = num % 23;
		char l = letras.charAt(resto);
		return numeros + String.valueOf(l);
	}

}
