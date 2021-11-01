package singleresponsibility;

public class TestEmpleado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Empleado2 empleado2 = new Empleado2("Eduardo Juarez");
        ReporteHoras reporte = new ReporteHoras();
        reporte.imprimeReporteHoras(empleado2);
		
	}

}
