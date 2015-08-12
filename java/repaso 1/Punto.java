/*
 

Un método equals
Un método toString que represente el punto de la forma (x,y)

*/

public class Punto{
	// Campos
	double x , y ;		

	public Punto(double x , double y){
		this.x = x ;
		this.y = y ;
	}

	public Punto puntoMedio(Punto puntoEntrante){
		double posicionX , posicionY ; 
		posicionX = (this.x + puntoEntrante.x )/ 2;
		posicionY = (this.y + puntoEntrante.y )/ 2;
		Punto puntoMedio2 = new Punto(posicionX , posicionY);
		return puntoMedio2;
	}

	public String toString(){
		String strARetornar = "(" + this.x + "," + this.y + ")" ;
		return strARetornar;
	}

	public boolean equal(Punto p){
		return p.x == this.x && p.y == this.y ;
	}

}