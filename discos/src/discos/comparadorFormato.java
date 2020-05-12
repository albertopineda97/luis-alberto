package discos;

import java.util.Comparator;

public class comparadorFormato implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getCalidad().compareTo(disco2.getCalidad());

	}
}
