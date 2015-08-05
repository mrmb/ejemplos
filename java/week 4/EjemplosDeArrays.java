public class EjemplosDeArrays{

	// Campos
	int[] arregloDeEnteros ;
	String[] arregloDeStrings ;

	public EjemplosDeArrays(int tamanoArreglo1 , int tamanoArreglo2){
		arregloDeEnteros = new int[tamanoArreglo1];
		arregloDeStrings = new String[tamanoArreglo2];
	}

	public void setArregloDeEnteros( int pos, int val ){
		if( pos >= 0 && pos < arregloDeEnteros.length ){
			arregloDeEnteros[pos] = val;
		}
	}

	public String toString(){
		String s = "";
		for(int i = 0 ; i < arregloDeEnteros.length ; i++){
			s = s + " | " + arregloDeEnteros[i]; 
		}
		return s;
	}


}