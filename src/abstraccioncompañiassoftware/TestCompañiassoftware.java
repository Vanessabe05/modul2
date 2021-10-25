package abstraccioncompa�iassoftware;

public class TestCompa�iassoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoDise�ador empleadodise�ador = new EmpleadoDise�ador("Josue Medina", 28, "Dise�ador");
		EmpleadoProgramador empleadoprogramador = new EmpleadoProgramador("Tania Rosas", 26, "Programador", "Videojuegos");
		EmpleadoProbador empleadoprobador = new EmpleadoProbador("Carlos Pineda", 40, "Pruebas");
		
		System.out.println("En la la compa�ia VECOAU contamos con los empleados :  " );
		empleadodise�ador.tipoEmpleado();
		empleadoprogramador.tipoEmpleado();
		empleadoprobador.tipoEmpleado();
		
		//Agregamos una nueva compa�ia
		Compa�iaSoftwareVideojuegos compania1 = new Compa�iaSoftwareVideojuegos("FastGamer", "Software", "Videojuegos");
		//Creamos el nuevo empleado para la compa�ia
		EmpleadoMarketing empleadomarketing = new EmpleadoMarketing("Susana Peralta", 36, "Marketing");
		//Agregamos sus empleados
		compania1.asignarEmpleados(empleadodise�ador);
		compania1.asignarEmpleados(empleadoprogramador);
		compania1.asignarEmpleados(empleadomarketing);
		
		System.out.println("Compa�ia dada de alta: " + compania1.getrazonsocial() + " especializada en " + compania1.getespecialidad());
		System.out.println("Empleados : ");
		for(int i = 0; i < compania1.getEmpleados().size(); i++ ) {
			System.out.println("Nombre : " + compania1.getEmpleados().get(i).getNombre());
			compania1.getEmpleados().get(i).tipoEmpleado();
		}
		
		

	}

}
