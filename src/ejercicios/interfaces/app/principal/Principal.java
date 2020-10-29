package ejercicios.interfaces.app.principal;

import ejercicios.interfaces.app.clases.Patinete;

public class Principal {

	public static void main(String[] args) {
		Patinete patinete = new Patinete(0, false);

		patinete.arrancar();

		patinete.acelerar(40);

		patinete.acelerar(50);

	}

}
