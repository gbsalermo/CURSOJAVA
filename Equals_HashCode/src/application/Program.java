package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		/*Ex Equals
		
		String a = "maria";
		String b = "Alex";
		
		System.out.println(a.equals(b)); //Compara se é ou não igual
		*/
		/*Hashcode
		//O objeto gerado pelo hashCode sempre vai ser igual, não tem como objetos diferentes gerarem codigos iguais
		String a = "maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		*/
		//Teste com classe
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		System.out.println(c1 == c2); //O == compara as referencias dos objetos nas memorias
		//Por isso utiliza-se os equals na comparação de conteudos;


	}

}
