package cursojava;
import java.util.Scanner;
public interface secao7_AulaDeFuncoes {
	public static void main (String[] ags) { // O main é uma função, no caso é a função padrão
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int x,y,z;
		System.out.println("Enter three numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		
		/*if (x > y && x > z) { // fazendo a comparação sem função
			System.out.println("O Maio é = " + x);
		}
		else if(y > z) {
			System.out.println("O maior é = " + y);
			
		}
		else {
			System.out.println("O maior é = " + z);
		}*/
		int higher = max(x, y, z); //jogo na variavel higher que me retorna o maior dos numeros x, y, z;
		Result(higher); // Aqui indico uma função que vai apenas imprimir os resultados 
		sc.close();
		
	}
	
	public static int max(int a, int b, int c) { //exemplo de declaração de função com retorno de valor
		int aux; // variavel local da função
		if (a > b && a > c) { //aplico a logica de comparação na função
			aux = a;
		}
		else if(b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;//indica que a função deve retornar o valor, ou seja o valor que ta em aux vai retornar a max
	}
	public static void Result(int value) { //Crio a função como void pois ela terá um papel apenas de ação sem retorno de valor
		System.out.println("Higher = " + value);
	}
}
