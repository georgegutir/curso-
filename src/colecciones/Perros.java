package colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class Perros {

	public static void main(String[] args) {
		// crar arraylist sobre la clase perro
		ArrayList<Perro> perros = new ArrayList<Perro>();

		// insertar perros
		Perro p = new Perro();
		p.setNombre("Laika");
		perros.add(p);
		p.setNombre("Milú");
		p.setPeso(15);
		perros.add(p);
		p.setNombre("Rintintin");
		p.setRaza("terrier");
		perros.add(p);
		p.setNombre("Ideafix");
		p.setVacunado(false);
		p.setHistoria("Obelix");
		perros.add(p);
		perros.add(new Perro("Goofy"));

		// añadir en una posición
		perros.add(2, p);

		// recuperar un perro
		p = new Perro();
		p = perros.get(1);
		System.out.println(p);

		// vamos a recorrer el array para buscar a "Rintintin"
		for (int i = 0; i < perros.size(); i++) {

			Perro pIteracion = perros.get(i);

			if ("Rintintin".equals(pIteracion.getNombre())) {
				perros.remove(i);
				break; // salir del for
			}

		} // for

		// recorrer para mostrar con Iterator

	}

}
