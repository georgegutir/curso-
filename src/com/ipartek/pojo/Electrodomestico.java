package com.ipartek.pojo;

/**
 * Realizar las siguientes jerarquías de herencia: <br>
 * tendremos una clase padre que se llamara Electrodoméstico. <br>
 * Dicha clase contara con los atributos nombre y precio. Se realizaran todos
 * los constructores, métodos get y set necesarios<br>
 * Una vez creada dicha clase, se creara una serie de clases hijas. <br>
 * La primera será la clase televisor. Dicha clase contara con el atributo
 * pulgadas, así como con todos los constructores y métodos necesarios para
 * rellenar sus atributos, incluidos los del padre<br>
 * También se creara una clase televisionPlana, que heredara de televisión,
 * tendrá el atributo string tipo de pantalla ( tft, plasma,..) y constructores,
 * métodos get y set para rellenar los datos de los objetos que se creen,
 * incluyendo todos los atributos de los objetos de las clases padres de las que
 * heredan<br>
 * Una vez creado esta jerarquía de herencia, realizar un programa que nos pida
 * insertar televisiones planas dentro de un array de electrodomésticos. Dicho
 * array constara de 5 electodomesticos, pero lo rellenaremos con objetos de
 * tipo televisiónPlana.
 * 
 * @author g
 *
 */
public class Electrodomestico {

	private String nombre;
	private float precio;

	public Electrodomestico() {
		super();
		this.nombre = "";
		this.precio = 0;
	}

	public Electrodomestico(String nombre, int precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + "]";
	}

}