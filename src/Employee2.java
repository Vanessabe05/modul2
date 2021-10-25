
public class Employee2 {

	private String nombre;
	private String appellido;
	private int horas;

	public Employee2(String nombre, String apellido, int horas) {
		this.nombre = nombre;
		this.appellido = apellido;
		this.horas = horas;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppellido() {
		return appellido;
	}

	public void setAppellido(String appellido) {
		this.appellido = appellido;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
