package aplicação;

import java.util.Scanner;
import java.util.Locale;

public class principal {//PROGRAMA PRINCIPAL
	
	public static final double PI = 3.14159; //membro estático, a palavra final serve para confirmar que o valor não mudará, constantes é sempre maiusculo
	
	public static void main(String[] ags) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do raio? ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio); // função responsavel por calcular a circunferência
	
		double v = volume(raio); //Função responsavel por calcular o volume
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circunferencia(double raio) {//Crio a função circunferencia que recebe double raio
		return 2.0 * PI * raio; // faço o retorno do calculo de circunferência
	}
	public static double volume(double raio) { //Crio a função volume que recebe double raio
		return 4.0 * PI * raio * raio * raio / 3.0; //faço o calculo de volume
	}

}
