package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.ipartek.pojo.Perro;

public class HashMapEjemplo {

	public static void main(String[] args) {
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		global.put("Laura", "667895789");
		global.put("Pepe", "645895756");
		global.put("Abelardo", "55895711");
		global.put("Daniel", "667111788");
		global.put("Arturo", "667598623");

		// probar a meter un duplicado
		global.put("Arturo", "666555444");
		
		// recuperar el value por la Key
		String telefonoPepe = global.get("Pepe");
		
		
		//obtener todas las Keys
		 Set<String> keys = global.keySet();
		
		//obtener todos los values
		 Collection<String> values = global.values();
		
		// Definir Iterator para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			String value = (String) global.get(key);
			System.out.println("Alumno: " + key + " - " + "Telefono: " + value);
		}

		
		// definir una hashamp con perros la key ser� su id(int) y el value(Perro)		
		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();
		
		// meter 2 perros
		Perro p1 = new Perro("bubba", "boxer", 3);
		p1.setId(12);
		
		Perro p2 = new Perro("Laika", "setter", 2);
		p2.setId(50);
		
		Perro p3 = new Perro("txispi", "chiguagua", 0.45f);
		p3.setId(3);
		
		
		hmPerros.put(50, p2);
		hmPerros.put(12, p1);
		hmPerros.put(3, p3);
		
		
		// recorrer con un Iterator	
		ArrayList<Perro> perros = new ArrayList<Perro>(); 
		for (Iterator<Integer> iterator = hmPerros.keySet().iterator(); iterator.hasNext();) {
			
			int key = (Integer) iterator.next();
			Perro value = hmPerros.get(key);
			perros.add(value);
			System.out.printf("La clave %s pertenece al perro %s \n", key, value);
			
		}
		
        System.out.println("Antes de Ordenar");        
		for (Perro p : perros) {
			System.out.printf(" %-10s %s kg \n", p.getNombre(), p.getPeso() );
		}
		
		// para poder ordenar Clases, debemos implementar la interfaz Comparable en la propia clase	
		Collections.sort(perros);
		
		System.out.println("\n Despues de Ordenar");
		for (Perro p : perros) {
			System.out.printf(" %-10s %s kg \n", p.getNombre(), p.getPeso() );
		}
		
		
		
	}

}