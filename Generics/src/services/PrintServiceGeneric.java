package services;

import java.util.ArrayList;
import java.util.List;

//Pro PrintService ser generic add o T(Ou type, outra coisa), ficando PrintService<T>
public class PrintServiceGeneric<T> {

	
	//Crio uma Lista 
	
	List <T> list = new ArrayList<>();
	
	//Um metodo addValue
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
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


