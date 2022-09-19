package n2exercici1;

public class DireccionesReinoUnido implements Direcciones {
	private String destinatario;
	private String calle;
	private String codigoPostal;
	private String pais;

	public DireccionesReinoUnido(String destinatario, String calle, String codigoPostal, String pais) {
		this.destinatario = destinatario;
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}
}