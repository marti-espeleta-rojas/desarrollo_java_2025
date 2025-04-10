package prueba.banco.ejemplo;

import java.util.Vector;

public class Banco 
{
	//Declaration of variables and attributes
	private String nombre;
	private Vector<Cliente> clientes;
	private Vector<Cuenta> cuentas;
	//End of declaration
	
	//Getter of the name of the bank
	public String getNombreBanco() {
		return nombre;
	}
	//End of the getter
	
	//Declaration of general methods of the class
	private float getDisponiblePorCliente(Cliente cliente) 
	{
		float saldo = 0;
		cuentas = cliente.getCuentas();
		//I brought the client accounts to analyze each account's balance
		for (Cuenta c : cuentas) {
			saldo+=c.getSaldo();
		}
		//Once I've added each balance, I return the total amount
		return saldo;
	}
	
	public float getDisponibleEnBanco() {
		float saldoTotal = 0;
		//As I have to sum the amount of every account, I bring every client
		for (Cliente c : clientes) {
			getDisponiblePorCliente(c);
		}
		return saldoTotal;
	}
	
	public void agregarCuenta(Cuenta c, int nroCliente) {
		cuentas.add(c);
	}
	
	public void agregarCliente(Cliente cli) {
		clientes.add(cli);
	}
	//Ending of the declaration
}
