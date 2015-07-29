
public class Fraction{

	// Definir los campos , los encapsulamos (private)
	private int numerador;
	private int denominador;

	// Constructores
	public Fraction(int n){
		this.numerador = n;
		this.denominador = 1;
	}

	public Fraction(int n, int d){
		this.numerador = n;
		this.denominador = d > 0 ? d : 1 ;
		/*
			Utilizamos el operador ternario es lo mismo a tener
			if( d > 0) {
				this.denominador = d;
			} else  {
				this.denominador = 1;
			}
		*/
	}

	/*  Declaración de metodos. 
		Getters: Se denomina a todos los metodos que retornan un campo. 
		Setters: Se denomina a todos los metodos que cambian un campo. 

	*/
	public int getNum(){
		return this.numerador;
	}

	public int getDem(){
		return this.denominador;
	}

	public void setNum(int n){
		this.numerador = n;
	}

	public void setDen(int d){
		if( d != 0 ) this.denominador = d;
	}

	public Fraction add(Fraction otra){
		int nN = this.numerador * otra.denominador + this.denominador * otra.numerador ;
		int nD = this.denominador * otra.denominador ;
		Fraction nuevaFraction = new Fraction(nN , nD);
		return nuevaFraction;
	}

	public Fraction multiply(Fraction otra){
		int nN = this.numerador * otra.numerador ;
		int nD = this.denominador * otra.denominador ;
		Fraction nuevaFraction = new Fraction(nN , nD);
		return nuevaFraction;
	}

	public Fraction div(Fraction otra){
		int nN = this.numerador * otra.denominador ;
		int nD = this.denominador * otra.numerador ;
		Fraction nuevaFraction = new Fraction(nN,nD);
		return nuevaFraction;
	}

	public String toString(){
		String nS = this.numerador + "/" + this.denominador ;
		return nS;
	}

	public boolean equals(Fraction otra){
		if( this.numerador == otra.numerador && this.denominador == otra.denominador )
			return true;
		return false;
	}

}









