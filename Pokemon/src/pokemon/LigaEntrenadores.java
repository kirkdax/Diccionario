package pokemon;

import java.util.Scanner;

public class LigaEntrenadores {
	
	private static Scanner teclado = new Scanner(System.in);
	private final static int MAX_ENTRENADORES = 50;
	private static final int MAX_POKEMONS = 151;

	private static Entrenador entrenadores[];
	private static int numEntrenadores = 0;

	private static Pokemon pokedex[] = new Pokemon[MAX_POKEMONS];
	private static int numPokemons = 0;

	
	public LigaEntrenadores() {
		super();
		entrenadores = new Entrenador[MAX_ENTRENADORES];
	}

	//---------------------------------------------------------------------------------------------------------------------

	// Metodo para buscar al entrenador por su nombre, si existe devuelve true.
	public static boolean entrenadorExiste(String entrenador) {

		boolean resultado = false;

		for (int i = 0; i < numEntrenadores; i++) {
			if (entrenadores[i].getNombre().equalsIgnoreCase(entrenador)) {
				resultado = true;
			}
		}

		return resultado;
	}

	
	

	public void registrarEntrenador() throws Exception {
		String nombre = leerString("Introduce el nombre del entrenador:");
		
		if (entrenadorExiste(nombre)) {
			throw new Exception("El entrenador ya existe, no se puede registrar");
		} else {
			entrenadores[numEntrenadores] = new Entrenador(nombre);
			numEntrenadores++;
		}
		
	}
	
	public void mostrarEntrenadoresLiga() {
		for (int i = 0; i < numEntrenadores; i++) {
			System.out.println(entrenadores[i]);
		}
	}

	
//	public String buscarEntrenadorLiga(String entrenador) {
//		
//		StringBuilder resultado = new StringBuilder();
//		
//		for (int i = 0; i < numEntrenadores; i++) {
//			
//			if (entrenadores[i].getNombre().equalsIgnoreCase(entrenador)) {
//				resultado.append(entrenadores[i].getNombre());
//			}
//		}
//		
//		return resultado.toString();
//	}
	
	//---------------------------------------------------------------------------------------------------------------------

	// Metodo para buscar al pokemon por su nombre, si existe devuelve true.
	public static boolean pokemonExiste(int numPokedex) {

		boolean resultado = false;

		for (int i = 0; i < numPokemons; i++) {
			if (pokedex[i].getNumPokedex() == numPokedex) {
				resultado = true;
			}
		}

		return resultado;
	}
	
	public void registrarPokemon() throws Exception {
		
		int numPokedex = leerEntero("Introduce el número de la pokedex correspondiente al pokemon");
		int nombrePok = leerEntero("Selecciona Pokemon: 0(Bulbasaur), 1(Charmander), 2(Squirtle), 3(Snorlax), 4(Machop), 5(Pikachu)");
		int tipo = leerEntero("Tipo del pokemon: 0(ELECTRICO), 1(FUEGO), 2(AGUA), 3(NORMAL), 4(PLANTA), 5(LUCHA)");
		
		if (pokemonExiste(numPokedex)) {
			throw new Exception("El pokemon ya existe, no se puede registrar");
		} else {
			pokedex[numPokemons] = new Pokemon(numPokedex, PokNombre.values()[nombrePok], TipoPokemon.values()[tipo]);
			numPokemons++;
		}
	}

	public void mostrarPokemonsLiga() {
		for (int i = 0; i < numPokemons; i++) {
			System.out.println(pokedex[i]);
		}
	}

	
	// ---------------------------------------------------------------------------------------------------------------------------------------

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
