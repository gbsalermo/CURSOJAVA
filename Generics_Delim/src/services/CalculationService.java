package services;

import java.util.List;

import entities.Product;

public class CalculationService {
	//Operação static então não preciso instanciar ela
	//<T extends Comparable> para usar o Comparable na função que verifica o maior
	public static <T extends Comparable<T>> T max(List<T> list) { //ela recebe uma lista de inteiros
		
		//Programação defensiva caso a lista seja vazia
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		//Forma de achar o maior de uma lista
		//Variavel max que recebe o primeiro elemento da lista
		T max = list.get(0);
		
		for (T item : list) {
			//comparo se cada item é maior que max e maior que zero
			if(item.compareTo(max) > 0) {
			max = item; // se for max recebe item
		}
		}
		return max;
		
	}

}
