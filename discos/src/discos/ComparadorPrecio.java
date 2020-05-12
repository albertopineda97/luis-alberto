package discos;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getPrecio() - disco2.getPrecio();

	}
}
