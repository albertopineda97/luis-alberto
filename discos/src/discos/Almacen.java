package discos;

import java.util.Set;
import java.util.TreeSet;

public class Almacen {

	Set<disco> lista = new TreeSet<>();

	public void AñadirDisco(disco disc) {
		lista.add(disc);
	}

	public void EliminarDisco(disco disc) {
		if (lista.contains(disc)) {
			lista.remove(disc);
		}
	}

	public void MostrarDiscos() {//// ordenado por titulo//
		for (disco disco : lista) {
			System.out.println(disco);
		}
	}

	public void DiscoOrdenadoNombreArtista() {
		ComparadorNombreArtista comparador = new ComparadorNombreArtista();
		Set<disco> ListaTemporal = new TreeSet<>(comparador);
		for (disco disco : lista) {
			ListaTemporal.add(disco);
		}
		for (disco disco : ListaTemporal) {
			System.out.println(disco);
		}
	}

	public void DiscoOrdenadoSello() {
		ComparadorSello comparador = new ComparadorSello();
		Set<disco> ListaTemporal = new TreeSet<>(comparador);
		for (disco disco : lista) {
			ListaTemporal.add(disco);
		}
		for (disco disco : ListaTemporal) {
			System.out.println(disco);
		}
	}

	public void DiscoOrdenadoEstiloMusica() {
		ComparadorEstiloMusica comparador = new ComparadorEstiloMusica();
		Set<disco> ListaTemporal = new TreeSet<>(comparador);
		for (disco disco : lista) {
			ListaTemporal.add(disco);
		}
		for (disco disco : ListaTemporal) {
			System.out.println(disco);
		}
	}

	public void DiscoOrdenadoFecha() {
		ComparadorFechas comparador = new ComparadorFechas();
		Set<disco> ListaTemporal = new TreeSet<>(comparador);
		for (disco disco : lista) {
			ListaTemporal.add(disco);
		}
		for (disco disco : ListaTemporal) {
			System.out.println(disco);
		}
	}

	public void DiscoOrdenadoPrecio() {
		ComparadorPrecio comparador = new ComparadorPrecio();
		Set<disco> ListaTemporal = new TreeSet<>(comparador);
		for (disco disco : lista) {
			ListaTemporal.add(disco);
		}
		for (disco disco : ListaTemporal) {
			System.out.println(disco);
		}
	}

	public void DiscoOrdenadoFormato() {
		comparadorFormato comparador = new comparadorFormato();
		Set<disco> ListaTemporal = new TreeSet<>(comparador);
		for (disco disco : lista) {
			ListaTemporal.add(disco);
		}
		for (disco disco : ListaTemporal) {
			System.out.println(disco);
		}
	}
}
