package abstraccioncompañiassoftware;

public class TestCompañiassoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoDiseñador empleadodiseñador = new EmpleadoDiseñador("Josue Medina", 28, "Diseñador");
		EmpleadoProgramador empleadoprogramador = new EmpleadoProgramador("Tania Rosas", 26, "Programador", "Videojuegos");
		EmpleadoProbador empleadoprobador = new EmpleadoProbador("Carlos Pineda", 40, "Pruebas");
		
		System.out.println("En la la compañia VECOAU contamos con los empleados :  " );
		empleadodiseñador.tipoEmpleado();
		empleadoprogramador.tipoEmpleado();
		empleadoprobador.tipoEmpleado();
		
		//Agregamos una nueva compañia
		CompañiaSoftwareVideojuegos compania1 = new CompañiaSoftwareVideojuegos("FastGamer", "Software", "Videojuegos");
		//Creamos el nuevo empleado para la compañia
		EmpleadoMarketing empleadomarketing = new EmpleadoMarketing("Susana Peralta", 36, "Marketing");
		//Agregamos sus empleados
		compania1.asignarEmpleados(empleadodiseñador);
		compania1.asignarEmpleados(empleadoprogramador);
		compania1.asignarEmpleados(empleadomarketing);
		
		System.out.println("Compañia dada de alta: " + compania1.getrazonsocial() + " especializada en " + compania1.getespecialidad());
		System.out.println("Empleados : ");
		for(int i = 0; i < compania1.getEmpleados().size(); i++ ) {
			System.out.println("Nombre : " + compania1.getEmpleados().get(i).getNombre());
			compania1.getEmpleados().get(i).tipoEmpleado();
		}
		
		

	}

}
