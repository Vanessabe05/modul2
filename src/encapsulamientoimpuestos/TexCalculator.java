package encapsulamientoimpuestos;

public class TexCalculator {

	String pais;

	public TexCalculator(String pais) {

		this.pais = pais;
	}

	public double obtenerImpuesto() {
		double impuesto = 0.00;
		
		if (pais == "MX") {
			impuesto = 0.16;
		} else if (pais == "US") {
			impuesto = 0.07;
		} else if (pais == "EU") {
			impuesto = 0.21;
		} else if (pais == "JP") {
			impuesto = 0.10;
		}

		return impuesto;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
