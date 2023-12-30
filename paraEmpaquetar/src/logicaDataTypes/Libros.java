package logicaDataTypes;

public class Libros {

	public String nombre;
	public String tipo;
	
	public Libros (String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " " + "Genero: " + tipo;
		
	}
	
}
