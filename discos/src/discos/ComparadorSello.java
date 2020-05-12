package discos;

import java.util.Comparator;

public class ComparadorSello implements Comparator<disco> {
	public int compare(disco disco1, disco disco2) {
		return disco1.getSello().compareTo(disco2.getSello());

	}
}
