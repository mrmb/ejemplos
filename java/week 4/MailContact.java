public class MailContact{

	// Campos privados
	private String apellido,nombre,email ;
	private int grupo ;

	// Constructores
	public MailContact(String apellido, String nombre, String email){
		this.apellido = apellido ;
		this.nombre = nombre ;
		this.email = email ;
		this.grupo = 0 ;
	}

	//	Metodos tambien conocidos como getters
	
	public String getApellido(){
		return this.apellido;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getEmail(){
		return this.email;
	}

	public int getGrupo(){
		return this.grupo;
	}

	// Metodo tambien conocido como setter
	public void setGrupo(int g){
		this.grupo = g;
	}

	// Equals
	public boolean equals(MailContact otro){
		return this.email.equals(otro.email);

		/*
			La instrucción anterior es igual a:
			if( this.email.equal(otro.email) ){
				return true;
			} else {
				return false;
			}
		*/
	}

	// Metodo toString
	public String toString(){
		String s =  this.email + " " + this.apellido + " " + this.nombre;
		return s;
	}

}