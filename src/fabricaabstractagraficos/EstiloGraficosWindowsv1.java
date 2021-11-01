package fabricaabstractagraficos;

public class EstiloGraficosWindowsv1 implements EstiloGraficos {

	@Override
	public Button crearBotton() {
		// TODO Auto-generated method stub
		return new ButtonWindowsv1();
	}

	@Override
	public CajaTexto crearCajaTexto() {
		// TODO Auto-generated method stub
		return new CajaTextoWindowsv1();
	}

	@Override
	public CheckBox crearCheckBox() {
		// TODO Auto-generated method stub
		return  new CheckBoxWindowsv1();
	}

}
