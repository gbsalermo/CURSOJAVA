package cursojava;
import java.util.Scanner;
//import java.util.Locale;

public interface SEÇÃO_6 {
	public static void main( String[] args) {
		
	
		//Aula 1 - Debug

		// * MARCAR LINHA: RUN -> TOGGLE BRAKPOINT
		 //* iNICIAR: BOTAO DIREITO NA CLASSE -> DEBUG AS -> JAVA APLICATION
		 //* PARA EXECUTAR PROXIMA LINHA(DEPOIS DA MARCADA): F6
		// * PARA INTERROMPER O DEBUG BOTAO VERMELHO
		// *
		/*EXEMPLO DE CODIGO
		
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
		
		/*exemplo aula
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) { //O programa roda enquanto x for diferente de 0
			soma = soma + x; //Add os valores a soma até ser digitado 0, podendo ser tambem soma += x;
			x = sc.nextInt();
		}

		System.out.println("A soma é: " + soma);
		
		

		sc.close();
		*/
		
		/*AULA 3 - FOR
		//EXEMPLO FOR
		
		//Scanner sc = new Scanner (System.in);
		
		/int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		System.out.println(soma);
		
		//CONTAGEM
		for (int i = 0; i < 5; i++) {
			System.out.println("valor de i: " + i);
		}
		
		// CONTAGEM REGRESSIVA
		
		for (int i = 4; i >=0; i--) {
			System.out.println("Valor de i: " + i);
		}
		sc.close(); */
		
		/* 4 - DO-WHILE
		//exemplo
		
		Scanner sc = new Scanner(System.in);
		
		
		char resp;// tem de declarar fora do do pois se não o compliador nao aceita
		
		
		do {
			System.out.print("Digite a temperatura em celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			 resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		
		
		sc.close();
		*/
	}
}
