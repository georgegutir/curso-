package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

/**
 * La historia de los 8 perros mas famosos.<br>
 * Crear 8 perros con su constructor por defecto y setear el nombre e
 * historia.<br>
 * Mostrar por pantalla sus nombres e historias;
 * 
 * 
 * @see https://blog.patasbox.com/los-8-perros-mas-fomos-de-la-historia/
 * @author ur00
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Perro Laika = new Perro();
		Laika.setNombre("Laika");
		Laika.setHistoria(
				"Esta famosa perrita soviética fue el primer ser vivo en viajar al espacio. En 1957 emprendió su viaje y desafortunadamente murió a las 5 horas de despegar por el estrés y la falta de oxígeno. Este suceso puso en el punto de mira los experimentos con animales. Desde entonces Laika ha sido un icono en la historia.");

		Perro Hachiko = new Perro();
		Hachiko.setNombre("Hachiko");
		Hachiko.setHistoria(
				"Pocos perros han sido tan famosos como él, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. Este perro de raza Akita conmocionó al mundo con su historia de lealtad y amor por su amo. Su historia se hizo famosa por estar durante 10 años esperando a su dueño en la estación de metro, a pesar de que éste había muerto en uno de los trayectos. ");

		Perro Balto = new Perro();
		Balto.setNombre("Balto");
		Balto.setHistoria(
				"Este husky siberiano comandó a un grupo de perros para llevar vacunas a un pueblo que tenía una epidemia de difteria y que se encontraba aislado a mil kilómetros de distancia del hospital más cercano. Se le considera el héroe de los niños del pueblo Nome.");

		Perro Rintintin = new Perro();
		Rintintin.setNombre("Rin Tin Tin");
		Rintintin.setHistoria(
				"Este pastor alemán se hizo famoso por interpretar 27 peliculas mudas de Hollywood. En 1929 incluso recibió varios votos para ser el ganador de un premio Óscar, sin embargo la propia academia lo tuvo que denegar por no ser una persona. ");

		Perro Stubby = new Perro();
		Stubby.setNombre("Stubby");
		Stubby.setHistoria(
				"El sargento Stubby fue un héroe de la Primera Guerra Mundial. Era un  american pitbull terrier que acompañó durante los años de guerra a las tropas americanas. Se encargaba de avisarles de peligros y de gases que puedieran afectarles. Fue condecorado por el gobierno francés y estadounidense. ");

		Perro Pancho = new Perro();
		Pancho.setNombre("Pancho");
		Pancho.setHistoria(
				"Pancho ha sido sin duda uno de los perros más famosos en España. Lo vimos hacerse millonario jugando a la primitiva e irse de vacaciones al Caribe. También compartió pantalla con la loca comunidad de vecinos de “Aquí no hay quien viva”. Su muerte fue un momento duro para el cine español. ");

		Perro Bobby = new Perro();
		Bobby.setNombre("Greyfriars Bobby");
		Bobby.setHistoria(
				"Es conocido por ser el perro más fiel del mundo. Para conocer su historia nos trasladamos hasta Edimburgo. Bobby fue acompañante durante varios años de un vigilante de seguridad. Después de que éste muriera Bobby pasó 14 años hasta su muerte junto a su tumba. ");

		Perro Smoky = new Perro();
		Smoky.setNombre("Smoky");
		Smoky.setHistoria(
				"Este pequeño Yorkshire fue encontrado por un soldado estadounidense en la Primera Guerra Mundial y le acompañó en todas sus misiones. La historia cuenta que incluso ayudó a construir una base aérea transportando cable. Fue también un perro terapia para las víctimas de la guerra que estaban hospitalizadas. ");

		System.out.println("Historia de los perro más famosos");
		System.out.println(Laika.getNombre());
		System.out.println(Laika.getHistoria());

	}

}
