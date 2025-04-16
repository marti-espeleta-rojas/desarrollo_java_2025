package practica05_1.models;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan", "Rodriguez");
		Persona p2 = new Persona("María", "Rodriguez");
		Persona p3 = new Persona("Jose", "Martínez");
		
		
		p1.setDireccion(new DireccionCalleNumero("Direccion personal", 325, "San Martín"));
		p2.setDireccion(new DireccionEdificio("Dirección de la oficina comercial", "San Martín", "4B", 600));
		p3.setDireccion(new DireccionBarrio("Dirección del estudio", "La luna II", "M", "03"));
		
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(p3);
		personas.add(p2);
		personas.add(p1);
		
		for(Persona p : personas) {
			System.out.println(p);
		}
	}
	

}
