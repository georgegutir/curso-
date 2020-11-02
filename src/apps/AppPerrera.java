package apps;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.PerroDaoArrayList;
import modelo.PerroDAOSqlite;
import modelo.PerroDao;
import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	static private Scanner sc = null;
	static private PerroDao modelo = new PerroDAOSqlite();
	static private String opcion = ""; // opcion seleccionada en el menu por el usuario

	// opciones del menu
	static final private String OP_LISTAR = "1";
	static final private String OP_CREAR = "2";
	static final private String OP_ELIMINAR = "3";
	static final private String OP_SALIR = "s";

	public static void main(String[] args) {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);
		boolean salir = false;

		do {

			pintarMenu();

			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_CREAR:
				crear();
				break;

			case OP_SALIR:
				salir = true;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;
				
			default:
				System.out.println(" ** por favor selecciona una opci�n valida ** ");
				break;
			}

		} while ( !salir );

		
		sc.close();

	}// main

	private static void crear() {
		
		//TODO gestionar Exceptions
		
		//pedido datos por consola
		System.out.println("Dime el nombre:");
		String nombre = sc.nextLine();
		
		//TODO si no introducimos la raza la deja vacia y deberia ser cruce
		System.out.println("raza (si no la sabes es 'cruce'):");
		String raza = sc.nextLine();
		
		System.out.println("Peso en Kg:");
		float peso = Float.parseFloat(sc.nextLine());
		
		System.out.println("� Esta vacunado ?  [Si/No]");
		boolean isVacunado = ("s".equalsIgnoreCase(sc.nextLine())) ? true : false;
		
		System.out.println("Cuentame su historia (no es obligatorio):");
		String historia = sc.nextLine();
		
		//crear un Perro y setear valores
		Perro pNuevo = new Perro(nombre, raza, peso);
		pNuevo.setVacunado(isVacunado);
		pNuevo.setHistoria(historia);
		
		// llamar al modelo para guardar en la bbdd
		boolean isFallo = true;
		do {
		
			try {
				modelo.crear(pNuevo);
				System.out.println("Perro guardado");
				System.out.println(pNuevo);
				isFallo = false;
				
			}catch (Exception e) {
				System.out.println("** No se ha podido guardar el perro, el nombre ya existe, por favor dime otro");				
				nombre = sc.nextLine();
				pNuevo.setNombre(nombre);
				// e.printStackTrace();
			}	
		} while ( isFallo );	
		
		
	}

	private static void listar() {
		
		// TODO ver como dar una fixed lenght al String para nombre
		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			System.out.println(String.format("%15s [%s]  %4s Kg  %13s %s", perro.getNombre(), perro.getRaza(), perro.getPeso(), (perro.isVacunado()) ? "vacunado" : "*Sin Vacunar*", perro.getHistoria()));			
		}

	}


	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los perros");
		System.out.println(" " + OP_CREAR + ".- Crear un perro");
		System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}// AppPerrera