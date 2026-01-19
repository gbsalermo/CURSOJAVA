package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//import Entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/* Teste set simples
		//Set<String> set = new HashSet<>();
		//O HashSet não garante a ordem, ele só é mais rapido
		//Set<String> set = new TreeSet<>(); //No caso dele já ordena as Strings
		Set<String> set = new LinkedHashSet<>(); //mantem a ordem que os elementos são adicionados
		
		
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		/*Test remove
		//set.remove("tablet");
		
		//teste removeIf
		set.removeIf(x -> x.length() >= 3); //Aqui removo todo elemento com mais ou igual a 3 caracteres
		
		
		//System.out.println(set.contains("Notebook")); //Aqui peço para verificar se set contem notebook
		
		for (String p : set) {
			System.out.println(p);
		}
		*/

		//Teste 2 set
		
		//Uso Arrays.asList para integrar valores fixos na lista
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b); //Faço a uniao do conjunto c com o b
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); //Aqui o d(que recebe a lista a) vai permanecer apenas os elementos semelhantes da lista b
		System.out.println(d);
		
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); //Removo do conjunto e todo mundo que ta no conjunto b 
		System.out.println(e);
	
	
	
	}

}
