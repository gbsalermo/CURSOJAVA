package aplicação;

import java.util.Locale;
import java.util.Scanner;
import util.dolar;
public class principal {
	public static void main(String[] ags) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double qt;
		
		System.out.println("Qual é o preço do dolar? ");
		double d = sc.nextDouble();
		System.out.println("Qual a quantidade? ");
		double q = sc.nextDouble();
		
		
		qt = q * d;
		double total = dolar.conversor(qt);

		System.out.printf("O valor a pagar é: %.2f%n", total);
		
		

		
		
		
		
		
		sc.close();
		
		
	}
}
