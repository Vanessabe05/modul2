package liskovsubstitucion;

public class DocumentoTexto extends Documento {

	public DocumentoTexto(String nombreArchivo) {
		super(nombreArchivo);
	}
	
	 public void save() {
	        System.out.println(this.getData() + "se guardo en el archivo " + getNombreArchivo());
	    }
}
