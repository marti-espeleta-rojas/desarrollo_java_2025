package prueba.banco.ejemplo;

import java.util.Vector;

public class Cliente 
{
	//Declaration of variables and attributes
	private String apellido;
	private String nombre;
	private int clienteNro;
	private Vector<Cuenta> listaCuentas;
	//Ending of the declaration
	
	
	//Getters and setters declarations
	public String getApellido() {
		return apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getClienteNro() {
		return clienteNro;
	}
	//Ending getters and setters
	
	
	
	//Constructor
	public Cliente(String apellido, String nombre) 
	{
		this.apellido = apellido;
		this.nombre = nombre;
		this.clienteNro = clienteNro++;
	}
	//End Constructor
	
	public Vector<Cuenta> getCuentas(){
		return listaCuentas;
	}
	
	
	public void agregarCuenta(Cuenta cuenta) {
		listaCuentas.add(cuenta);
	}
	
	public String toString() {
		String cadena = "Apellido: " + apellido + 
				" Nombre: " + nombre +
				" Número de cliente: " + clienteNro;
		return cadena;
		
	}

}
