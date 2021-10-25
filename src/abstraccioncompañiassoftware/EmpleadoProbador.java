package abstraccioncompañiassoftware;

public class EmpleadoProbador implements Empleado{
	private String nombre;
	private int edad;
	private String tipoEmpleado;

	public EmpleadoProbador(String nombre, int edad, String tipoEmpleado) {

		this.nombre = nombre;
		this.edad = edad;
		this.tipoEmpleado = tipoEmpleado;
	}

	public void tipoEmpleado() {
		System.out.println("Tipo empleado: " + tipoEmpleado);
	}

	public void settipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

}
