package factorymethod;

public class LogisticaAire extends Logistica {

	@Override
	public Transporte createTransporte() {
		// TODO Auto-generated method stub
		return new Avion();
	}

}
