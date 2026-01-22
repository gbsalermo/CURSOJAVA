package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.50));

		//Remove com lambda
		//list.removeIf(p -> p.getPrice() >= 100);
		
		//Remove com a interface funcional predicate
		//list.removeIf(new ProductPredicate());
		
		//Remove com a referencia predicate na classe Product
		list.removeIf(Product :: staticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
