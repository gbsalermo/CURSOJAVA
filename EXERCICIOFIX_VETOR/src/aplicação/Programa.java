package aplicação;
import util.Pessoa;
import java.util.Scanner;

public class Programa {
	public static void main(String[] ags) {
	

		
		Scanner sc = new Scanner(System.in);//crio o Scanner
		//Programa que leia N numeros positivos e N inteiiros e diga quantos são negativos
		/*MINHA VERSÃO
		//EXPLICAÇÃO RAPIDA SOBRE OS ":" UTILIZADO NO SEGUNDO FOR DO CODIGO
		// -> ELE BASICAMENTE É CHAMADO DE FOR APRIMORADO, E PEGA VALORES DE UM TIPO DENTRO DE ARRAY(NESSE CASO VETOR)
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
			System.out.println("Quantidade não suportada, reinicie o sistema!"); //Caso o usuario digita um valor maior que 10
		}
		*/
		/*VERSÃO DO PROFESSOR - Exercicio N numeros inteiros
		//ELE NÃO LIMITA A QUANT DE NUMEROS E TAMBÉM UTILIZA UMA FORMA MAIS SIMPLES PRA IMPRESSÃO DOS NEGATIVOS
		
		int n; //DECLARA A VARIAVEL
		
		System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();//ACOPLA A QUANT EM N

	    int[] vetor = new int[n]; //ACOPLA N AO VETOR

	    for (int i=0; i<n; i++) { //CRIA O LAÇO
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt(); //PEGA OS VALORES E PÕE NO VETOR
	    }

	    System.out.println("NUMEROS NEGATIVOS:"); //O PRINT DO NEGATIVO VEM ANTES PARA IMPRIMIR SO UMA VEZ

	    for (int i=0; i<n; i++) { //LAÇO DE VERIFICAÇÃO
	        if (vetor[i] < 0) { //IF PARA CASO OS VALORES NO VETOR FOR MENOR QUE 0
	        	System.out.printf("%d\n", vetor[i]);//IMPRIME OS VALORES
	        }
	    }
		
		*/
		/*PROGRAMA QUE LEIA N VALORES, IMPRIMA, MOSTRE A SOMA E A MEDIA
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n]; //Acopla N ao vetor
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: "); //peço os valores
			vetor[i] = sc.nextDouble(); //adiciono ao vetor
		}
		
		double soma = 0; //declaro a variavel soma como 0
		for(int i = 0; i<n; i++) { //crio o segundo for
			soma += soma + vetor[i]; //ele vai somando cada valor do vetor
		}
		
		double media = soma / n; //crio a variavel media que divide o valor total de soma por n
		
		System.out.println("VALORES: "); //crio um print para informar os valores
		
		for(int i = 0; i < n; i++) { //crio o terceiro for para imprimir os valores digitados
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma); //imprimo soma
	    System.out.printf("MEDIA = %.2f\n", media); //imprimo a media
		*/
		/*Programa que ler nome/idade/altura de n pessoas, depois mostrar altura media e porcentagem das pessoas com -16
		
		
		System.out.println("Quantas pessoas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] vetor = new Pessoa[n]; //Crio o vetor na classe pessoa
		
		for (int i = 0; i < n; i++ ) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.println("nome: ");
			String nome = sc.nextLine();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			vetor[i] = new Pessoa(nome, altura, idade);
			sc.nextLine();
		}
		
		double alt = 0.0;
		double menor = 0.0;
		
		for(int i = 0; i < n; i++ ) {
			
			 alt += vetor[i].getAltura();
			 if (vetor[i].getIdade() < 16) {
			 menor ++; //adiciona os de menor a variavel porc
		}
		}

		
		double md = alt / n;
		double porc = ((double) menor / n) * 100;
		System.out.printf("Altura media:%.2f%n", md);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n ", porc);
		
		for(int i = 0; i < n; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.printf("%s\n", vetor[i].getNome());
			}
		}
		*/
		/*Numeros pares com vetor
		
		System.out.println("Quantos números voê vai digitar? "); //Peço a quant. de valores
		int n = sc.nextInt(); //crio a variavel e acoplo nela o valor digitado
		
		int vetor[] = new int[n];//crio o vetor como int e acoplo seu tamanho n
		
		int t = 0; //Crio uma variável para todos os valores pares
		for(int i = 0; i < n; i++) { //laço principal
			System.out.println("Digite um número: "); //Peço os números
			vetor[i] = sc.nextInt(); //pega os valores e põe no vetor
		}
		
		System.out.println("Números pares: "); //imprimos que vou informar os números pares
		for(int i = 0; i < n; i++) { // laço secundario
		if( vetor[i] % 2 == 0) { //faço um condicional para encontrar os valores pares
			System.out.printf("%d\n", vetor[i]); //imprimo os valores
			t++; //adiciono os mesmos na variavel t de mais cedo
		}}
		System.out.println("Quantidade de pares = " + t); //Imprimo a quantidade total dos valores par
		
		*/
		/*Maior valor e sua posição
		
		System.out.println("Quantos números você vai digitar? "); // Peço a quantidade de valores
		int n = sc.nextInt(); //adiciono elas a variavel n
		
		double[] vetor = new double[n]; //Crio um vetor double e adiciono a ele o tamanho do vetor n
		
		int p = 0; //variavel de posição
		double maior = 0.0;//variavel de maior
		for(int i = 0; i < n; i++) { //loop para verificar os valores
			System.out.println("Digite um numero: "); //peço os valores
			vetor[i] = sc.nextDouble(); //adiciono no vetor
			if(vetor[i] > maior) { //condicional para descobrir o maior
				maior = vetor[i]; //adiciono o valor na variavel maior
				p++; //a cada entrada na variavel adiciono 1 no p
			}
		}
		System.out.println("MAIOR VALOR = " + maior); //imprimo o maior
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + p); //imprimo a posição dele
		*/
		/*soma de vetores
		
		System.out.println("Quantos valores serão digitados nos vetores? "); //peço a quantidade
		int n = sc.nextInt(); //acoplo na variavel n
		
		int[] v1 = new int[n]; //crio o primeiro vetor
		int[] v2 = new int[n]; //crio o segundo vetor
		int[] v3 = new int[n]; //crio o terceiro vetor que fará a soma
		
		//Laço vetor 1
		System.out.println("Digite os valores do vetor A: "); //Antes do loop faço o pedido dos valores(FOra do loop para nao ficar se repetindo)
		for(int i = 0; i < n; i++) {//inicio
			v1[i] = sc.nextInt();//acoplamento dos valores no vetor
		}
		//Laço vetor 2
		System.out.println("Digite os valores do vetor B: "); //repito com o vetor2
		for(int i = 0; i < n; i++) {
			v2[i] = sc.nextInt();
		}
		//Laço vetor 3 para soma
		for(int i = 0; i < n; i++) { //inicio
			v3[i] = v1[i] + v2[i]; //somo os vetores 1 e 2, observe que uso vetor[i], para pegar cada valor em n separadamente
		}
		
		System.out.println("Valor resultante: ");//informo fora do ultimo loop que irei mostrar a soma
		//laço final
		for(int i = 0; i < n; i++) {
			System.out.printf("%d\n", v3[i] ); //imprimo valor por valor de v3(Note o uso novamente de vetor[i])
		}
		*/
		/*Problema abaixo da media
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double v = 0;
		
		for(int i = 0; i < n; i++) {
			v += vetor[i];
		}
		
		double m = v / n;
		System.out.println("MEDIA DO VETOR = " + m);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for( int i = 0; i < n; i++) {
			if (vetor[i] < m) {
				System.out.println(vetor[i]);
			}
		}
		*/
		/*MEDIA PARES
		
		System.out.println("Quantos elementos vai tero o vetor? ");
		int n = sc.nextInt();
		
		double[] vet1 = new double[n];
		int p = 0, v = 0;

	
		for(int i = 0; i < n; i++) {
				System.out.println("Digite um número: ");
				vet1[i] = sc.nextDouble();
				if(vet1[i] % 2 == 0) {
					v += 1;
					p += vet1[i];
				}
			}
		
		if( p == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		else {
			double m = p / v;
			System.out.println("Media dos pares = " + m);
		}
	*/
		/*Pessoa mais velha
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idad = new int[n];
		int maior = 0;
		int p = 0;
		for( int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("Idade: ");
			idad[i] = sc.nextInt();
			if(idad[i] > maior) {
				maior = idad[i];
				p = i;
				}
				}
		System.out.println("PESSOA MAIS VELHA: " + nome[p]);
		*/
		/*Aprovados
		
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];

		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			nome[i] = sc.next();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < n; i++) {
			if((n1[i] + n2[i])/2 > 6) {
				System.out.printf("%s%n", nome[i]);
		}}
		*/
		//Dados e pessoas
		
		System.out.println("Quantas pessoa serao digitadas? ");
		int n = sc.nextInt();
		
		double[] alt = new double[n];
		char[] gen = new char[n];
		
		double maior = 0, m = 0, qm = 0;
		int qh = 0;
		
		for( int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + "a pessoa:");
			alt[i] = sc.nextDouble();
			System.out.println("Genero da " + (i + 1) + "a pessoa:");
			gen[i] = sc.next().charAt(0);
		}
			
		double menor = alt[0];
		for(int i = 0; i < n; i ++) {	
			if(alt[i] > maior) {
				maior = alt[i];			
			}
			if(alt[i] < menor) {
				menor = alt[i];
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			if(gen[i] == 'm') {
				qh++;
			}
			else {
				qm++;
				m += alt[i];
			}
		}
		
		double media = m/ qm;
		
		System.out.printf("menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + qh);
		
		sc.close();
	}

}
