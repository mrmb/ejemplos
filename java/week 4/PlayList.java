import java.util.*;

public class PlayList{

	/*	Campos
		Los primeros dos parametros son los que inicializan la clase.

		Utilizaremos dos campos auxiliares, que nos permitan tener en cualquier momento
		el numero de canción que se esta reproduciendo, asi como el nombre que representa
		ese numero de canción. 
	*/
	
	private String canciones;
	private int numeroCanciones;

	private String cancionActual ;
	private int numeroCancionActual;

	
	// Constructor

	public PlayList(String canciones , int numeroCanciones){
		/*	
			Los primeros dos parametros los almacenaremos en un campo para poder ser utilizados
			en algun otro metodo. 

			Al inicialiar la playlist, por defecto pondremos la primer canción a reproducir
		*/
		this.canciones = canciones;
		this.numeroCanciones = numeroCanciones;
		
		this.numeroCancionActual = 1 ;	// La primer canción
		// Pedimos una canción en base a un numero (canción no 1)
		this.cancionActual = this.getStringCancion(this.numeroCancionActual); 	
	}

	/*	
		Metodo que retorna un string en base a un numero
		Ejemplo
			campos
				canciones = A;B;C;D;E;F;G;H
				numeroCanciones = 8

			getStringCancion(1) -> A
			getStringCancion(3) -> C
			getStringCancion(5) -> E
			getStringCancion(10) -> null
		Si el numero es diferente a el numero de canciones retornara null
	*/

	public String getStringCancion(int numero){
		Scanner sc = new Scanner(this.canciones);
		sc.useDelimiter(";");
		int i = 1 ;

		while(sc.hasNext()){
			if( numero == i ){
				return sc.next();
			} else {
				i++;
				sc.next();
			}
		}

		return null;
	}

	// Metoodos

	public String getCancionActual(){
		return this.cancionActual;
	}

	/* Forward y backward cambian primero el numero de cancion actual y en base a ese numero
	   se cambia el nombre de la cancion actual que se esta reproduciendo.
	*/
	public void forward(){
		if( this.numeroCancionActual >= this.numeroCanciones )
			this.numeroCancionActual = 1 ;
		else
			this.numeroCancionActual++;

		this.cancionActual = getStringCancion(this.numeroCancionActual);
	}

	public void backward(){
		if( this.numeroCancionActual <= 1 )
			this.numeroCancionActual = this.numeroCanciones ;
		else
			this.numeroCancionActual--;

		this.cancionActual = getStringCancion(this.numeroCancionActual);
	}

	public void random(){
		// Pedimos un numero random Clase Random 
		Random r = new Random();
		int numeroRandom = r.nextInt( this.numeroCanciones - 1 ) + 1;

		this.numeroCancionActual = numeroRandom ;
		this.cancionActual = getStringCancion(this.numeroCancionActual);	
	}

	public void gotoCancion(byte numero){
		if( numero > 0 && numero < numeroCanciones){
			this.numeroCancionActual = numero;
			this.cancionActual = getStringCancion(this.numeroCancionActual);	
		}
	}

	public String toString(){
		String s = "";
		for(int i = 1 ; i <= numeroCanciones ; i++){
			s = s + " Nombre " + getStringCancion(i); 
			if( i == this.numeroCancionActual ){
				s = s + "  <-- \n"; 
			} else {
				s = s + "\n"; 
			}
		}
		return s;
	}



}