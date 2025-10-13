package principal;
import util.Classe;
import java.util.Scanner;

public interface Programa {
	public static void main(String[] ags) {
		

		Scanner sc = new Scanner(System.in);
		/* Lista 1 - Exercicio retangulo
		System.out.println("Qual a altura? ");
		double alt = sc.nextDouble();
		System.out.println("Qual a larg? ");
		double larg = sc.nextDouble();
		
		Classe retangulo = new Classe(alt, larg);
		
		System.out.println("A area é: " + retangulo.Area());
		System.out.println("O perimetro é: " + retangulo.Perimetro());
		System.out.println("É quadrado? " + retangulo.Eh_quadrado());
		*/
		//Lampada
		
		Classe lamp1 = new Classe(); //sem argumentos, lampada colocada para ter 60w
		Classe lamp2 = new Classe(100); //com argumentos, ou seja preciso add um valor
		
		//Testando lamp1
		
		System.out.println("Lampada 1 tem: " + lamp1.watts + "watts");
		System.out.println("Lampada 1 estado atual: " + lamp1.estado);
		
		lamp1.Ligar();
		System.out.println("Lampada 1 estado atual: " + lamp1.estado);
		lamp1.Desligar();
		System.out.println("Lampada 1 estado atual: " + lamp1.estado);
		
		//Testando lamp2
		
		System.out.println("Lampada 2 tem: " + lamp2.watts + "watts");
		System.out.println("Lampada 2 estado atual: " + lamp2.estado);
		
		lamp2.Ligar();
		System.out.println("Lampada 2 estado atual: " + lamp2.estado);
		lamp2.Desligar();
		System.out.println("Lampada 2 estado atual: " + lamp2.estado);
		
		
		sc.close();
	}
}
