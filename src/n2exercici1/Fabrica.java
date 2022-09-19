package n2exercici1;

public class Fabrica {

	public static FabricaAbstracta crearFabrica(String fabricaCrear) {
		if (fabricaCrear.equalsIgnoreCase("Telefono")) {
			return new FabricaTelefonos();
		} else if (fabricaCrear.equalsIgnoreCase("Direccion")) {
			return new FabricaDirecciones();
		}
		return null;
	}
}