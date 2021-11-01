package factorymethodbutton;

import java.util.Scanner;



public class Aplicacion {
	private ButtonSistemaoperativo buttonSistemaoperativo;

	public void initialize(String tipoSistemaoperativo) throws Exception {
		if (tipoSistemaoperativo.equals("Windows")) {
			buttonSistemaoperativo = new ButtonWindows();
		} else if (tipoSistemaoperativo.equals("Linux")) {
			buttonSistemaoperativo = new ButtonLinux();
		} else if (tipoSistemaoperativo.equals("Mac")) {
			buttonSistemaoperativo = new ButtonMac();
		} else {
			throw new Exception("Sistema Operativo no encontrado");
		}
	}

	public void main(String tipoSistemaoperativo) throws Exception {
		this.initialize(tipoSistemaoperativo);
		buttonSistemaoperativo.imprimeButton();
		// ....
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Proporciona el Sistema Operativo (Windows/Linux/Mac): ");
		String tipoSistemaoperativo = scanner.next();

		Aplicacion aplicacion = new Aplicacion();

		try {
			aplicacion.main(tipoSistemaoperativo);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
