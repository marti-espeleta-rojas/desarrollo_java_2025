package practica05_1.models;

public class DireccionEdificio extends Direccion
{
	private String calle;
	private int numero;
	private String departamento;
	
	
	public DireccionEdificio(String descripcion, String calle, String departamento, int numero) {
		super(descripcion);
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
	}
	
	@Override
	public String getDescripcion() {
		return "\nCalle - " + calle + "\nDepartamento - " + departamento + "\nNúmero - " + numero;
	}

}
