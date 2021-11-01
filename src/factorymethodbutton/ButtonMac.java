package factorymethodbutton;

public class ButtonMac extends ButtonSistemaoperativo{

	@Override
	public Button creaButton() {
		// TODO Auto-generated method stub
		return new ButtonArchivosMac();
	}

}
