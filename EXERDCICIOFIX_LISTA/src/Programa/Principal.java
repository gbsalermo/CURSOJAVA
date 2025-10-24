package Programa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import util.funcionario;

public class Principal {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
	/*EXERCICIO LISTA
		System.out.println("Quantos funcionarios? ");
		int n = sc.nextInt();
		
		//Lista funcionario
		List<funcionario> list = new ArrayList<>(); //Crio a lista 
		
		for ( int i=0; i<n; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":" );
			System.out.println("id: ");
			Integer id = sc.nextInt(); //Uso o Integer como aprendido em wrapper
			while(hasId(list, id)) {
				System.out.println("Id existente! Tente novamente:");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			sc.nextLine(); //limpar a entrada de dados
			String name = sc.nextLine(); //Faço o mesmo com o String
			System.out.println("Salario: ");
			Double salario = sc.nextDouble();//O mesmo no double
			
			funcionario fun = new funcionario(id, name, salario); //Crio o objeto funcionario(fun)
			
			list.add(fun); //Adiciono o objeto na lista
		}
		
		System.out.println("Qual o funcionario que vai ter acressimo(Digite o id): ");
		int idsal = sc.nextInt(); //guardo o id
		Integer pos = position(list, idsal);
		if (pos == null) {
			System.out.println("esse id não existe");
		}
		else {
			System.out.println("Qual a porcentagem: ");
			double porcento = sc.nextDouble();
			list.get(pos).increaseSalario(porcento); //Aqui faço o calculo de porcentagem
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for(funcionario fun: list) {
			System.out.println(fun);
		}
		
	*/	
		
	//EXERCICIO MATRIZ
	
		int n = sc.nextInt(); //receber um inteiro
		int[][] mat = new int[n][n]; //O int[][] demonstra que é uma matriz
		
		//Como a matriz mat recebe n, posso trocar o n da linha nos for pelo mat.length
		//Ex. for(int i = 0; i < mat.lenght; i++) { 
		for(int i = 0; i < n; i++) { //for para cada Linha
			//Ja no caso de coluna posso por no lugar de n mat[i].length
			//Ex. for (int j = 0; j <mat[i].length; j++) {
			for (int j = 0; j <n; j++) {//for para cada coluna
				mat[i][j] = sc.nextInt(); //aqui informo o que cada um vai receber
			}
			}
		
		System.out.println("Diagonal principal: ");
		for( int i = 0; i<n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Numeros negativos = " + count);
		
		sc.close();
		
	}

	/*Crio uma função auxiliar para buscar o funcionario
	
	public static Integer position(List<funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) { //uso o list.size() Como N aqui
			if( list.get(i).getId() == id) { //Aqui eu uso list.get(i) para pegar a posição e dps getId() para pegar o valor de id nessa posição e comparo com o id fornecido
				return i;
			}
		}
		return null;
	}
	//função auxiliar para confirmar se não ja existe o id
	public static boolean hasId(List<funcionario> list, int id) {
		funcionario fun = list.stream().filter(x -> x.getId() == id). findFirst().orElse(null);
		return fun != null;
	}*/
	
}
