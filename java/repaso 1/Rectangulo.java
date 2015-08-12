
public class Rectangulo{
	// Campos
	int alto , ancho ;

	// Constructor
	public Rectangulo(int alto , int ancho){
		this.alto = alto;
		this.ancho = ancho;
	}

	// Metodos
	public int area(){
		return alto * ancho ;
	}

	public int perimetro(){
		return alto + alto + ancho + ancho ;
	}

}