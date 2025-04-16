package practica05_1.models;

//this class inherits all the attributes and methods from the class Direction
public class DireccionCalleNumero extends Direccion
{
	//definition of the attributes
	private String calle;
	private int numero;
	
	
	//definition of the constructor
	public DireccionCalleNumero(String descripcion, int numero, String calle) {
		super(descripcion);
		this.numero = numero; 
		this.calle = calle;
	}
	
	//getter of the description
	@Override
	public String getDescripcion() {
		return "\nCalle - " + calle + "\nNúmero - " + numero;
	}
}
