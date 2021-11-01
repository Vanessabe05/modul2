package fabricaabstractagraficos;

public class EstiloGraficosLinuxv1 implements EstiloGraficos {

	@Override
	public Button crearBotton() {
		// TODO Auto-generated method stub
		return new ButtonLinuxv1();
	}

	@Override
	public CajaTexto crearCajaTexto() {
		// TODO Auto-generated method stub
		return new CajaTextoLinuxv1();
	}

	@Override
	public CheckBox crearCheckBox() {
		// TODO Auto-generated method stub
		return new CheckBoxLinuxv1();
	}

}
