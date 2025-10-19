package Principal;

import java.util.Scanner;
import Entities.Produto; //produto

public interface Programa {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		/* teste produto com vetor
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
	}*/

		/*Boxing, unboxing e wrapper classes
		
		//Ex. Boxing
		
		int x = 20; //Crio a variavel no Stack
		
		Object obj = x; //Passo o valor de x para o Heap "Encaixotando ele
		
		System.out.println(obj); //impressão do valor de obj
		
		//Ex. Unboxing
		
		
		Object obj1 = x; //Criei outro objeto
		
		int y = (int) obj1; //passo ele para a variavel y qye esta no Stack
		
		//Ex. Wrapper
		
		Integer obj2 = x; //N preciso declarar como objeto e posso declarar direto como int com o integer
		
		int z = obj2; //nesse caso nao preciso declarar (int) antes do obj 2
		*/
		
		/*Ex. for each
		
		String[] vect = new String[] {"Maria", "Bob","Alex"}; //Ja instancio os valores
		
		//for normal
		for( int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//agora laço for each
		
		//Esse laço se ler: Para cada objeto obj contido no vetor vect faça(no caso ta imprimindo)
		for(String obj : vect) {
			System.out.println(obj);
		}
		
		*/
		
		sc.close();		
}
}
