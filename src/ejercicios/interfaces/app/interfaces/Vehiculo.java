package ejercicios.interfaces.app.interfaces;

public interface Vehiculo {
	final int VEL_MAX_COCHE = 150;
	final int VEL_MAX_BICI = 50;
	final int VEL_MAX_PATINETE = 80;

	String Arrancar();

	void Acelerar(int incrementoVel);

	void Frenar(int decrementoVel);

	void Apagar();

}
