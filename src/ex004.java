import java.util.Locale;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código e a quantidade: ");
		int cod = sc.nextInt();
		int quanti = sc.nextInt();
		
		double total;
		if( cod == 1) {
			System.out.println("Cachorro quente");
			total = quanti*4.0;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(cod == 2) {
			System.out.println("X-Salada");
			total = quanti*4.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(cod == 3) {
			System.out.println("X-Bacon");
			total = quanti*5.0;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(cod == 4) {
			System.out.println("Torrada simples");
			total = quanti*2.0;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if(cod == 5) {
			System.out.println("Refrigerante");
			total = quanti*1.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		sc.close();
	}

}
