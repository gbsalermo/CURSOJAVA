package aplicação;

import java.util.Scanner;
import java.util.Locale;
import util.Calculadora;

public class Principal2 {

	public static void main (String[] ags) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora(); // instacio a classe, pois os membros não são estaticos
		
		System.out.println("Qual o valor do raio? ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio); // Chamo o calculo de circunferência com calc.circunferencia
	
		double v = calc.volume(raio); //// Chamo o calculo de volume com calc.volume
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI); //chamo pi com o calc.PI
		
		
		sc.close();
		
	}
}
