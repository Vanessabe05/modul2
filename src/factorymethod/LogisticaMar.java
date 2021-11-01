package factorymethod;

public class LogisticaMar extends Logistica {

	@Override
	public Transporte createTransporte() {
		// TODO Auto-generated method stub
		return new Barco();
	}

}
