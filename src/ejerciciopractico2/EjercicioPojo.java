package ejerciciopractico2;

public class EjercicioPojo {

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y setters
	///////////////////////////////////////
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int potencia;
	private int cilindrada;

	// Constructor
	///////////////////////////////////////
	public EjercicioPojo() {
		super();
		this.matricula = "sin nombre";
		this.marca = "sin marca";
		this.modelo = "sin modelo";
		this.color = "sin color";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	// Otro constructor
	public EjercicioPojo(String matricula) {
		this();// llama al contructor por defecto, pulsar Control+click y nos lleva al de
				// arriba que es el principal.
		this.matricula = matricula;
	}

	// Getters y setters
	///////////////////////////////////////

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindradaa() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}

}
