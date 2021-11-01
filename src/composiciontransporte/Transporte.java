package composiciontransporte;

public class Transporte {

	private Manejo manejo;
	private Motor motor;

	public Transporte(Manejo manejo, Motor motor) {

		this.manejo = manejo;
		this.motor = motor;
	}
	
	  public void entrega(String destination, String cargo) {
	        manejo.modoManejo();
	        motor.mover();
	        System.out.println(cargo + "tiene un destino a:  " + destination);
	    }

}
