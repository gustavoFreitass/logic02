import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número e descubra se é par ou ímpar: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
			
		
		
		
		
		
		
		
		
		sc.close();

	}

}
