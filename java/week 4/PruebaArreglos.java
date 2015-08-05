public class PruebaArreglos{
	public static void main(String[] args){
		EjemplosDeArrays a = new EjemplosDeArrays(10,5);

		System.out.println(a);

		a.setArregloDeEnteros(2, 10);

		System.out.println(a);

		a.setArregloDeEnteros(5, 100);

		System.out.println(a);
	}
}