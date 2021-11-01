package factorymethod;

public abstract class Logistica {
	public void planDelivery() {
		Transporte transporte = createTransporte();
		System.out.println("Setting the plan."); ////
		transporte.deliver();
	}

	public abstract Transporte createTransporte();
}
