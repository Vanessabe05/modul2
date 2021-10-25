package orderencapclase;
import java.util.ArrayList;

public class Order2 {

	private ArrayList<Item> items = new ArrayList<>();
	private TexCalculator impuesto;

	public Order2(TexCalculator impuesto) {
		this.impuesto = impuesto;
	}

	public double getTotal() {
		double total = 0;

		for (Item item : items) {
			total += item.getPrice() * item.getQuantity();
		}
		
		total += total * this.impuesto.obtenerImpuesto();
		return total;
	}

	

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public TexCalculator getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(TexCalculator impuesto) {
		this.impuesto = impuesto;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	
}
