import java.util.Scanner; //IMPORTO A BIBLIOTECA PARA A ENTRADA DE DADOS
import java.util.Locale;//IMPORTA A BIBLIOTECA DE LOCALIDADE

public interface EXERCICIOS_SEÇÃO4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);//CRIO O SCANNER QUE VAI SER USADO
		/* EXERCICIO 1 - SEÇÃO 4
		int x, y, s; // DECLARO O TIPO DAS VARIAVEIS
		
		x = sc.nextInt(); // USO O sc.nextInt() PARA A ENTRADA DE DADOS NAS VARIAVEIS
		y = sc.nextInt();
		
		s = x + y; // realizo a soma
		
		System.out.println("SOMA = " + s); // Realizo a saida da soma a partir da entrada de dados
		
		
		sc.close(); // fecho o scanner
		
		*/
		
		/*EXERCICIO 2 - SEÇÃO 4
		
		//Scanner sc = new Scanner (System.in); //CRIO O SCANNER QUE VAI SER USADO
		
		double r, a, pi = 3.14159; // DECLARO AS VARIAVEIS
		
		System.out.println("Digite o raio: ");
		r = sc.nextDouble(); // FAÇO O PREDIDO DAS VARIAVEIS
		a = pi * (Math.pow(r, 2));
		
		System.out.printf("A = %.4f%n", a);
		
		sc.close();*/
		
		/*EXERCICIO 3 - SEÇÃO 4
		
		// Scanner sc = new Scanner (System.in);// Crio o Scanner que vai ser usado
		
		int a, b, c, d;
		
		System.out.println("Qual o valor de A? ");
		a = sc.nextInt();
		System.out.println("Qual o valor de B? ");
		b = sc.nextInt();
		System.out.println("Qual o valor de C? ");
		c = sc.nextInt();
		System.out.println("Qual o valor de D? ");
		d = sc.nextInt();
		
		System.out.println("DIFERENÇA = " + (a * b - c * d));
		
		sc.close(); */
		
		/*/EXERCICIO 4 - SEÇÃO 4
		
		// Scanner sc = new Scanner (System.in);
		
		int n, h;
		double s ;
		
		System.out.println("Qual o número do funcionario? ");
		n = sc.nextInt();
		System.out.println("Quantas horas ele trabalhou? ");
		h = sc.nextInt();
		System.out.println("Qual o valor da hora? ");
		s = sc.nextDouble();
		
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = %.2f%n ", (h * s));
		
		
		
		sc.close(); */
		
		//EXERCICIO 5 - SEÇÃO 4
		
		// Scanner sc = new Scanner (System.in);
		
		/*int p1, n1, p2, n2;
		double v1, v2;
		
		System.out.println("Qual o codigo da primeira peça e da segunda peça ? ");
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		System.out.println("Quantas peças da primeira? " );
		n1 = sc.nextInt();
		System.out.println("Quantas peças da segunda? " );
		n2 = sc.nextInt();
		System.out.println("Qual o valor unitario da primeira? ");
		v1 = sc.nextDouble();
		System.out.println("Qual o valor unitario da segunda? ");
		v2 = sc.nextDouble();
		System.out.printf("VALOR A PAGAR: R$%.2f%n", (n1 * v1 + n2 * v2));
		
		
	
		sc.close();*/
		
		//EXERCICIO 6 - SEÇÃO 4
		
		// Scanner sc = new Scanner (System.in);
		
		double a, b, c, pi;
		
		pi = (double) 3.14159;
		
		System.out.println("Qual o primeiro valor? ");
		a = sc.nextFloat();
		System.out.println("Qual o segundo valor? ");
		b = sc.nextFloat();
		System.out.println("Qual o terceiro valor? ");
		c = sc.nextFloat();
		System.out.printf("TRIANGULO = %.3f%n", (a * c) / 2 );
		System.out.printf("Circulo = %.3f%n", pi * ( c * c) );
		System.out.printf("TRAPEZIO = %.3f%n", (a + b) * c / 2);
		System.out.printf("QUADRADO = %.3f%n", b * b);
		System.out.printf("RETANGULO = %.3f%n ", a * b);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}   
