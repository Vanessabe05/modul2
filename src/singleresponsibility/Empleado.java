package singleresponsibility;

public class Empleado {

	private String name;
	private String ssn;

	public Empleado(String name) {
		this.name = name;
	}

	public void imprimeReporteHoras() {
		System.out.println("Reporte de horas " + name);
		System.out.println("Horas trabajadas: ...");
		System.out.println("Vacaciones: ...");
		System.out.println("Dias de: ...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
