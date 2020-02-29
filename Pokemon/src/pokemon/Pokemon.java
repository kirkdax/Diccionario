package pokemon;

import java.util.Scanner;

public class Pokemon {

	/*
	 * Clase pokemon. 
			
		caracteristicas:
			int numPokedex
			String nombre
			String tipo (enum)? --> agua, fuego, etc.
			int nivel
			int vida
			Ataque ataqueRapido
			Ataque ataqueCargado
		metodos:

	 */
	private final static int MAX_VIDA = 100;
	private final static int MIN_VIDA = 0;

	int numPokedex;
//	String nombre;
	PokNombre nombre;
	TipoPokemon tipo;
	int nivel;
	int vida;
	int energia;
	Ataque ataqueRapido;
	Ataque ataqueCargado;
	
	public Pokemon(int numPokedex, PokNombre nombre, TipoPokemon tipo, int nivel, Ataque ataqueRapido, Ataque ataqueCargado) {
		super();
		this.numPokedex = numPokedex;
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = nivel;
		this.vida = MAX_VIDA;
		this.energia = 0;
		this.ataqueRapido = ataqueRapido;
		this.ataqueCargado = ataqueCargado;
	}
	
	public Pokemon(int numPokedex, PokNombre nombre, TipoPokemon tipo) {
		super();
		this.numPokedex = numPokedex;
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = 5;
		this.vida = MAX_VIDA;
		this.energia = 0;
	}


	public int getNumPokedex() {
		return numPokedex;
	}

	private void setNumPokedex(int numPokedex) {
		this.numPokedex = numPokedex;
	}

	public PokNombre getNombre() {
		return nombre;
	}

	private void setNombre(PokNombre nombre) {
		this.nombre = nombre;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	private void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	private void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	void setVida(int vida) {
		this.vida = vida;
	}

	public int getEnergia() {
		return energia;
	}

	private void setEnergia(int energia) {
		this.energia = energia;
	}

	public Ataque getAtaqueRapido() {
		return ataqueRapido;
	}

	private void setAtaqueRapido(Ataque ataqueRapido) {
		this.ataqueRapido = ataqueRapido;
	}

	public Ataque getAtaqueCargado() {
		return ataqueCargado;
	}

	private void setAtaqueCargado(Ataque ataqueCargado) {
		this.ataqueCargado = ataqueCargado;
	}

	public static int getMaxVida() {
		return MAX_VIDA;
	}

	public static int getMinVida() {
		return MIN_VIDA;
	}

	@Override
	public String toString() {
		return "Pokemon [numPokedex=" + numPokedex + ", nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel
				+ ", vida=" + vida + ", energia=" + energia + ", ataqueRapido=" + ataqueRapido + ", ataqueCargado="
				+ ataqueCargado + "]";
	}
	
	
	

	
}
