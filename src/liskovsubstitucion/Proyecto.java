package liskovsubstitucion;

import java.util.ArrayList;

public class Proyecto {

	private ArrayList<Documento> documentos;
	private ArrayList<DocumentoTexto> documentosTexto;

	public Proyecto() {
		this.documentos = new ArrayList<>();
		this.documentosTexto = new ArrayList<>();
	}

	public void openAll() {
		for (Documento doc : documentos) {
			doc.open();
		}
	}

	public void saveAll() {
		for (DocumentoTexto doc : documentosTexto) {
			doc.save();
		}
	}

	public void addDocument(Documento documento) {
		documentos.add(documento);

		if (documento instanceof DocumentoTexto) {
			documentosTexto.add((DocumentoTexto) documento);
		}
	}
}
