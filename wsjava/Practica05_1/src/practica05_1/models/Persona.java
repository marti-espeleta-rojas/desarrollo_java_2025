package practica05_1.models;

public class Persona {
	
	//declaration of the attributes of the class Person
	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	//definition of the constructor
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//getter of the name
	public String getNombre() {
		return nombre;
	}
	
	//getter of the surname
	public String getApellido() {
		return apellido;
	}
	
	//getter of the direction
	public Direccion getDireccion() {
		return direccion;
	}
	
	//setter of the direction
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	//converting the object into a string representation of it
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDirección: " + direccion.getDescripcion() + "\n\n";
	}
}
