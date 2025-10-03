package cursojava;
import java.util.Scanner;
public interface EXERCICIOS_FOR {
	public static void main( String[] args) {
	
	Scanner sc = new Scanner(System.in);
	/*EXERCICIO 1

	
	System.out.println("Qual o valor? "); //peço o valor de x
	int x = sc.nextInt(); //crio a variavel x para receber o valor
	
	int impar;
	for(int i=0; i <= x; i++) { //faço a 
	impar = i % 2;//faço o calculo de verificação se i é impar
	if( impar == 1)//verifico s o resto é igual a 1, logo i será impar
		{
			System.out.println(i);//imprimo i e reinicio o loop
		
	}
	
	}*/
	/* EXERCICIO 2
	
	System.out.println("Quantos valores vai digitar? ");//pergunto quantos digitos serão
	int N = sc.nextInt(); // entrego para a variavel N
	
	int x, in = 0, out = 0; // DECLARO COMO INTERIRAS AS VARIAVEIS Q SERÃO USADAS
	
	for(int i = 1; i <= N; i++) { // FAÇO O LOOP
		
		System.out.println("Qual o valor de x? ");// QUESTIONO O VALOR DO PRIMEIRO X
		x = sc.nextInt(); // ACOPLO O VALOR
		
		if( x >= 10 && x <= 20) {//CRIO A CONDIÇÃO
			in += 1; // SOMO O VALOR	
		}
		else {// A EXEÇÃO
			out += 1;// SOMO O VALOR
		}
			
	}
	System.out.println( in + " in");//PRINTO QUEM TA DENTRO LAELE
	System.out.println(out + " out");// PRINTO QUEM TA FORA
	
	*/
	/* EXERCICIO 3
	System.out.println("Quantos casos serão? ");
	int n = sc.nextInt(); // salvo o limite de loop
	double m, a, b, c; //variaveis que serão usadas
	
	for(int i = 0; i < n; i++ ) {//loop
		
			System.out.println("Quais os valores para a media ? ");// peço os valores
			a = sc.nextDouble(); // a recebe primeiro valor
			b = sc.nextDouble(); // b recebe segundo valor
			c = sc.nextDouble(); // c recebe terceiro valor
			
		
			
			m = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0; // executo a media
			System.out.printf("%.1f%n", m); // printo valor final
			
	}
*/
	/*EXERCICIO 4
	int n; // DECLARO A VARIAVEL DA QUANTIDADE DE LOOP
	double a, b, vt; // DECLARO A VARIAVEL QUE VAI RECEBER OS VALORES
	
	System.out.println("Quantas divisões? "); // PEÇO A QUANTIDADE
	n = sc.nextInt(); // NEXTINT PRA LER O TECLADO
	
	for(int i = 0; i < n; i++) {// FAÇO O LOOP
		
		System.out.println("Quais os valores? "); // PEÇO OS VALORES DO LOOP
		a = sc.nextDouble(); // PRIMEIRO VALOR NA VARIAVEL A
		b = sc.nextDouble(); // SEGUNDO VALORE NA VARIAVEL B
		
		if( b == 0) { // PONHO A CONDIÇÃO PARA DIVISÃO IMPOSSIVEL CASO O SEGUNDO NUMERO SEJA 0
			System.out.println("Divisão impossivel"); //PRINTO
		}
		else { //AI PONHO A EXEÇÃO
			vt = a / b; // FAÇO A DIVISÃO
			System.out.printf("O valor da divisão é: %.1f%n", vt); PRINTO A MESMA
		}
	}
	*/
	/*EXERCICIO 5
	
	int n, f = 1;
	System.out.println("Qual o valor: ");
	n = sc.nextInt();
	
	for(int i = 1; i <= n; i++) {
		f *= i;
	}
	
	System.out.println(f);
	*/
	/*EXERCICIO 6
	
	int n; // declaro n
	
	System.out.println("Qual o valor: "); //peço o valor
	n = sc.nextInt();//agrego o valor na variavel n
	
	for(int i = 1; i <= n; i++) { // faço o for
		
		if(n % i == 0) { //Crio a condição para pegar apenas os valores diviseis de n a cada i
			System.out.println(i); //pego todos os i que atenderam a condição
		}
		
	}
	*/
	
	/*EXERCICIO 7
	
	int n, i2, i3;
	
	System.out.println("Me de um número: ");
	n = sc.nextInt();
	
	for(int i = 1; i <= n; i++) {
		i2 = i * i;
		i3 = i * i * i;
		System.out.printf("%d %d %d%n", i, i2, i3 );
	}
	*/
	sc.close();
}
}