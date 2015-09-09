import java.util.regex.*;


public class TestRefuer2{
	
	public static void main(String[] args){
		System.out.println("Expresiones regulares");
		
		boolean mat = Pattern.matches("\\d{2,5}\\s?\\w*","334dd");

		// Fecha
		/*
			1-31/(1-12)/4d
			([1-9]|1[0-9]|2[0-3])
			[1-9] -> 1,2,3,4,5,...,9 1-9
			1[0-9] -> 1(0,1,2...,9) 10-19
			2[0-9] -> 2(0,1,2...,9) 20-29
			3[0-1] -> 3(0,1)
		*/
		String exr_meses_31_dias = "([1-9]|1[0-9]|2[0-9]|3[0-1])\\/(1|12)\\/([1-9]{1}[0-9]{3})";
		String entrada = "31/1/2011";
		mat = Pattern.matches( exr_meses_31_dias , entrada);

		// System.out.println( mat);

		// Matriz

		int[][] x = new int[3][4];
		x[0][1] = 10 ;
		x[2][2] = 3 ;

		for(int i = 0 ; i < x.length ; i++){
			for(int j = 0 ; j < x[i].length; j++){
				System.out.print(x[i][j] + "|");
			}
			System.out.println("");
		}


	}


}