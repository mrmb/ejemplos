public class TestFraction{
	
	public static void main(String[] args){

		System.out.println(" ===== Test de fraction ==== ");

		// Instanciando fracciones
		Fraction f1 = new Fraction( 2 , 3); // 2/3
		Fraction f2 = new Fraction( 5 );	// 5/1
		Fraction f3 = new Fraction( 1 , 2); // 1/2

		// Ya que se sobrecargo Fraction, el va a buscar toString de la clase Fraction. 
		System.out.println("Imprimiendo las fracciones.");
		System.out.println(f1) ;
		System.out.println(f2) ;
		System.out.println(f3) ;

		Fraction suma = f1.add(f2);
		System.out.println("Deberia salir 17/3 y retorna " + suma);

		Fraction multiplicacion = f2.multiply(f3);
		System.out.println("Deberia salir 5/2 y retorna " + multiplicacion);

		Fraction division = f3.div(f1);
		System.out.println("Deberia salir 3/4 y retorna " + division);

		// Vamos a utilizar equals para comparar dos objetos del mismo tipo. 
		boolean comparacion1 = f1.equals(f2);
		boolean comparacion2 = f1.equals(f3);
		boolean comparacion3 = f1.equals(f1);
		System.out.println(comparacion1);
		System.out.println(comparacion2);
		System.out.println(comparacion3);

	}

}