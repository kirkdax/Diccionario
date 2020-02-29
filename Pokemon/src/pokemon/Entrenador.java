package pokemon;

import java.util.Arrays;
import java.util.Scanner;


public class Entrenador {

	/*
	 * Clase Entrenador. 

		caracteristicas:
			String nombre
			array Pokemons
			array Objetos
		metodos:
			UTILIZAR OBJETOS
			curarPokemon(Objeto pocion, Pokemon p)
			cambiarAtaqueRapidoPokemon(Objeto MTrapido, Pokemon p)
			cambiarAtaqueCargadoPokemon(Objeto MTcargado, Pokemon p)
			darCarameloPokemon(Objeto cmRaro, Pokemon p)
		
			COMBATES
			luchar(Pokemon p, Ataque a)
	 */
	
	private final static int MAX_POKEMONS = 10;
	private final static int MAX_POKEMONS_COMBATE = 3;
	private final static int MAX_OBJETOS = 50;
	private final static int MAX_ENTRENADORES = 50;
	
	
	private String nombre;
	
	private static Pokemon pokemons[];	// array pokemons
	private static int numPokemons = 0;
	
	private Objeto objs[];		// array Objetos
	private static int numObjetos = 0;
	
//	Entrenador entrenadores[];
//	public static int numEntrenadores = 0;
	
	
	public Entrenador(String nombre) {
		super();
		this.nombre = nombre;
		pokemons = new Pokemon[MAX_POKEMONS];
		this.objs = new Objeto[MAX_OBJETOS];
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}

	public static int getMaxPokemons() {
		return MAX_POKEMONS;
	}

	public static int getMaxPokemonsCombate() {
		return MAX_POKEMONS_COMBATE;
	}
	
	
	public void combatir(Pokemon propio, Ataque a, Pokemon objetivo) throws Exception {
			
		// Si el ataque introducido es un ataque válido (rapido o cargado) ...
		if (a == propio.ataqueRapido || a == propio.ataqueCargado) {
			
			//si el ataque rapido es válido ...
			if (propio.ataqueRapido == a) {
				
				// restamos tanta vida al objetivo, como potencia tiene el ataque
				objetivo.vida = objetivo.vida - a.potencia;		
				
				// sumamos tanta energia al pokemon atacante, como energia produce el ataque
				propio.energia = propio.energia + a.energia;
			} 
			
			
			//si el ataque cargado es válido ...
			if (propio.ataqueCargado == a) {
				//... y si el nivel de energia es suficiente
				if (propio.energia >= a.energia) {
					// restamos tanta vida al objetivo, como potencia tiene el ataque
					objetivo.vida = objetivo.vida - a.potencia;		

					// restamos tanta energia al pokemon atacante, como energia necesita el ataque
					propio.energia = propio.energia - a.energia;
				} else {
					throw new Exception("No se puede lanzar el ataque cargado");
				}
			}			
			
		} else {
			throw new Exception("Ataque no válido");
		}
		
		
	}

	//---------------------------------------------------------------------------------------------------------------------
	
	public static void old_asignarPokemonEntrenador(String nombreEntrenador) throws Exception {
		
		if (LigaEntrenadores.entrenadorExiste(nombreEntrenador) == true) {
			int numPokedex = leerEntero("Introduce el número de la pokedex correspondiente al pokemon");
			int nombrePok = leerEntero("Selecciona Pokemon: 0(Bulbasaur), 1(Charmander), 2(Squirtle), 3(Snorlax), 4(Machop), 5(Pikachu)");
			int tipo = leerEntero("Tipo del pokemon: 0(ELECTRICO), 1(FUEGO), 2(AGUA), 3(NORMAL), 4(PLANTA), 5(LUCHA)");
					
			pokemons[numPokemons] = new Pokemon(numPokedex, PokNombre.values()[nombrePok], TipoPokemon.values()[tipo]);
			numPokemons++;
		} else {
			throw new Exception("El entrenador introducido no existe");
		}
		
	}
	
	public static void asignarPokemonEntrenador() throws Exception {
		
		String nombreEntrenador = leerString("Introduce el nombre del entrenador para asignarle el pokemon:");
		
		if (LigaEntrenadores.entrenadorExiste(nombreEntrenador) == true) {
			
			int numPokedex = leerEntero("Introduce el número de la pokedex correspondiente al pokemon");
			
			if (LigaEntrenadores.pokemonExiste(numPokedex)) {
//				int nombrePok = leerEntero("Selecciona Pokemon: 0(Bulbasaur), 1(Charmander), 2(Squirtle), 3(Snorlax), 4(Machop), 5(Pikachu)");
//				int tipo = leerEntero("Tipo del pokemon: 0(ELECTRICO), 1(FUEGO), 2(AGUA), 3(NORMAL), 4(PLANTA), 5(LUCHA)");
				
				//int nombrePok = LigaEntrenadores.pokedex.		// coger nombrePok del array "pokedex", de listaEntrenadores
				//int tipo = leerEntero("Tipo del pokemon: 0(ELECTRICO), 1(FUEGO), 2(AGUA), 3(NORMAL), 4(PLANTA), 5(LUCHA)");	// coger tipo del array "pokedex", de listaEntrenadores
				
				pokemons[numPokemons] = new Pokemon(numPokedex, PokNombre.values()[nombrePok], TipoPokemon.values()[tipo]);
				numPokemons++;
			} else {
				throw new Exception("El pokemon introducido no existe");
			}
			
		} else {
			throw new Exception("El entrenador introducido no existe");
		}
		
	}
	
	public static void mostrarPokemonsEntrenador() throws Exception {
		
		String nombreEntrenador = leerString("Introduce el nombre del entrenador para mostrar sus pokemons:");
		
		if (LigaEntrenadores.entrenadorExiste(nombreEntrenador) == true) {
			
			for (int i = 0; i < numPokemons; i++) {
				System.out.println(pokemons[i]);
			}
		} else {
			throw new Exception("El entrenador introducido no existe");
		}
		
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------
	
	public void agregarObjeto(Objeto o) {
		objs[numObjetos] = o;
		numObjetos++;
	}
	

	
//	public void old_agregarEntrenador(Entrenador e) {
//		entrenadores[numEntrenadores] = e;
//		numEntrenadores++;
//	}
	
//	public void agregarEntrenador() {
//		
//		String nombre = leerString("Introduce el nombre del entrenador:");
//		
//		entrenadores[numEntrenadores] = new Entrenador(nombre);
//		numEntrenadores++;
//	}


	/*
	 * 	String nombre = leerString("Introduce el nombre del mago:");
		int raza = leerEntero("Introduce la raza del mago: 0(HUMANO), 1(ELFO), 2(ENANO), 3(ORCO):");
		int fuerza = leerEntero("Introduce el valor de fuerza del mago (MIN=0 | MAX=15):");
		int inteligencia = leerEntero("Introduce el valor de inteligencia del mago (MIN=17 | MAX=20):");
		
		personajes[numPersonajes] = new Mago(nombre, Raza.values()[raza], fuerza, inteligencia);
		numPersonajes++;		
	 */
	
	
	
	static Scanner teclado = new Scanner(System.in);

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


	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + "]";
	}
	
	
	
	

	
}
