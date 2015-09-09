public class SimpleNode<T>{
	
	// Campos
	T dato;
	SimpleNode<T> next ;

	// Constructores
	public SimpleNode( T dato ){
		this.dato = dato ;
		this.next = null ;
	}

	public SimpleNode(T dato, SimpleNode next){
		this.dato = dato;
		this.next = next;
	}

}