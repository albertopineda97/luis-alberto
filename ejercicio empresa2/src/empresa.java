
public class empresa {
	private String NombreEmpresa, CIF, Localidad;
	private empleado empleados[];
	//constructores//
	public empresa(){
		
	}
	public empresa(String NE, String C, String Lo) {
		setNombreEmpresa(NE);
		setCIF(C);
		setLocalidad(Lo);
		setEmpleados(new empleado [2]);
	}
	//metodos//
	public void Mostrar() {
		System.out.println("Nombre de la empresa: "+ NombreEmpresa);
		System.out.println("CIF: "+ CIF);
		System.out.println("Localidad: "+ Localidad);
		MostrarS(empleados);
	}
	public static void MostrarS(empleado empleados[]) {
		for (int i=0;i<empleados.length;i++){
			System.out.println(empleados[i].toString());
		}
	
}
	//seet-get//
	public String getNombreEmpresa() {
		return NombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	public empleado[] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(empleado empleados[]) {
		this.empleados = empleados;
	}
}
