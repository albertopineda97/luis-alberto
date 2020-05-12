package discos;

public class disco implements Comparable<disco> {
	public String NombreArtista, TituloDisco, Sello, EstiloMusica, Calidad, Formato;
	public int Precio;
	public String Fecha;

	public disco() {

	}

	public disco(String NA, String T, String S, String EM, String C, String Fo, int P, String F) {
		NombreArtista = NA;
		TituloDisco = T;
		Sello = S;
		EstiloMusica = EM;
		Calidad = C;
		Formato = Fo;
		Precio = P;
		Fecha = F;
	}

	@Override
	public String toString() {
		return "Nombre artista : " + NombreArtista + ", titulo disco : " + TituloDisco + ", Sello: " + Sello
				+ ", estilo musica:" + EstiloMusica + ", calidad: " + Calidad + ", formato: " + Formato + ", precio: "
				+ Precio + ", fecha: " + Fecha ;
	}

	public String getNombreArtista() {
		return NombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		NombreArtista = nombreArtista;
	}

	public String getFormato() {
		return Formato;
	}

	public void setFormato(String formato) {
		Formato = formato;
	}

	public String getTituloDisco() {
		return TituloDisco;
	}

	public void setTituloDisco(String tituloDisco) {
		TituloDisco = tituloDisco;
	}

	public String getSello() {
		return Sello;
	}

	public void setSello(String sello) {
		Sello = sello;
	}

	public String getEstiloMusica() {
		return EstiloMusica;
	}

	public void setEstiloMusica(String estiloMusica) {
		EstiloMusica = estiloMusica;
	}

	public String getCalidad() {
		return Calidad;
	}

	public void setCalidad(String calidad) {
		Calidad = calidad;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	@Override
	public int compareTo(disco arg0) {/// busqueda predeterminada (por titulo del disco)///
		// TODO Auto-generated method stub
		return this.getTituloDisco().compareTo(arg0.getTituloDisco());
	}

}
