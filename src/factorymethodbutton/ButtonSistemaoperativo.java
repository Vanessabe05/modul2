package factorymethodbutton;

public abstract class ButtonSistemaoperativo {
	public void imprimeButton() {
		Button button = creaButton();
		System.out.println("Imprimiendo el Button."); ////
		button.diseño();
	}

	public abstract Button creaButton();
}
