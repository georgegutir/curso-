package mf0227.uf2404.actividad3;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class impLibroDAO implements LibroDAO {

	private static HashMap<Integer, Libro> mapLibros = new HashMap<Integer, Libro>();
	private static int indice;
	private static impLibroDAO INSTANCE = null;

	public static synchronized impLibroDAO getinstance() {
		if (INSTANCE == null) {
			INSTANCE = new impLibroDAO();
			mapLibros.put(1, new Libro(1, "El señor de los anillos", 1200));
			mapLibros.put(2, new Libro(2, "Juego de tronos", 950));
			mapLibros.put(3, new Libro(3, "El corazón de las tinieblas", 1050));
			indice = 4;
		}
		return INSTANCE;
	}

	/**
	 * Obtiene todos los libros ordenados Alfabeticamente
	 * 
	 * @return List<Libro>, si no existen libros Lista vacia pero no nula
	 */
	@Override
	public List<Libro> getAll() {
		return new ArrayList<>(mapLibros.values());
	}

	@Override
	public Libro getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		if (mapLibros.containsKey(id)) {
			mapLibros.remove(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Libro l) {
		// se comprueba si no existe en nombre
		boolean nom = false;
		for (Iterator<Integer> iterator = mapLibros.keySet().iterator(); iterator.hasNext();) {
			Integer i = iterator.next();
			Libro dato = mapLibros.get(i);
			if (l.getNombre().equals(dato.getNombre())) {
				nom = true;
				break;
			}
		}
		if (!nom) {
			l.setId(indice);
			mapLibros.put(indice, l);
			indice++;
			System.out.println("Libro añadido.");
			return true;
		}
		return false;
	}
}
