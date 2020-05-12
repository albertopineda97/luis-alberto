package discos;

import java.util.Comparator;

public class ComparadorFechas implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getFecha().compareTo(disco2.getFecha());

	}
}
