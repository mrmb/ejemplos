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

	public String toString(){
		String s = "Nombre : " + nombre + " saldo :" + saldo;
		return s;
	}

	public String hola(){
		String loQueRetornare = nombre + numeroDeCuenta;
		return loQueRetornare;
	}

	public boolean equals(CuentaBancaria otra){
		if( this.nombre.equals(otra.nombre) && 
			this.numeroDeCuenta.equals(otra.numeroDeCuenta) ){
			return true;
		} else {
			return false;
		}
	}

}










