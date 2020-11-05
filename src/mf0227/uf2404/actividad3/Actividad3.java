package mf0227.uf2404.actividad3;

/**
 * Realizar un programa para gestionar una librería.<br>
 * Un libro se compone de los siguientes campos ( id, nombre y número de páginas ).<br>
 * Hay que realizar una interfaz gráfica donde se muestre un menú con las siguientes opciones:<br>
 * Listar todos los libros, dar de baja un libro, modificar un libro y añadir uno nuevo.<br>
 * EXTRAS: 
 * Extender de la clase Abstacta AppGestión
 * Implemenar patrón Singletion para la interfaz del LirbroDAO
 * Usar internamente un HashMap para gestionar la colección de libros en LibroDAO
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad3 extends AppGestion {

	// Variables globales
	static private Scanner sc = null;
	static private String opcion = "";
	static private LibroDAO modelo = impLibroDAO.getinstance();

	public static void main(String[] args) throws Exception {

		boolean salida = true;
		sc = new Scanner(System.in);

		try {
			do {
				AppGestion.pintarMenu("Libro");
				opcion = sc.nextLine();
				switch (opcion) {
				case OP_LISTAR:
					listar();
					break;
				case OP_CREAR:
					crear();
					break;
				case OP_ELIMINAR:
					eliminar();
					break;
				case OP_MODIFICAR:
					modificar();
					break;
				case OP_SALIR:
					salida = false;
					System.out.println("************FIN DEL PROGRAMA*************");
					break;
				default:
					System.out.println("Introduzca una opción válida:");
					break;
				}
			} while (salida);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

	/**
	 * Lista todos los recursos
	 */
	public static void listar() {
		ArrayList<Libro> libros = (ArrayList<Libro>) modelo.getAll();

		System.out.println("*********LISTADO  DE  LIBROS*********");

		for (Libro libro : libros) {
			System.out.println(libro);
		}

		System.out.println("------------------------------------");
		System.out.printf("En la librería hay %s libros en total\n", libros.size());
		System.out.println("------------------------------------");
	}

	/**
	 * Elimina un Recurso
	 */
	public static void eliminar() {
		System.out.println("Introduce el id del libro que quieres eliminar:");
		int id = Integer.parseInt(sc.nextLine());

		if (modelo.delete(id) == false) {
			System.out.println("No se ha podido eliminar");
		} else {
			System.out.println("Libro eliminado");
		}
	}

	/**
	 * Pide por pantalla y crea un nuevo recurso
	 * 
	 * @throws Exception
	 */
	public static void crear() throws Exception {
		Libro libro = new Libro();
		boolean isError = true;
		do {
			try {
				System.out.println("Introduce el nombre del libro");
				libro.setNombre(sc.nextLine());

				System.out.println("Introduce el nº de páginas:");
				libro.setPaginas(Integer.parseInt(sc.nextLine()));

				isError = false;

			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un nº");
				sc.nextLine();
			} catch (Exception e) {
				throw new Exception("Error");
			}
		} while (isError);
		modelo.insert(libro);
	}

	/**
	 * Modifica el Recurso
	 */
	public static void modificar() {

	}
}
