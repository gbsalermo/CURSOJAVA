package APLICAÇÃO;
import java.util.Locale;
import java.util.Scanner;
import util.retangulo;;

public class PRINCIPAL {
	public static void main(String[] ags) {

		//Programa focado no calculo de area, perimetro e diagonal de um retangulo
		
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); //faço o scanner para receber os valores
		retangulo x; //declaro x como retangulo
		
		x = new retangulo(); // crio o objeto
		
		System.out.println("Qual a largura? "); //Peço a largura
		 x.l = sc.nextDouble(); // ponho o valor em l que declarei na classe retangulo
		System.out.println("Qual a altura? "); //Peço a altura
		 x.a = sc.nextDouble(); //Ponho o valor em a que declarei na classe retangulo
		
		double a = x.area(); //uso a variavel a para salvar o valor da area
		double p = x.pm(); //uso a variavel p para salvar o valor do perimetro
		double d = x.dg(); //uso a variavel d para salvar o valor da diagonal
		
		//Imprimo tudo
		System.out.printf("Area = %.2f%n", a);
		System.out.printf("Perimetro = %.2f%n", p);
		System.out.printf("DIAGONAL = %.2f%n", d);
		
		
		
		
		
		
		sc.close();
		
	}

}
