package mf0227.uf2404.actividad2;

import java.util.Scanner;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deber�
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendr� los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada Para rellenar la lista se creara un men� que nos
 * solicitara introducir los datos por teclado, y una vez le�dos todos, se
 * guardaran en un objeto que se a�adir� a la lista y nos pedir� que indiquemos
 * si queremos introducir un veh�culo m�s o no. Una vez que no queramos
 * introducir m�s coches, nos mostrara todo el contenido en pantalla Realizar el
 * ejercicio en base a las reglas de programaci�n orientada a objetos
 * 
 * EXTRAS:<br>
 * <UL>
 * <li>Definir una interfaz IConducible con los m�todos arrancar y parar</LI>
 * <li>clase Vehiculo ( color, matricula ) para el Coche ( marca, modelo,
 * potencia, cilindrada)</li>
 * <li>Realizar un Diagrama de Clases</li>
 * </UL>
 * 
 * @author Jorge Guti�rrez
 *
 */

public class Ejercicio2 {

	// Opciones del men�
	static final private String OP_ANADIR = "1";
	static final private String OP_LISTAR = "2";
	static final private String OP_SALIR = "3";
	// Variables globales
	static private Scanner sc = null;
	// static private String opcion = "";

	public static void main(String[] args) throws Exception {

		boolean salida = true;
		sc = new Scanner(System.in);

		try {
			do {
				Funciones.pintarMenu();
				String opcion = sc.nextLine();
				switch (opcion) {
				case OP_ANADIR:
					Funciones.pedirDatosPorConsola();
					break;
				case OP_LISTAR:
					Funciones.listarCoches();
					break;
				case OP_SALIR:
					salida = false;
					System.out.println("************FIN DEL PROGRAMA*************");
					break;
				default:
					System.out.println("Introduzca una opci�n v�lida:");
					break;
				}
			} while (salida);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
