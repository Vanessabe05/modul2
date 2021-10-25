package abstraccioncompañiassoftware;

import java.util.ArrayList;

public interface Compañia {

	public String getrazonsocial();
	public String gettipocompania();
	public String getespecialidad();
	public ArrayList<Empleado> getEmpleados();
	public void asignarEmpleados(Empleado empleado);
}
