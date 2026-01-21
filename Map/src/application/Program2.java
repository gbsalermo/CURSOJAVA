package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program2 {
	
	public static void main(String[] ags) {
		
		
		//Quanto de estoque tem de um produto
		Map<Product, Double> estoque = new HashMap<>();
		
		Product p1 = new Product("tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("tablet", 400.0);

		//Quantidade no esqtoque de cada um
		estoque.put(p1, 10000.0);
		estoque.put(p1, 20000.0);
		estoque.put(p1, 15000.0);
		
		
		Product ps = new Product("tv", 900.0);
		System.out.println("Contains 'ps' key: " + estoque.containsKey(ps));
		
		
		
		
	}

}
