package mf0227.uf2404.actividad2;

/**
 * Interfaz para obligar a implementar una serie de metodos.
 * 
 * @author Jorge Guti�rrez
 */
public interface IConducible {

	/**
	 * arrancar: pondr� el atributo estaArrancado a true.<br>
	 * Debe estar apagado, en false, para poder arrancarse.
	 */
	void arrancar();

	/**
	 * parar: cambiar� el atributo est� arrancado a false<br>
	 * Debe estar arrancado, en true, para poder pararse.
	 */
	void parar();

}