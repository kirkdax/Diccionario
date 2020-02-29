package pokemon;

public class Ataque {
	
	/*
	 * Clase Ataque. caracteristicas:
		String nombre
		String tipo			--> lucha, normal, etc
		String categoria;	--> rapido o cargado
		int energia
		int potencia
		* para lanzar un ataque cargado, hay que tener energia suficiente.
		* un ataque rapido genera la energia para lanzar un ataque cargado.

	 */
	
	String nombre;
	TipoPokemon tipo;
	CategAtaque categoria;
	int energia;
	int potencia;
	
	public Ataque(String nombre, TipoPokemon tipo, CategAtaque categoria, int energia, int potencia) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;				// normal, lucha, electrico, etc.
		this.categoria = categoria;		// rapido o cargado
		this.energia = energia;
		this.potencia = potencia;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

//	@Override
//	public String toString() {
//		return "Ataque [nombre=" + nombre + ", tipo=" + tipo + ", categoria=" + categoria + ", energia=" + energia
//				+ ", potencia=" + potencia + "]";
//	}
	
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", energia=" + energia
				+ ", potencia=" + potencia + "]";
	}
	
	
	
	
}
