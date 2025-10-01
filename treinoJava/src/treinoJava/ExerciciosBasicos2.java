package treinoJava;

import java.util.Scanner;

public interface ExerciciosBasicos2 {
	
	public static void main(String[] ags) {
		
		
		Scanner sc = new Scanner(System.in);
		/*EXERCICIO 1 IF/ELSE - NÚMERO MAIOR
		int x, y;
		
		System.out.println("Digite um valor: ");
		x = sc.nextInt();
		System.out.println("Digite outro valor: ");
		y = sc.nextInt();
		
		if(x > y) {
			System.out.println("O primeiro número é maior");
		}
		else {
			System.out.println("O segundo número é maior");
		}
		*/
		/*EXERCICIO 2 IF/ELSE - ANO DE VOTAÇÃO
		int min = 2025 - 18; //faõ o calculo da idade minima pra votar a partir do ano atual
		
		System.out.println("Qual seu ano de nascimento? ");//peço o ano de nascimento
		int ano = sc.nextInt(); //crio a variavel ano
		
		
		if (ano <= min) { //faço a comparação	
			System.out.println("Você ja pode votar");//printo caso true
		}
		else {
			System.out.println("Ainda não pode votar");//printo caso false
		}*/
		/*EXERCICIO 3 IF/ELSE - SENHA
		
		System.out.println("Qual a senha? ");
		int s = sc.nextInt();
		
		if (s == 1234) {
			System.out.println("ACESSO PERMITIDO");
		}
		else {
			System.out.println("ACESSO NEGADO");
		}
		
	*/
		/*EXERCICIO 4 IF/ELSE - Maçãs
		
		System.out.println("Bem vindo! Quantas maçãs deseja? ");
		int q = sc.nextInt();
		
		if(q < 12) {
			
			double t = q * 0.30;
			System.out.printf("A compra total de " + q + " maçãs" + " foi de R$%.2f%n", t);
		}
		else {
			double t1 = q * 0.25;
			System.out.printf("A compra total de " + q + " maçãs" + " foi de R$%.2f%n", t1);
		}
		*/
		/*EXERCICIO 5 IF/ELSE - ORDEM CRESCENTE
		
		System.out.println("Qual o primeiro valor? ");
		int x = sc.nextInt();
		System.out.println("Qual o segundo valor? ");
		int y = sc.nextInt();
		System.out.println("Qual o terceiro valor? ");
		int z = sc.nextInt();
		
		if (x > y && y > z) {
			System.out.println("O maior é: " + x + "O segundo: " + y + "O terceiro: " + z);
		}
		else if(x > z && z > y) {
			System.out.println("O maior é: " + x + "O segundo: " + z + "O terceiro: " + y);
		}
		else if(y > x && x > z) {
			System.out.println("O maior é: " + y + "O segundo: " + x + "O terceiro: " + z);
		}
		else if(y > z && z > x) {
			System.out.println("O maior é: " + y + "O segundo: " + z + "O terceiro: " + x);
		}
		else if(z > x && x > y) {
			System.out.println("O maior é: " + z + "O segundo: " + x + "O terceiro: " + y);
		}
		else if(z > y && y > x) {
			System.out.println("O maior é: " + z + "\nO segundo: " + y + "\nO terceiro: " + x);
		}
		*/
		sc.close();
	}
	
}
