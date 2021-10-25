package abstracciongato;

import java.util.Date;

public class Pollo implements Food {

	private double nutrition;
	private Date expiration;

	public Pollo(double nutrition, Date expiration) {
		this.nutrition = nutrition;
		this.expiration = expiration;
	}

	@Override
	// implemntamos el getNutrition
	public double getNutrition() {

		return nutrition;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public void setNutrition(double nutrition) {
		this.nutrition = nutrition;
	}

}
