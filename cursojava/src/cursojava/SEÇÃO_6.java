package cursojava;
import java.util.Scanner;
import java.util.Locale;

public interface SEÇÃO_6 {
	public static void main( String[] args) {
		
		
		/*Aula 1 - Debug

		 * MARCAR LINHA: RUN -> TOGGLE BRAKPOINT
		 * iNICIAR: BOTAO DIREITO NA CLASSE -> DEBUG AS -> JAVA APLICATION
		 * PARA EXECUTAR PROXIMA LINHA(DEPOIS DA MARCADA): F6
		 * PARA INTERROMPER O DEBUG BOTAO VERMELHO
		 *
		 *EXEMPLO DE CODIGO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
 
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();
		*/
		
		//AULA 2 - WHILE
		//USAR QUANDO NÃO SABER A QUANT. DE REPETIÇÕES
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) { //O programa roda enquanto x for diferente de 0
			soma = soma + x; //Add os valores a soma até ser digitado 0, podendo ser tambem soma += x;
			x = sc.nextInt();
		}

		System.out.println("A soma é: " + soma);
		
		sc.close();
		
	}
}
