package openclosed;

public class EnvioTerrestre implements Envio{

	@Override
	public double calculaCosto(Orden orden) {
		// TODO Auto-generated method stub
		return Double.max(20, orden.getTotalWeight() * 3);
	}

}
