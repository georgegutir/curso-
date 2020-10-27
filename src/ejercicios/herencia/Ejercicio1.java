package ejercicios.herencia;

import com.ipartek.pojo.Estudiante;
import com.ipartek.pojo.Gato;
import com.ipartek.pojo.GatoDomestico;
import com.ipartek.pojo.Persona;
import com.ipartek.pojo.Profesor;

public class Ejercicio1 {

	public static void main(String[] args) throws Exception {

		Persona p = new Persona();
		p.setedad(35);
		p.setnombre("Juan");
		// p.setNotaMedia(8.5f);

		Estudiante estu = new Estudiante();
		estu.setedad(18);
		estu.setnombre("Pepe");
		estu.setNotaMedia(8.5f);

		// crear la profesor Bacterio
		Profesor profe = new Profesor();
		profe.setnombre("Dr Bacterio");
		profe.setedad(88);
		profe.setAsignatura("Quimica avanzada");

		Gato gato = new Gato("Garfiled");
		System.out.println(gato);

		GatoDomestico gMitxi = new GatoDomestico("Mitxi");
		System.out.println(gMitxi);

	}

}