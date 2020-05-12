package discos;

import java.util.Comparator;

public class ComparadorEstiloMusica implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getEstiloMusica().compareTo(disco2.getEstiloMusica());

	}
}
