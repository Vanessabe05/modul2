package encapsulamientoimpuestos;


public class TestOrder {

	public static void main(String[] args) {
		
		Item item = new Item(1, 5, 1);
		//generamos la clase que calcula el impuesto
		TexCalculator calculaImpuesto = new TexCalculator("MX");
		
		Order order = new Order("MX");
		//calculamos el total de la orden con objeto impuesto
		Order2 order2 = new Order2(calculaImpuesto);
		
		order.addItem(item);
		order2.addItem(item);
		
		
	System.out.println("Total en MX :" + order.getTotal());
	System.out.println("Total en MX :" + order2.getTotal());

	
		

	}

}
