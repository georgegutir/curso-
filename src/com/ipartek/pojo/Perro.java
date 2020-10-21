package com.ipartek.pojo;

public class Perro {

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private String nombre;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	// Constructor
	///////////////////////////////////////
	public Perro() {
		super();
		this.nombre = "Sin nombre";
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez...";
	}

	// Otro constructor
	public Perro(String nombre) {
		this();// llama al contructor por defecto, pulsar Control+click y nos lleva al de
				// arriba que es el principal.
		this.nombre = nombre;
	}

	// Getters y setters
	///////////////////////////////////////

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			this.peso = 0;
		} else {
			this.peso = peso;
		}
	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String gethistoria() {
		return historia;
	}

	public void sethistoria(String historia) {
		this.historia = historia;
	}

	@Override
	public String toString() {
		return "perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado
				+ ", historia=" + historia + "]";
	}

}