package n2exercici1;

import java.util.Scanner;

public class Main {

	private static int opcion;
	private static String numTelefono;
	private static String destinatario;
	private static String calle;
	private static String codigoPostal;
	private static String pais;
	private static Scanner entrada = new Scanner(System.in);
	private static FabricaAbstracta fabrica;
	private static Agenda<Object> agenda = new Agenda<Object>();
	private static Telefonos telefonoCreado;
	private static Direcciones direccionCreada;
	private static String fabricaCrear;
	private static String salidaPantalla;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {
			System.out.println(
					"Indica que quiere hacer :\n" + "1.Añadir telefono.\n" + "2.Añadir direccion.\n" + "0.Salir.");
			opcion = entrada.nextInt();
			entrada.nextLine();
			switch (opcion) {
			case 1:
				añadirTelefono();
				break;
			case 2:
				añadirDireccion();
				break;
			case 0:
				salidaPantalla = "Bye,bye.";
				break;
			default:
				salidaPantalla = "Opcion incorrecta.";
				break;
			}
			System.out.println(salidaPantalla);
		} while (opcion != 0);
	}

	public static void añadirTelefono() {
		System.out.println("Introduzca el numero de telefono :");
		numTelefono = entrada.nextLine();
		fabricaCrear = "Telefono";
		fabrica = Fabrica.crearFabrica(fabricaCrear);
		telefonoCreado = fabrica.crearTelefono(numTelefono);
		if (telefonoCreado == null) {
			salidaPantalla = "El numero no coincide con ningun pais registrado.";
		} else {
			agenda.añadir(telefonoCreado);
			salidaPantalla = "Telefono añadido correctamente.";
		}
	}

	public static void añadirDireccion() {
		System.out.println("Introduzca destinatario :");
		destinatario = entrada.nextLine();
		System.out.println("Introduzca calle/avenida/via :");
		calle = entrada.nextLine();
		System.out.println("Introduzca codigo postal :");
		codigoPostal = entrada.nextLine();
		System.out.println("Introduzca pais :");
		pais = entrada.nextLine();
		fabricaCrear = "Direccion";
		fabrica = Fabrica.crearFabrica(fabricaCrear);
		direccionCreada = fabrica.crearDireccion(destinatario, calle, codigoPostal, pais);
		if (direccionCreada == null) {
			salidaPantalla = "La direccion no coincide con ningun pais registrado.";
		} else {
			agenda.añadir(direccionCreada);
			salidaPantalla = "Direccio añadida correctamente.";
		}
	}
}