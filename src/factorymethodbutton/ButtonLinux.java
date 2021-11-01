package factorymethodbutton;

public class ButtonLinux extends ButtonSistemaoperativo{

	@Override
	public Button creaButton() {
		// TODO Auto-generated method stub
		return new ButtonArchivosLinux();
	}

}
