import java.util.* ;
import java.util.regex.Pattern;

public class TestPlaca{
	
	public static void main(String[] args){
		System.out.println("Ingrese Placa: ");
		Scanner sc = new Scanner(System.in);
		String placa = sc.next();

		String expr = "\\d{3}-[A-Z]{3}";
		boolean haceMatch = Pattern.matches( expr , placa);

		if(haceMatch){
			System.out.println("Placa correcta");
		} else {
			System.out.println("Placa incorrecta");
		}
	}
}