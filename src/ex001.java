import java.util.Locale;
import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para descobrir se é negativo ou positivo");
		int n = sc.nextInt();
		
		if(n<0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
