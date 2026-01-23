package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		/*Ex. Streams
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//Stream a partir de uma coleção
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray())); //O toArray transforma a steam em vetor
		
		//Stream.of
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Stream iterate
		//Aqui eu digo qual o primeiro valor da stream e dou uma função
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);//A função do caso vai ser ficar somando 2
		System.out.println(Arrays.toString(st3.limit(10).toArray())); //aqui ponho um limite de 10
		
		
		//Exemplo fibonachi
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
*/
		
		//PIPELINE
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Reduce, ele pega o elemento inicial e depois uma função com dois argumento, no caso com soma
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		
		List<Integer> newList = list.stream()
		.filter(x -> x % 2 == 0) //Filter serve para filtrar a lista, no caso pega apenas os numeros pares
		.map(x -> x * 10) //Uso o map para pegar cada elemento e multiplicar por 10, gerando uma nova stream
		.collect(Collectors.toList()); //Uso o collect para transformar a nova stream em lista
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
