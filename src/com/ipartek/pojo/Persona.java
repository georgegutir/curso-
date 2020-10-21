package com.ipartek.pojo;

public class Persona {
	// Constantes
	public static final int EDAD_MIN = 0;
	public static final int EDAD_MAX = 120;
	// atributos
	private String nombre;
	private int edad;

	// Constructor por defecto
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
	}

	// Getters y setters
	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public int getedad() {
		return edad;
	}

	public void setedad(int edad) throws Exception {
		if (edad < EDAD_MIN || edad > EDAD_MAX) {
			throw new Exception(
					String.format("Error, la edad debe estar comprendida entre %s y %s", EDAD_MIN, EDAD_MAX));
		} else {
			this.edad = edad;
		}
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
