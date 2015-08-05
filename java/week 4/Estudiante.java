public class Estudiante{
	
	static boolean cantidadEstudiantes; 
		   String nombre, carnet;
		   byte promedio;

	public Estudiante (String n, String c, byte p) {
			this.nombre = new String(n);
			this.carnet = new String(c);
			this.promedio = p;
			//cantidadEstudiantes++;   // ←
  	}

  	public static boolean getCantidadEstudiantes(){
  		return cantidadEstudiantes ;
  	}

}