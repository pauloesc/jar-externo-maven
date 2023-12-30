package paraEmpaquetar;

import logicaDataTypes.Persona;

public class Principal {

	public static void main(String[] args) {
	
		Persona p1 = new Persona("Juan", 20);
		
		p1.cargarLibro("El emperador", "historia");
		p1.imprimirInformacion();

	}

}
