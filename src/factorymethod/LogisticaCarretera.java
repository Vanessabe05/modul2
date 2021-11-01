package factorymethod;

public class LogisticaCarretera extends Logistica {

	@Override
	public Transporte createTransporte() {
		// TODO Auto-generated method stub
		return new Camion();
	}

}
