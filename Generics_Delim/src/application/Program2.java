
package application;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Main referente a generics curingas
 */
public class Program2 {

	public static void main(String[] args) {
	
		/*Entendo dendo generics curinga
		 * Ele da um erro pois não é possivel uma lista de object receber uma lista de Integer
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
	
		//Usa-se então a interrogação que é um tipo curinga
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
			*/
		
		//Exemplo de metodos com tipos curinga, onde podemos receber um gererico de qualquer tipo
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		}
	
		public static void printList(List<?> list) {
		for (Object obj : list) {
		System.out.println(obj);
		
		//list.add(3); Não consigo adicionar de forma direta na lista, pois dá erro de compilação
		}
		
	}

}
