public class Test{
	
	public static void main(String[] args){

		String pal = "hola hola hol";
		char bus = 'a';
		char rem = 'w';
		String retornoEj1 = HojaDeRepaso.ejercicio1(pal,bus,rem);
		System.out.println(retornoEj1);



		boolean[] arr = { true, false, true, true, false, false };
		int num = 10;
		int retorna = HojaDeRepaso.ejercicio3(arr , num);
		System.out.println(retorna);

		pruebaEjercicio4();

		System.out.println("");
		// Prueba ejercicio 6
		Rectangulo rec = new Rectangulo(10,20);
		System.out.println(rec.area());
		System.out.println(rec.perimetro());



		System.out.println("Prueba ejercicio 7");
		Punto p1 = new Punto(1.0,1.0);
		Punto p2 = new Punto(3.0,3);

		System.out.println(p1 );
		System.out.println(p2);

		Punto puntoMedio = p1.puntoMedio(p2);
		System.out.println(puntoMedio);

		System.out.println(p1.equal(p1));
		System.out.println(p1.equal(p2));

	}


	public static void pruebaEjercicio4(){
		boolean[] arr = {true,false,true,true,true,false,false,true};
		HojaDeRepaso.ejercicio4(arr);
	}
}