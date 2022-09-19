package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class Agenda<T> {

	private List<T> agenda;

	public Agenda() {
		this.agenda = new ArrayList<>();
	}

	public void añadir(T o) {
		agenda.add(o);
	}
}