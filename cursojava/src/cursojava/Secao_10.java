package cursojava;

import java.util.Scanner;

public interface Secao_10 {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		//TIPOS DE REFERENCIA X VALOR
		
		//TIPOS PRIMITIVOS E INICIALIZAÇÃO
		
		//int p; variavel sem iniciar
		int p = 10; // variavel inicializada, não dando mais erro no print abaixo
		
		System.out.println(p); //dá erro pois a variavel não foi incializada
		sc.close();
	}
}
