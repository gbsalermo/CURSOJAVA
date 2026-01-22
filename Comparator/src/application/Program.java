package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		/*Uso o sort que ordena os elementos e o coparator,
		que define os criterios dessa ordenação
		list.sort(new MyComparator());
		*/
		
		/*Comparator dentro do main, Classe anonima
		 * 
		 * Comparator <Product> comp = new Comparator<Product>(){
		 * 
		 * @Override
		 * public int compare(Product p1, Product p2){
		 * return p1.getName().toUpperCase().compareTo(p2.getname().toUpperCase());
		 * };
		 */
		/* Lambda 1
		 * 
		 * Comparator <Product> comp = (p1, p2) -> {
		 * return p1.getName().toUpperCase().compareTo(p2.getname().toUpperCase());
		 * };
		 */
		/* Lambda 2
		 * Comparator<Product> comp = (p1, p2) ->
		 * p1.getName().toUpperCase().compareTo(p2.getname().toUpperCase());
		 * 
		 * Observe que não precisa do return nesse caso
		 */
		//Lambda 3
		//Muito mais enxuta
		list.sort((p1, p2) ->
		p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		//Crio o for para a impressão dos elementos
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
