package application;

import java.util.Scanner;

import services.PrintServiceGeneric;

public class Program {

	//O problema do object é que ele não consegue converter de um tipo para outro, necessario um casting
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Chamo a classe PrintService ou PrintService2 com object
		//Com o Generic
		//PrintServiceGeneric ps = new PrintServiceGeneric(); Instanciação sem o generic
		PrintServiceGeneric<Integer> ps = new PrintServiceGeneric<>(); //Instanciação com o generic
		//Nesse caso não preciso mexer na classe posso realizar a mudança dentro do Program
		
		
		//Peço a quantidade de valores
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		//Crio o for para adicionar valores
		for( int i = 0; i < n; i++) {
			int value = sc.nextInt();
			//add no na classe
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		
		
		
		
		
		
		sc.close();

	}

}
