package mf0227.uf2404.actividad3;

public abstract class AppGestion {

	// opciones del menú
	static final protected String OP_LISTAR = "1";
	static final protected String OP_CREAR = "2";
	static final protected String OP_ELIMINAR = "3";
	static final protected String OP_MODIFICAR = "4";
	static final protected String OP_SALIR = "s";

	/**
	 * Se encarga de pintar las opciones del menu.
	 * 
	 * @param nombrePojo nombre del recurso que se gestiona en esta App
	 * 
	 */
	protected static void pintarMenu(final String nombrePojo) {

		System.out.println("************************************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los " + nombrePojo);
		System.out.println(" " + OP_CREAR + ".- Crear un " + nombrePojo);
		System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un " + nombrePojo);
		System.out.println(" " + OP_MODIFICAR + ".- Editar un " + nombrePojo);
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");
		System.out.println("Escoja una opción:");
	}

}
