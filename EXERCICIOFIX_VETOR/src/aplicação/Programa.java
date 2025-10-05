package aplicação;

import java.util.Scanner;

public class Programa {
	public static void main(String[] ags) {
	

		
		Scanner sc = new Scanner(System.in);//crio o Scanner
		//Programa que leia N numeros positivos e N inteiiros e diga quantos são negativos
		//EXPLICAÇÃO RAPIDA SOBRE OS ":" UTILIZADO NO SEGUNDO FOR DO CODIGO
		// -> ELE BASICAMENTE É CHAMADO DE FOR APRIMORADO, E BASICAMENTE PEGA VALORES DE UM TIPO DENTRO DE ARRAY(NESSE CASO VETOR)
		// -> NO CASO, "para cada número inteiro v dentro do array vetor, execute o que está dentro do bloco."
		
		System.out.println("Quantos números você vai digitar? "); //PERGUNTO QUANTOS NUMEROS
		int n = sc.nextInt(); //ACOPLO O VALOR LIDO
		
		int [] vetor = new int[n]; // CRIO O VETOR INTEIRO N
		
		if(n <= 10) { //COLOCO UMA CONDIÇÃO PARA TER UMA QUANTIDADE MAX. DE VALORES(10)
			for(int i=0; i < n; i++) {//CRIO O LAÇO PARA RECEBER OS VALORES
				System.out.println("Digite um número: "); //PEÇO PARA DIGITAR O NÚMERO
				vetor[i] = sc.nextInt(); //ACOPLO OS VALORES QUE VÃO SENDO DIGITADOS NO vetor[i]
			}
			//ETAPA DOS NÚMEROS NEGATIVOS
			System.out.println("Números negativos: ");//PRINTO A INFORMAÇÃO QUE VAI SAIR, NO CASO OS NÚMEROS NEGATIVOS 
						for( int v : vetor) {//CRIO UM FOR USANDO O : PARA PEGAR OS VALORES DO VETOR
	
							if (v < 0) { //AQUI CRIO OUTRA CONDIÇÃO PARA PEGAR OS VALORES NEGATIVOS	
							System.out.printf("%d%n", v ); //PRINTO OS VALORES UM POR UM JA QUE O IF TA DENTRO DO FOR
						}
					}
			}
			
		else {
			System.out.println("Quantidade não suportada, reinicie o sistema!");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
