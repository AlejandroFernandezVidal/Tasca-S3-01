package n2exercici1;

public class DireccionesEspaña implements Direcciones {
	private String destinatario;
	private String calle; 
	private String codigoPostal;
	private String pais;

	public DireccionesEspaña(String destinatario,String calle,String codigoPostal,String pais) {
		this.destinatario = destinatario;
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}
}