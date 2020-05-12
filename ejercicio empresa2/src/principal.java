
public class principal {

	public static void main(String[] args) {
		//objetos creados//
		empleado sara = new empleado ("sara", "123456F", "Valdivia");
		empleado luz= new empleado ("luz", "123456A", "Coronada");
		empleado alex = new empleado ("alex", "456789S", "Torviscal");
		empleado rocio = new empleado ("rocio", "456178T","Don Benito");
		empresa ferga = new empresa ("ferga", "741852", "Almendralejo");
		empresa perez = new empresa ("perez", "798523", "La Haba");
		empleado empleadosFerga[] = {sara,luz};
		empleado empleadosPerez[] = {alex, rocio};
		//con set ASIGNAMOS los arrays con los empleados a las empresa, de tal forma que si la empresa//
		//desaparece los empleados tambien//
		ferga.setEmpleados(empleadosFerga);
		perez.setEmpleados(empleadosPerez);
		ferga.Mostrar();

	}
//prueba de cambio git
}
