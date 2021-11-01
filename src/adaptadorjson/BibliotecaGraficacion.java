package adaptadorjson;

public class BibliotecaGraficacion {

	private String tipoGrafica;

	public BibliotecaGraficacion(String tipoGrafica) {

		this.tipoGrafica = tipoGrafica;
	}
	
	public void grafica(Json json) {
		System.out.println("Graficado el Json: " + json.getNombre());
		System.out.println("Informacion: " + json.getInformacion());
		
	}

}
