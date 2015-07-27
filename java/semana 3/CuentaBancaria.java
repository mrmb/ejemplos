/*	Clases
	Crearemos la clase CuentaBancaria.
*/

public class CuentaBancaria{
	// Campos
	String nombre, numeroDeCuenta;
	double saldo;
	char tipo;

	//Constructores
	public CuentaBancaria(String nombre, String noCuenta, char tipo){
		this.nombre = nombre ;
		this.numeroDeCuenta = noCuenta;
		this.tipo = tipo;
	}

}