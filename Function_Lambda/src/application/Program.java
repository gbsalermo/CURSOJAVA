package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.50));
		
		//Implementando interface
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//Metodo estatico
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		//Metodo não estatica
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Expressão lambda declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());

		//Expressao lambda não declarada
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		
		//Percorrer a lista e imprimo com forEach
		names.forEach(System.out::println);
		
	}

}
