package cursojava;
import  java.util.Scanner;

public interface SEÇÃO5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
	/* exemplo estrutura condicional simples
	
	int x = 5;
	
	System.out.println("Bom dia");
	if (x ==0) {
		System.out.println("Boa tarde");
	}
	
	System.out.println("Boa noite");*/
	
	/* Exemplo estrutura condicional composta
		
		
		int hora;
		
		System.out.println("Quantas horas? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde");
		}
	
		sc.close();
	*/
	
	/*exemplo operadores de atribuição cumulativa
		
	int minutos = sc.nextInt();
	
	double conta = 50.0;
	if (minutos > 100) {
		//conta = conta + (minutos - 100) * 2.0; sem o operador cumulativo
		conta += (minutos - 100) * 2.0; //com o operador +=
		
	}
	System.out.printf("Valor da conta = R$%.2f%n", conta);
	
	sc.close(); */
		
	
	/* Exemplo switch-case
		
	
	int x = sc.nextInt();
	String dia;
	
	switch(x) {
	case 1:
		dia = "Domingo";
		break;
	case 2:
		dia = "Segunda";
		break;
	case 3:
		dia = "Terça";
		break;
	case 4:
		dia = "Quarta";
		break;
	case 5:
		dia = "Quinta";
		break;
	case 6:
		dia = "Sexta";
		break;
	case 7:
		dia = "Sabado";
		break;
	default:
		dia = "Invalido";
		break;
		
		
	}
	System.out.println("Dia da semana: " + dia);
		
		
		
	
		
		
	sc.close();
	*/

		
	/* CONDICIONAL TERNARIA
		
	double preco = 34.5;
	double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // condicional
	System.out.println(desconto);
	*/
	}
}
