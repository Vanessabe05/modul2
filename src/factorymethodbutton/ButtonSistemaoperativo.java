package factorymethodbutton;

public abstract class ButtonSistemaoperativo {
	public void imprimeButton() {
		Button button = creaButton();
		System.out.println("Imprimiendo el Button."); ////
		button.dise�o();
	}

	public abstract Button creaButton();
}
