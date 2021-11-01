package adaptadorjson;

public class Xml {
	String nombre;
	String informacion;
	int tamanio;

	public Xml(String nombre, String informacion, int tamanio) {
		super();
		this.nombre = nombre;
		this.informacion = informacion;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
}
