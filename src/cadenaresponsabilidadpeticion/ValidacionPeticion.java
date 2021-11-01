package cadenaresponsabilidadpeticion;

public interface ValidacionPeticion {
	void setNext(ValidacionPeticion validacionPeticion);

	void validacion(HelpDeskRequest helpDeskRequest);
}
