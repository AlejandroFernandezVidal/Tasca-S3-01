package n2exercici1;

public class FabricaDirecciones implements FabricaAbstracta {

	@Override
	public Direcciones crearDireccion(String destinatario, String calle, String codigoPostal, String pais) {
		if (pais.equalsIgnoreCase("ESPAÑA")) {
			return new DireccionesEspaña(destinatario,calle,codigoPostal,pais);
		} else if (pais.equalsIgnoreCase("FRANCIA")) {
			return new DireccionesFrancia(destinatario,calle,codigoPostal,pais);
		} else if (pais.equalsIgnoreCase("REINO UNIDO")) {
			return new DireccionesReinoUnido(destinatario,calle,codigoPostal,pais);
		}
		return null;
	}

	@Override
	public Telefonos crearTelefono(String numTelefono) {
		return null;
	}
}