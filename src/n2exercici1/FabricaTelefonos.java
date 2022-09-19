package n2exercici1;

public class FabricaTelefonos implements FabricaAbstracta {

	@Override
	public Telefonos crearTelefono(String numTelefono) {
		if (numTelefono.startsWith("+34")) {
			return new TelefonosEspaña(numTelefono);
		} else if (numTelefono.startsWith("+33")) {
			return new TelefonosFrancia(numTelefono);
		} else if (numTelefono.startsWith("+44")) {
			return new TelefonosReinoUnido(numTelefono);
		}
		return null;
	}

	@Override
	public Direcciones crearDireccion(String destinatario, String calle, String codigoPostal, String pais) {
		return null;
	}
}