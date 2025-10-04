package Principal;

import java.util.Scanner;
import Entities.Produto;

public interface Programa {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos produtos vão ser? ");
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		//for (int i = 0; i < n; i++) { // FOR PADRÃO
		for (int i=0; i<vetor.length; i++) { //aqui eu uso o .length ao invés do n, pois o vetor sabe o seu proprio tamanho
			//posso aplicar o .length no lugar de quaisquer N abaixo
			sc.nextLine();//quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vetor[i] = new Produto(name, price); //o vetor vai apontar pro nome e preço, instanciando nome e preço tbm
		}
		
		//agora a media dos preços
		
		double som = 0.0;
		for (int i = 0; i < n; i++) {
			som += vetor[i].getPrice(); // uso o get.price para pegar o preço, o vetor[i] vai em cada valor guardado do 0 a N
		}
		double avg = som / vetor.length; //uso do length novamente para exemplo
		
		System.out.printf("Media do preço: %.2f%n", avg);
		
		sc.close();
	}

}
