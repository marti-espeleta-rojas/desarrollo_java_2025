package practica05_1.models;

public class DireccionBarrio extends Direccion 
{
	private String barrio;
	private String manzana;
	private String departamento;
	
	public DireccionBarrio(String descripcion, String barrio, String manzana, String departamento) 
	{
		super(descripcion);
		this.departamento = departamento;
		this.manzana = manzana;
		this.barrio = barrio;
	}
	
	@Override
	public String getDescripcion() {
		return "\nCalle - " + descripcion + "\nBarrio - " + barrio + "\nManzana - " + manzana + "\nDepartamento - " + departamento;
	}
}
