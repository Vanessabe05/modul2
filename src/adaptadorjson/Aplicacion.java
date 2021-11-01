package adaptadorjson;



public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Xml accionesbursatiles = new Xml("acbur.xml","<inf></inf>",65);
	      BibliotecaGraficacion graficacionab = new BibliotecaGraficacion("Barras");
	      FormatoJson formatojson = new FormatoJson(accionesbursatiles);
	      formatojson.creaFormato();
	      graficacionab.grafica(formatojson);
	}

}
