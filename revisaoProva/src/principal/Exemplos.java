package principal;

import java.util.Scanner;
import Exemplo.Triangulo;

public class Exemplos {

	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		//////Exemplo 1 - retangulo
		
		
		Triangulo x, y; //Crio o tipo triangulo que vai usar os atributos
		
		x = new Triangulo();
		y = new Triangulo();
		
		//para x
		System.out.println("Qual o lado a?");
		x.a = sc.nextDouble();
		System.out.println("Qual o lado b?");
		x.b = sc.nextDouble();
		System.out.println("Qual o lado c?");
		x.c = sc.nextDouble();
		//para y
		System.out.println("Qual o lado a?");
		y.a = sc.nextDouble();
		System.out.println("Qual o lado b?");
		y.b = sc.nextDouble();
		System.out.println("Qual o lado c?");
		y.c = sc.nextDouble();
		
		
		//instancio o metodo
		double areaX = x.area();
		double areaY = y.area();
		
		//Printo o calculo do metodo
		System.out.printf("A area de x é: ", areaX);
		System.out.printf("A area y é: ", areaY);
		
		
		sc.close();
		
	}
}
