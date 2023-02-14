import java.util.Locale;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("Os dois números são múltiplos");
		}
		else {
			System.out.println("Os dois números não são múltiplos");
		}
		
		
		
		
		sc.close();
	

	}

}
