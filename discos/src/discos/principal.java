package discos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {
	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	public static void Menu(Almacen almacen) throws NumberFormatException, IOException {/// menu principal (2 opciones:
																						/// sub menu 1, sub menu 2)////
		int opciones;

		do {
			
			System.out.println("1- Insertar Disco");
			System.out.println("2- Mostrar Discos");
			System.out.println("3- Salir");
			opciones = Integer.parseInt(teclado.readLine());
			switch (opciones) {
			case 1:
				InsertarDisco(almacen);/// TERMINADO///
				break;
			case 2:
				EnseñarDiscos(almacen);
				break;
			case 3:
				break;
			default:
				System.out.println("Lo siento, la opcion es incorrecta intentelo de nuevo");
			}
		} while (opciones != 3);
	}

	private static void InsertarDisco(Almacen almacen) throws IOException {//// sub menu de la opcion 1////
		int opciones1;
		do {
			System.out.println("1- Interactio");
			System.out.println("2- Automatico");
			System.out.println("3- salir");
			opciones1 = Integer.parseInt(teclado.readLine());
			switch (opciones1) {
			case 1:
				DiscoInteractivo(almacen);
				break;
			case 2:
				DiscoAutomatico(almacen);
				break;
			case 3:
				break;
			default:
				System.out.println("Lo siento, la opcion es incorrecta intentelo de nuevo");
				;
			}
		} while (opciones1 != 3);
	}

	private static void DiscoInteractivo(Almacen almacen) throws IOException {//// introducir un disco de manera
																				//// interactiva, PERTENECE A SUB MENU
																				//// DE LA OPCION 1//////
		System.out.println("Inserte Nombre del Artista");
		String NombreArtista = teclado.readLine();
		System.out.println("Inserte titulo del disco");
		String TituloDisco = teclado.readLine();
		System.out.println("Inserte Sello discografico");
		String Sello = teclado.readLine();
		System.out.println("Inserte el estilo de musica");
		String EstiloMusica = teclado.readLine();
		System.out.println("Inserte la calidad del disco");
		String Calidad = teclado.readLine();
		System.out.println("Inserte el formato");
		String Formato = teclado.readLine();
		System.out.println("Inserte el precio");
		int Precio = Integer.parseInt(teclado.readLine());
		System.out.println("Inserte la fecha");
		String Fecha = teclado.readLine();
		disco DiscNuevo = new disco(NombreArtista, TituloDisco, Sello, EstiloMusica, Calidad, Formato, Precio, Fecha);
		almacen.AñadirDisco(DiscNuevo);
	}

	private static void DiscoAutomatico(Almacen almacen) {// discos generados atomaticamente, PERTENCE A SUB MENU DE LA
															// OPCION 1//////
		disco disco1 = new disco("rober", "piedras", "martin SA", "Rock", "mp4", "340kp", 20, "2/10/2019");
		disco disco2 = new disco("angela", "natural", "martin SA", "pop", "mp4", "340kp", 12, "2/10/2010");
		System.out.println(disco1);
		System.out.println("---------------------------------------------");
		System.out.println(disco2);
	}

	private static void EnseñarDiscos(Almacen almacen) throws NumberFormatException, IOException {//// tipos de
																									//// ordenamientos,
																									//// PERTENECE AL
																									//// SUB MENU 2/////
		int opciones2;
		do {
			System.out.println("1- Mostrar por orden de artista");
			System.out.println("2- Mostrar por orden de sello");
			System.out.println("3- Mostrar  por estilo de musica");
			System.out.println("4- Mostrar por formato");
			System.out.println("5- Mostrar por  precio");
			System.out.println("6- Mostrar por fecha");
			System.out.println("7- salir");
			
			opciones2 = Integer.parseInt(teclado.readLine());
			switch (opciones2) {//// llamar a los metodos de comparar///
			case 1:
				almacen.DiscoOrdenadoNombreArtista();
				break;
			case 2:
				almacen.DiscoOrdenadoSello();
				break;
			case 3:
				almacen.DiscoOrdenadoEstiloMusica();
				break;
			case 4:
				almacen.DiscoOrdenadoFormato();
				break;
			case 5:
				almacen.DiscoOrdenadoPrecio();
				break;
			case 6:
				almacen.DiscoOrdenadoFecha();
				break;
			case 7:
				break;
			default:
				System.out.println("Lo siento, la opcion es incorrecta intentelo de nuevo");
			}
		} while (opciones2 != 7);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Almacen almacen = new Almacen();
		try{
			Menu(almacen);
		}catch(NumberFormatException excepcion1) {
			System.out.println("Error con el formato de numero");
		}catch(IOException excepcion2) {
			System.out.println("error");
		}
		
	}

}
