package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

	private static Undo instancia;
	private List<String> comandos;

	private Undo() {
		this.comandos = new ArrayList<>();
	}

	public static Undo getInstancia() {
		if (instancia == null) {
			return instancia = new Undo();
		}
		return instancia;
	}

	public void añadirComando(String comando) {
		comandos.add(comando);
		System.out.println("Comando añadido correctamente.");
	}

	public void eliminarComando(String comando) {
		boolean condicion = false;
		int i = 0;

		while (condicion == false && i < comandos.size()) {
			if (comando.equalsIgnoreCase(comandos.get(i))) {
				condicion = true;
				comandos.remove(i);
				System.out.println("Comando eliminado correctamente.");
			}
			i++;
		}
		if (condicion == false) {
			System.out.println("El comando indicado no existe.");
		}
	}

	public void listarComandos() {
		if (comandos.size() <= 0) {
			System.out.println("Listado sin datos.");
		} else {
			for (String comando : comandos) {
				System.out.println(comando);
			}
		}
	}
}