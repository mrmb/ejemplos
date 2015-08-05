public class PruebaE {
  public static void main(String[] args) {


	 Estudiante e1 = new Estudiante("Juan Perez","14001234",(byte)90);
	 Estudiante e2 = new Estudiante("Jose Lopez","14002187",(byte)75);
	 Estudiante e3 = new Estudiante("Carlos Ruiz","14005136",(byte)50);
		
	 System.out.println("Promedio desde e1: " + e1.promedio);
	 System.out.println("Promedio desde e2: " + e2.promedio);
	 System.out.println("Promedio desde e3: " + e3.promedio);
		
	 System.out.println("Cantidad desde e1: " + e1.cantidadEstudiantes);
	 System.out.println("Cantidad desde e2: " + e2.cantidadEstudiantes);
	 System.out.println("Cantidad desde e3: " + e3.cantidadEstudiantes);
	 System.out.println("Cantidad desde e3: " + Estudiante.cantidadEstudiantes);
	 System.out.println("Cantidad desde e3: " + Estudiante.getCantidadEstudiantes());

  		System.out.println("Cant estudiantes " + Estudiante.getCantidadEstudiantes());
  		System.out.println("Cant estudiantes " + Estudiante.cantidadEstudiantes);

  		/*
			1 instrucción
				Error
				0
  		*/

	}
}