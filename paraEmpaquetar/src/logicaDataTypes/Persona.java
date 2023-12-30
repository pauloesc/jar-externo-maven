package logicaDataTypes;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Persona {
	
	private String nombre;
	private int edad;
	private Set<Libros> librosPreferidos;
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
    // Bloque de inicialización de instancia
	// Se ejecuta cada vez que se crea una instancia de la clase
    {
    	Comparator<Libros> comparador = new Comparador();
    	librosPreferidos = new TreeSet<Libros>(comparador);
    	librosPreferidos.add(new Libros("Harry Potter", "Fantasia" ));
    }
	
    // Bloque de inicialización estático
    // Se ejecuta solo una vez cuando la clase es cargada por la JVM
    /*
     * 
     * static {
     * System.out.println("Bloque de Inicialización Estático");
     * }
     * 
     */

	public void cargarLibro(String nombre, String genero){
		this.librosPreferidos.add(new Libros(nombre, genero));
	}
	
    public void imprimirInformacion() {
    	System.out.println("Nombre: " + nombre);
    	System.out.println("Edad" + edad);
    	
    	for (Libros libro : librosPreferidos) {
    		System.out.println("Libro:  " + libro);
		}
    }
    

}
