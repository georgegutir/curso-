package mf0227.uf2404.actividad2;

public class Coche implements IConducible {// Clase Padre

	// Atributos
	private boolean estaArrancado;

	private String marca;
	private String modelo;

	private int potencia;
	private int cilindrada;

	// Constructor
	public Coche() {
		super();
		this.estaArrancado = false;
		this.marca = "sin marca";
		this.modelo = "sin modelo";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	// Otro constructor
	public Coche(boolean estaArrancado) {
		this();// llama al contructor por defecto, pulsar Control+click y nos lleva al de
				// arriba que es el principal.
		this.estaArrancado = estaArrancado;
	}

	// Getters y setters
	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
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
		return "Coche [estaArrancado=" + estaArrancado + ", marca=" + marca + ", modelo=" + modelo + ", potencia="
				+ potencia + ", cilindrada=" + cilindrada + "]";
	}

	@Override
	public void arrancar() {
		if (!this.estaArrancado) {
			this.estaArrancado = true;
		}
	}

	@Override
	public void parar() {
		if (this.estaArrancado) {
			this.estaArrancado = false;
		}

	}

}
