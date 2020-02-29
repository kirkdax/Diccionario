package main;


import java.util.Scanner;
import pokemon.*;


public class Main {

	private static Scanner teclado = new Scanner(System.in);
	private static LigaEntrenadores liga = new LigaEntrenadores();

	
	public static void main(String[] args) throws Exception {
		
		int menu = 0;

		
		while (menu != 11) {
			System.out.println("Elige una opción: ");
			System.out.println("1. Registrar un entrenador en la liga.");
			System.out.println("2. Registrar un pokemon en la liga.");
			System.out.println("3. Registrar un ataque para Pokemons de la liga.");
			System.out.println("4. Mostrar listado de entrenadores de la liga.");
			System.out.println("5. Mostrar listado de pokemons de la liga.");
			System.out.println("6. Mostrar listado de ataques de la liga.");
			System.out.println("7. Asignar un ataque a un pokemon de la liga.");
			System.out.println("8. Asignar un pokemon a un entrenador de la liga.");
			System.out.println("9. Mostrar listado de pokemons de un entrenador.");
			System.out.println("10. Mostrar listado de objetos de un entrenador.");
			System.out.println("11. Salir");
			menu = Integer.parseInt(teclado.nextLine());
			
			String nombreEnt;
			
			switch (menu) {
			case 1:
				liga.registrarEntrenador();
				
				break;
			case 2:
				liga.registrarPokemon();
				
				break;
			case 3:
				System.out.println("Funcionalidad en desarrollo...\n");
				break;
			case 4:
				liga.mostrarEntrenadoresLiga();
				
				break;
			case 5:
				liga.mostrarPokemonsLiga();
				break;
			case 6:
				System.out.println("Funcionalidad en desarrollo...\n");
				break;
			case 7:
				System.out.println("Funcionalidad en desarrollo...\n");
				break;
			case 8:
//				System.out.println("Introduce el nombre del entrenador para asignarle un pokemon:");
//				nombreEnt = teclado.nextLine();
//				Entrenador.asignarPokemonEntrenador(nombreEnt);
				
				Entrenador.asignarPokemonEntrenador();
				break;
			case 9:
//				System.out.println("Introduce el nombre del entrenador para mostrar sus pokemons:");
//				nombreEnt = teclado.nextLine();
//				Entrenador.mostrarPokemonsEntrenador(nombreEnt);
				
				Entrenador.mostrarPokemonsEntrenador();
				break;
			case 10:
				System.out.println("Funcionalidad en desarrollo...\n");
				break;
			case 11:
				System.out.println("\nHasta luego!\n");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
			
		}
		

		


		/*
		
		//ataques de tipo fuego
		Ataque ascuas = new Ataque("ascuas", TipoPokemon.FUEGO, CategAtaque.RAPIDO, 15, 5);
		Ataque llamarada = new Ataque("llamarada", TipoPokemon.FUEGO, CategAtaque.CARGADO, 60, 70);
		
		//ataques de tipo normal
		Ataque placaje = new Ataque("placaje", TipoPokemon.NORMAL, CategAtaque.RAPIDO, 10, 5);
		Ataque golpeCuerpo = new Ataque("golpeCuerpo", TipoPokemon.NORMAL, CategAtaque.CARGADO, 50, 30);

		//ataques de tipo eléctrico
		Ataque impactrueno = new Ataque("impactrueno", TipoPokemon.ELECTRICO, CategAtaque.RAPIDO, 10, 15);
		Ataque rayo = new Ataque("rayo", TipoPokemon.ELECTRICO, CategAtaque.CARGADO, 40, 40);

		
		//Entrenadores
		Entrenador ash = new Entrenador("ash");
		Entrenador gary = new Entrenador("gary");

		
		//pokemons de ash
		Pokemon charme_ash = new Pokemon(5, PokNombre.Charmander, TipoPokemon.FUEGO, 20, ascuas, llamarada);
		Pokemon snor_ash = new Pokemon(143, PokNombre.Snorlax, TipoPokemon.NORMAL, 20, placaje, golpeCuerpo);
		Pokemon pika_ash = new Pokemon(25, PokNombre.Pikachu, TipoPokemon.ELECTRICO, 20, impactrueno, rayo);

		
		//pokemons de gary
		Pokemon charme_gary = new Pokemon(5, PokNombre.Charmander, TipoPokemon.FUEGO, 20, ascuas, llamarada);
		Pokemon snor_gary = new Pokemon(143, PokNombre.Snorlax, TipoPokemon.NORMAL, 20, placaje, golpeCuerpo);
		Pokemon pika_gary = new Pokemon(25, PokNombre.Pikachu, TipoPokemon.ELECTRICO, 20, impactrueno, rayo);

		
		
//		ash.old_agregarPokemon(charme_ash);
//		ash.old_agregarPokemon(pika_ash);
//		ash.old_agregarPokemon(snor_ash);
//		
//		gary.old_agregarPokemon(charme_gary);
//		gary.old_agregarPokemon(pika_gary);
//		gary.old_agregarPokemon(snor_gary);

		System.out.println("ANTES DEL COMBATE:");
		System.out.println(charme_ash.toString());
		System.out.println(pika_gary.toString());

		System.out.println("\nTRAS PRIMER ATAQUE RAPIDO:");
		ash.combatir(charme_ash, ascuas, pika_gary);
		System.out.println(charme_ash.toString());
		System.out.println(pika_gary.toString());

		System.out.println("\nSe lanza 3 veces el ataque ascuas, generando energia para el ataque cargado:");
		ash.combatir(charme_ash, ascuas, pika_gary);
		ash.combatir(charme_ash, ascuas, pika_gary);
		ash.combatir(charme_ash, ascuas, pika_gary);
		System.out.println(charme_ash.toString());
		System.out.println(pika_gary.toString());

		System.out.println("\nTRAS ATAQUE CARGADO:");
		ash.combatir(charme_ash, llamarada, pika_gary);
		System.out.println(charme_ash.toString());
		System.out.println(pika_gary.toString());
		
		
		System.out.println("\nSe intenta lanzar otro ataque cargado, pero el pokemon no tiene energia suficiente:");
		try {
			ash.combatir(charme_ash, llamarada, pika_gary);
			System.out.println(charme_ash.toString());
			System.out.println(pika_gary.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ObjCurar pocion = new ObjCurar(ObjNombre.POCION);
		pocion.usarPocion(pika_gary);
		
		System.out.println("\nUSADA POCION EN PIKACHU DE GARY:");
		System.out.println(pika_gary.toString());

		
		System.out.println("\nSe intenta lanzar utilizar objeto revivir sobre pikachu, pero el pokemon todavía tiene vida suficiente:");
		try {
			ObjCurar revivir = new ObjCurar(ObjNombre.REVIVIR);
			revivir.usarRevivir(pika_gary);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		*/
		
	}

	

//	static Scanner teclado = new Scanner(System.in);

	private static int leerEntero(String mensaje) {
		int resul;
		
		System.out.println(mensaje);
		resul = Integer.parseInt(teclado.nextLine());
		
		return resul;
	}
	
	private static String leerString(String mensaje) {
		String resul;
		
		System.out.println(mensaje);
		resul = teclado.nextLine();
		
		return resul;
	}

	
}




