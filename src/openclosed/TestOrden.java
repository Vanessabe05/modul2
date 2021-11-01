package openclosed;



public class TestOrden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item funkoPopMarx = new Item(1, 569.90, 150, 2);
        Item funkoPopHegel = new Item(2, 450.50, 150, 3);
        Item pin = new Item(3, 55.90, 0.5, 1);
        TexCalculator impuesto = new TexCalculator("MX");

        Envio groundShipping = new EnvioAereo();
        Envio airShipping = new EnvioTerrestre();
        Envio seaShipping = new EnvioMaritimo();
        Orden order = new Orden(impuesto, groundShipping);
        order.addItem(pin);
        System.out.println("Costo de envio en MX compra pequena por tierra: " + order.getCostoEnvio());

        order.setEnvio(airShipping);
        System.out.println("Costo de envio en MX compra pequena por aire: " + order.getCostoEnvio());

        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);
        System.out.println("Costo de envio en MX compra grande por aire: " + order.getCostoEnvio());

        order.setEnvio(groundShipping);
        System.out.println("Costo de envio en MX compra grande por tierra: " + order.getCostoEnvio());

        order.setEnvio(seaShipping);
        System.out.println("Costo de envio en MX compra grande por mar: " + order.getCostoEnvio());

	}

}
