package factorymethod;

import java.util.Scanner;

public class Aplicacion {

	private Logistica logistica;

	public void initialize(String tipoLogistica) throws Exception {
		if (tipoLogistica.equals("mar")) {
			logistica = new LogisticaMar();
		} else if (tipoLogistica.equals("carretera")) {
			logistica = new LogisticaCarretera();
		} else if (tipoLogistica.equals("aire")) {
			logistica = new LogisticaAire();
		} else {
			throw new Exception("Logistica no soportada");
		}
	}

	public void main(String tipoLogistica) throws Exception {
		this.initialize(tipoLogistica);
		logistica.planDelivery();
		// ....
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Proporciona el tipo de logistica (mar/carretera/aire): ");
		String tipoLogistica = scanner.next();

		Aplicacion aplicacion = new Aplicacion();

		try {
			aplicacion.main(tipoLogistica);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
