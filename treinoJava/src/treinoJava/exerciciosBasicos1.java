package treinoJava;
import java.util.Scanner;

public interface exerciciosBasicos1 {
	 	/*exercicio 1 - PROGRAMA QUE LER A IDADE DE UMA PESSOA E EXPRESSA EM DIAS
		public static void main(String[] ags) {
			
		
			Scanner sc = new Scanner(System.in); //Crio o Scanner
			
			
			System.out.println("Idade em anos: "); //peço a idade em anos
			int ano = sc.nextInt(); //crio a variavel e adiciono o valor lido
			System.out.println("Idade em meses: ");
			int mes = sc.nextInt();
			System.out.println("Idade em dias: ");
			int dias = sc.nextInt();
			
			//Uso o final para criar constantes 
			final int diasAno = 365;
			final int diasMes = 30;
			
			//faço o calculo do total
			int total = (ano * diasAno) + (mes * diasMes) + dias;
			
			//printo o total com printf e %d para printar inteiro
			System.out.printf("Total de dias: %d%n", total); 
			
			
			sc.close(); //encerro o scanner
			
			
		}
		*/
		/*exercicio 2 - media aritmética
	
	public static void main(String[] ags) {
		double m1, m2, sm, mt;
		
		m1 = (8 + 9 + 7) / 3;
		m2 = (4 + 5 + 6 ) / 3;
		sm = m1 + m2;
		mt = sm /2;
		
		System.out.println("A primeira media é: " + m1);
		System.out.println("A segunda média é: 	" + m2);
		System.out.println("A soma das médias é: " + sm);
		System.out.println("A média das médias: " + mt);

	}*/
		/*Exercicio 3 - reajuste de saldo

	
		public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);//Crio o Scanner
		
		//Peço o saldo atual e salvo na variavel Double saldo
		System.out.println("Qual o saldo atual? ");
		double saldo = sc.nextDouble();
		
		//faço o calculo do ajuste
		double ajuste = saldo * 0.01;
		double saldoNovo = saldo + ajuste;
		
		//Imprimo por fim o saldo ajustado
		System.out.printf("Saldo ajustado: %.2f%n ", saldoNovo);
		System.out.printf("Valor adicionado de: %.2f ", ajuste); 
		
		sc.close();
	}*/
		/*Exercicio 4 - calculo de peças
		
		public static void main(String[] ags) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a porcentagem do IPI: ");
		//Dados da peça 1
		double ipi = sc.nextDouble();
		System.out.println("Qual o codigo da peça 1? ");
		int cod1 = sc.nextInt();
		System.out.println("Qual o valor unitario da peça 1: ");
		double valor1 = sc.nextDouble();
		System.out.println("Quantidade da peça 1: ");
		double quant1 = sc.nextDouble();
		//Dados da peça 2
		System.out.println("Qual o codigo da peça 2? ");
		int cod2 = sc.nextInt();
		System.out.println("Qual o valor unitario da peça 2: ");
		double valor2 = sc.nextDouble();
		System.out.println("Quantidade da peça 2: ");
		double quant2 = sc.nextDouble();
		
		double valorTotal = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
		
		System.out.println("As peças informadas foram: " + cod1 + " e " + cod2);
		System.out.printf("Valor total: %.2f", valorTotal);
		
		
		
		
		
		sc.close();
		}*/
		/*Exercicio 5 - Salario minimo
	
		public static void main(String[] ags) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual o valor do salario minimo? ");
			int sm = sc.nextInt();
			System.out.println("Qual o seu salario atual? ");
			int s = sc.nextInt();
			
			int total = s / sm;
			
			System.out.println("Você ganha o equivalente a " + total + " Salarios minimos");
			
			
			sc.close();
		}
		*/
		/*Exercicio 6 - antecessor e sucessor
	
		public static void main(String[] ags) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Um valor qualquer: ");
		int v = sc.nextInt();
		
		int ant = v -1;
		int suc = v + 1;
		
		System.out.println("O antecessor do número é: " + ant);
		System.out.println("O sucessor do número é: " + suc);
		
		
		sc.close();
		}
	*/
	
	
	
	
	
}
