package APLICAÇÃO;
import java.util.Scanner;
import util.salario;
import java.util.Locale;

public class PRINCIPAL_EX2 {
	public static void main(String[] ags) { 
		
		//Programa para ler e incrementar salário do funcionario
		Locale.setDefault(Locale.US); // instalo o locale
		Scanner sc = new Scanner(System.in); // crio o scanner
		
		salario x = new salario(); // crio um objeto x como novo salario
		
		//peço o nome, salario bruto e taxa, adicionando todas ao objeto x
		
		System.out.println("Qual o nome do funcionario? "); 
		x.name = sc.nextLine(); //ponho o nome no objeto x, por ser uma String com espaços uso o nextLine()
		System.out.println("Qual o salario bruto? "); 
		x.sb = sc.nextDouble();
		System.out.println("Qual a taxa? ");
		x.tx = sc.nextDouble();
		
		System.out.println(); //pulo linha
		System.out.println("Dados: " + x);
		System.out.println();//pulo linha
		System.out.println("Quantos porcentos gostaria de incrementar? "); //peço a porcentagem de aumento
		Double p = sc.nextDouble(); //Crio a variavel p e adiciono nela o valor da porcetagem
		x.increase(p); //adiciono p no calculo de inclusao dentro do objeto x
		System.out.println("Dados atualizados: " + x);//por ultimo imprimo a atualização
		
		
		sc.close(); // fim
	}
}
