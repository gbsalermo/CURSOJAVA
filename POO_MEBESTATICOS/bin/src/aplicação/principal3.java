package aplicação;
import java.util.Locale;
import java.util.Scanner;

import util.calculadora2;


public class principal3 {
	
	public static void main(String[] ags) {
		//Nessa versão não preciso instanciar a calculadora
		//No lugar do objeto eu ponho a propria classe
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Calculadora calc = new Calculadora(); // local onde instanciava a classe
		
		System.out.println("Qual o valor do raio? ");
		double raio = sc.nextDouble();
		
		double c = calculadora2.circunferencia(raio); // Troco calc. por calculadora2. pois nao necessito instaciar mais
	
		double v = calculadora2.volume(raio); //// Calculo do Volume
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calculadora2.PI); //Declaro PI
		
		
		
		
		
		sc.close();
	}

}
