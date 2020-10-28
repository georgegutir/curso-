package com.ipartek.pojo;

public class Futbol {

	private String nombre;
	private int dorsal;

	public Futbol(String nombre) {
		super(); // llamamos al constructor del padre que es java.lang.Object
		this.nombre = nombre;
		this.dorsal = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
}
