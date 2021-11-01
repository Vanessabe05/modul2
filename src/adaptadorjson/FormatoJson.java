package adaptadorjson;

public class FormatoJson extends Json {

	private Xml xml;
	public FormatoJson(Xml xml) {
	
		this.xml = xml;
	}
	
	public void creaFormato() {
		this.setNombre(this.xml.getNombre() + ".json");
		this.setInformacion(cadenaConvertida(this.xml.getInformacion()));
		
		
	}
	
	private String cadenaConvertida(String informacion) {
		
		return "se convirtio la informacion xml en json {'informacion':ddd}";
	}

}
