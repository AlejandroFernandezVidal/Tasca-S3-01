package n2exercici1;

public abstract interface FabricaAbstracta {

	public Telefonos crearTelefono(String numTelefono);

	public Direcciones crearDireccion(String destinatario, String calle, String codigoPostal, String pais);

}