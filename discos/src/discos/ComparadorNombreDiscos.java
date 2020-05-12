package discos;

import java.util.Comparator;

public class ComparadorNombreDiscos implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getTituloDisco().compareTo(disco2.getTituloDisco());

	}
}
