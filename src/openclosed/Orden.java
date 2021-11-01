package openclosed;

import java.util.ArrayList;

public class Orden {
	private ArrayList<Item> items = new ArrayList<>();

	private Envio envio;
	private TexCalculator impuesto;

	public Orden(TexCalculator impuesto, Envio envio) {
		this.impuesto = impuesto;
		this.envio = envio;
	}

	public double getTotal() {
		double total = 0;

		for (Item item : items) {
			total += item.getPrice() * item.getQuantity();
		}

		total += total * impuesto.obtenerImpuesto();

		return total;
	}

	public double getTotalWeight() {
		double weight = 0;

		for (Item item : items) {
			weight += item.getWeight();
		}

		return weight;
	}

	public double getCostoEnvio() {
		return envio.calculaCosto(this);
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public Envio getEnvio() {
		return envio;
	}

	public void setEnvio(Envio envio) {
		this.envio = envio;
	}

	public TexCalculator getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(TexCalculator impuesto) {
		this.impuesto = impuesto;
	}

}
