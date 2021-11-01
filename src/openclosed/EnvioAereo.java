package openclosed;

public class EnvioAereo implements Envio {

	@Override
	public double calculaCosto(Orden orden) {
		// TODO Auto-generated method stub
		return Double.max(20, orden.getTotalWeight() * 3);
	}

}
