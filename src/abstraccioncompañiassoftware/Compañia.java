package abstraccioncompa�iassoftware;

import java.util.ArrayList;

public interface Compa�ia {

	public String getrazonsocial();
	public String gettipocompania();
	public String getespecialidad();
	public ArrayList<Empleado> getEmpleados();
	public void asignarEmpleados(Empleado empleado);
}
