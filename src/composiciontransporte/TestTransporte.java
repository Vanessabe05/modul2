package composiciontransporte;

public class TestTransporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor tipoMotor = new MotorHibrido();
		Manejo tipoManejo = new ManejoEstandar();
		
		Transporte transporte = new Transporte(tipoManejo, tipoMotor);
		transporte.entrega("Baja California Sur", "Cuadros");

	}

}
