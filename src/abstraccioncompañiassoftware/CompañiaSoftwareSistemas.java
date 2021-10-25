package abstraccioncompa�iassoftware;

import java.util.ArrayList;

public class Compa�iaSoftwareSistemas implements Compa�ia {
	private String razonSocial;
	private String tipoCompania;
	private String especialidad;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();;

	public Compa�iaSoftwareSistemas(String razonSocial, String tipoCompania, String especialidad) {
		this.razonSocial = razonSocial;
		this.tipoCompania = tipoCompania;
		this.especialidad = especialidad;
	}

	public String getrazonsocial() {
		return razonSocial;
	}

	public void setrazonsocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String gettipocompania() {
		return tipoCompania;
	}

	public void settipocompania(String tipoCompania) {
		this.tipoCompania = tipoCompania;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	@Override
	public void asignarEmpleados(Empleado empleado) {
		// TODO Auto-generated method stub

		empleados.add(empleado);

	}

	@Override
	public String getespecialidad() {
		// TODO Auto-generated method stub
		return especialidad;
	}

	public void setespecialidad(String especialidad) {

		this.especialidad = especialidad;
	}

}
