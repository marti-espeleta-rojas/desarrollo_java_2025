package practica05_1.models;

public abstract class Direccion 
{
	//attributes definition
	protected String descripcion;
	
	//constructor definition
	public Direccion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//getter of the description of the direction
	public abstract String getDescripcion();
}
