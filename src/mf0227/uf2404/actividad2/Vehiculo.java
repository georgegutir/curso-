package mf0227.uf2404.actividad2;

public class Vehiculo extends Coche {// Clase hija que hereda de la clase Coche

	// Atributos
	private String color;
	private String matricula;

	// Constructor
	public Vehiculo() {
		super();
		this.matricula = "sin nombre";
		this.color = "sin color";
	}

	// Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehículo [Matrícula=" + matricula + ", Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Color="
				+ color + ", Potencia=" + getPotencia() + ", Cilindrada=" + getCilindradaa() + ", Está Arrancado="
				+ isEstaArrancado() + "]";
	}

}
