package discos;

import java.util.Comparator;

public class ComparadorNombreArtista implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getNombreArtista().compareTo(disco2.getNombreArtista());

	}

}
