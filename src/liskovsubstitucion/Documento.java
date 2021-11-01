package liskovsubstitucion;

public class Documento {

	private String data;
	private String nombreArchivo;

	public Documento(String nombreArchivo) {
		
		this.nombreArchivo = nombreArchivo;
	}

	public void open() {
		System.out.println("Opening " + nombreArchivo);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
}
