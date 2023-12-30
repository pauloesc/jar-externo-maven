package principal;

import logicaDataTypes.Persona;

public class Principal {

	public static void main(String[] args) {
	
			Persona p = new Persona("carlos",5);
			
			p.cargarLibro("La ciudad de la lluvia", "Drama");
			p.imprimirInformacion();
		
	}

}
