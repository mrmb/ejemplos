public class Test{

	/*
		Estas es una clase llamada Test, no contiene ningun campo
		pero si un metodo main.

		El método main de momento lo situaremos en una clase independiente 
		destinada exclusivamente a contener este método. La clase con el método 
		main podría tratarse como una clase más y el método main como un método más. 

		Nosotros preferiremos diferenciarlo por motivos didácticos.
	*/

	public static void main(String[] args){
		// Variables
		String nombre = "Juan"; 
		String noCuenta="001-23";
		char tipo = 'A'; 

		// Creamos una nueva variable, sera una instancia de la clase CuentaBancaria
		CuentaBancaria c = new CuentaBancaria(nombre,noCuenta,tipo);

		System.out.println(c);
	}


}