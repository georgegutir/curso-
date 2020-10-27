package apps;

import com.ipartek.Utilidades;
import com.ipartek.pojo.Serie;

/**
 * Segun comience el metodo meain crear 5 series dentro de un arrayList.
 * <a href="http://www.sensacine.com/series/top/" target="_blank">Mirar este
 * enlace para crear las series </a> Pedir por consola los datos de una serie
 * nueva<br>
 * Crear objeto o instancia<br>
 * Guardar el objeto en un ArrayList<br>
 * Listar todas las series.<br>
 * Dar la posibilidad de buscar todas las series de una plataforma concreta<br>
 * 
 * @author ur00
 *
 */
public class AppSerie {

	public static void main(String[] args) throws Exception {
		Utilidades util = new Utilidades();

		// descomentar par probar los metodos
		// TODO mirar porque falla sacnner al probar los dos metodos seguidos
		/*
		 * try { String nombre = util.pedirNombre(); System.out.println("Tu nombre es "
		 * + nombre);
		 * 
		 * }catch (Exception e) { System.out.println( e.getMessage() ); }
		 */

		Serie s = util.pedirDatosPorConsola();
		System.out.println("Tu serie es: " + s);

		// pedirNombre();
		System.out.println("El programa terminar");

	}

}