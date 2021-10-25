package abstraccioncompañiassoftware;

public class EmpleadoProgramador implements Empleado {
	private String nombre;
	private int edad;
	private String tipoEmpleado;
	private String especialidad;

	public EmpleadoProgramador(String nombre, int edad, String tipoEmpleado, String especialidad) {

		this.nombre = nombre;
		this.edad = edad;
		this.tipoEmpleado = tipoEmpleado;
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
