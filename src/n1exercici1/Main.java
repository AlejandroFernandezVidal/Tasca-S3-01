package n1exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		String comando;
		Scanner entrada = new Scanner(System.in);
		Undo instancia = Undo.getInstancia();

		do {
			System.out.println("Indica que quiere hacer.\n" 
					+ "1. Añadir comando.\n" 
					+ "2. Eliminar comando.\n"
					+ "3. Listar comandos.\n"
					+ "0. Salir.");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el comando que desea guardar :");
				comando = entrada.next();
				instancia.añadirComando(comando);
				break;
			case 2:
				System.out.println("Introduce el comando que desea eliminar :");
				comando = entrada.next();
				instancia.eliminarComando(comando);
				break;
			case 3:
				instancia.listarComandos();
				break;
			case 0:
				System.out.println("Bye bye");
				break;
			default:
				System.out.println("La opción no es correcta.");
				break;
			}
		} while (opcion != 0);
		entrada.close();
	}
}