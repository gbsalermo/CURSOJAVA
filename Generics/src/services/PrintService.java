package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	
	//Crio uma Lista Integer
	
	List <Integer> list = new ArrayList<>();
	
	//Um metodo addValue
	
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() {
		//Um if de erro para caso a lista esteja vazia
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		//Chamo o primeiro valor da lista
		return list.get(0);
	}
	//Crio um print
	
	public void print() {
		System.out.print("[");
		//Se ela tiver pelo menos um elemento
		if(!list.isEmpty()) {
			System.out.print(list.get(0)); //imprimo primeiro elemento
		}
		//Aqui é para o segundo elemento em diante
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

}
