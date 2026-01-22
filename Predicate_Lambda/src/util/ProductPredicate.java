package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	//Aqui ponho a regra dos items que serao excluidos
	@Override
	public boolean test(Product p) {

		return p.getPrice() >= 100.0;
	}
	

}
