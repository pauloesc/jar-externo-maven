package logicaDataTypes;

import java.util.Comparator;

public class Comparador implements Comparator<Libros> {

	
	@Override
	public int compare(Libros arg0, Libros arg1) {
		return arg0.nombre.compareTo(arg1.nombre);
	} 
	
}
