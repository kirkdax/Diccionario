package pokemon;

public class ObjCurar extends Objeto {

	/*
	 * Aclarar cómo utilizar cada objeto.
	 * Solo debe poder utilizarse si el entrenador tiene este objeto.
	 */
	
	private static final int PS_POCION = 25;
	private static final int PS_SUPERPOCION = 50;
	private static final int PS_HIPERPOCION = 75;
	private static final int PS_MAXPOCION = 100;
	private static final int PS_REVIVIR = 50;
	private static final int PS_MAXREVIVIR = 100;
	private static final int MIN_VIDA = 0;
	private static final int MAX_VIDA = 100;

	
	public ObjCurar(ObjNombre nombre) {
		super(nombre);
		ObjFuncion funcion = ObjFuncion.SALUD;
	}

	public void usarPocion(Pokemon p) throws Exception {
		if (p.getVida() > MIN_VIDA && p.getVida() < MAX_VIDA) {
			p.setVida(p.getVida() + PS_POCION);
		} else {
			throw new Exception("No es posible utilizar este objeto: " + this.getNombre());
		}
	}
	
	public void usarSuperpocion(Pokemon p) throws Exception {
		if (p.getVida() > MIN_VIDA && p.getVida() < MAX_VIDA) {
			p.setVida(p.getVida() + PS_SUPERPOCION);
		} else {
			throw new Exception("No es posible utilizar este objeto: " + this.getNombre());
		}
	}

	public void usarHiperpocion(Pokemon p) throws Exception {
		if (p.getVida() > MIN_VIDA && p.getVida() < MAX_VIDA) {
			p.setVida(p.getVida() + PS_HIPERPOCION);
		} else {
			throw new Exception("No es posible utilizar este objeto: " + this.getNombre());
		}
	}
	
	public void usarMaxpocion(Pokemon p) throws Exception {
		if (p.getVida() > MIN_VIDA && p.getVida() < MAX_VIDA) {
			p.setVida(p.getVida() + PS_MAXPOCION);
		} else {
			throw new Exception("No es posible utilizar este objeto: " + this.getNombre());
		}
	}
	
	public void usarRevivir(Pokemon p) throws Exception {
		if (p.getVida() == MIN_VIDA) {
			p.setVida(PS_REVIVIR);
		} else {
			throw new Exception("No es posible utilizar este objeto: " + this.getNombre());
		}
	}

	public void usarMaxrevivir(Pokemon p) throws Exception {
		if (p.getVida() == MIN_VIDA) {
			p.setVida(PS_MAXREVIVIR);
		} else {
			throw new Exception("No es posible utilizar este objeto: " + this.getNombre());
		}
	}
	
}
