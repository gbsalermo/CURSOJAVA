package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {
	
	/*Essa é um interface funcional, ela tem apenas um metodo,
	 * Que neste caso é o compare 
	 */
	
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
