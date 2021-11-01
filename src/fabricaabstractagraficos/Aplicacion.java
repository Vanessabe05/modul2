package fabricaabstractagraficos;

import java.util.Scanner;

public class Aplicacion {

	private EstiloGraficos estiloGraficos;
	private Button button;
	private CajaTexto cajaTexto;
	private CheckBox checkBox;

	public void createSet() {
		button = estiloGraficos.crearBotton();
		cajaTexto = estiloGraficos.crearCajaTexto();
		checkBox = estiloGraficos.crearCheckBox();
	}

	public void imprimegraficos() {
		button.click();
		cajaTexto.input();
		checkBox.seleccion();
	}

	public void initialize(String tipoSistemaOperativo) throws Exception {
		if (tipoSistemaOperativo.equals("windows")) {
			estiloGraficos = new EstiloGraficosWindowsv1();
		} else if (tipoSistemaOperativo.equals("linux")) {
			estiloGraficos = new EstiloGraficosLinuxv1();
		} else {
			throw new Exception("No se soporta el sistema operativo.");
		}
	}

	public void main(String tipoSistemaOperativo) throws Exception {
		this.initialize(tipoSistemaOperativo);
		createSet();
		imprimegraficos();

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Elige el sistema operativo (windows/linux): ");
		String tipoSistemaOperativo = scanner.next();

		Aplicacion application = new Aplicacion();

		try {
			application.main(tipoSistemaOperativo);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
