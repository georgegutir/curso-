package mf0227.uf2404.actividad3;

public class Libro extends impLibroDAO {

	// Atributos
	private int id;
	private String nombre;
	private int paginas;

	// Constructores
	public Libro() {
		super();
		this.id = 0;
		this.nombre = "sin nombre";
		this.paginas = 0;
	}

	public Libro(int id, String nombre, int paginas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.paginas = paginas;
	}

	// Setters y getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libreria [id=" + id + ", nombre=" + nombre + ", paginas=" + paginas + "]";
	}

}
