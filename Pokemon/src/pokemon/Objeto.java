package pokemon;

public abstract class Objeto {

	private ObjNombre nombre;
//	private FuncionObj funcion;
	
	
	
//	public Objetos(String nombre, FuncionObj funcion) {
//		super();
//		this.nombre = nombre;
//		this.funcion = funcion;
//	}
	
	public Objeto(ObjNombre nombre) {
		super();
		this.nombre = nombre;
//		this.funcion = funcion;
	}

	
	
	
	public ObjNombre getNombre() {
		return nombre;
	}
	public void setNombre(ObjNombre nombre) {
		this.nombre = nombre;
	}
//	public FuncionObj getFuncion() {
//		return funcion;
//	}
//	public void setFuncion(FuncionObj funcion) {
//		this.funcion = funcion;
//	}
	
	
	
}
