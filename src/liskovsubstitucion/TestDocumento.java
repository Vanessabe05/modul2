package liskovsubstitucion;

public class TestDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proyecto proyecto = new Proyecto();
		Documento actaProyecto = new Documento("actaProyecto");
		Documento especificacionRequerimientos = new DocumentoTexto("especificacionRequerimientos");
		Documento especificacionArquitectonica = new DocumentoTexto("especificacionArquitectonica");

		proyecto.addDocument(actaProyecto);
		proyecto.addDocument(especificacionArquitectonica);
		proyecto.addDocument(especificacionRequerimientos);
		proyecto.openAll();
		proyecto.saveAll();
	}

}
