package cursojava;
import java.util.Scanner;
public interface EXERCICIOS_IFELSE {
	
	public static void main(String[] args) {

	//Scanner sc = new Scanner (System.in);
	//int x, y;
	
	/*System.out.println("Digite o número"); //PEÇO O NUMERO
	x = sc.nextInt(); //X RECEBE VALOR DIGITADO
	
	if (x < 0) { // USO O IF PARA A CONDIÇÃO
		System.out.println("NEGATIVO");
		}
	else { // ELSE CASO A CONDIÇÃO NÃO TENHA SIDO ATENDIDA
		System.out.println("NÃO NEGATIVO");
	}
	*/
	
	/* par ou impar
	 * 
	System.out.println("Digite o número: ");
	x = sc.nextInt();
	
	if (x % 2 == 0 ) {
		System.out.println("PAR");
	}
	else {
		System.out.println("IMPAR");
	}*/
	
	/*NUMEROS MULTIPLOS
	 * 
	System.out.println("Digite o primeiro número: ");
	x = sc.nextInt();
	System.out.println("Digite o segundo número: ");
	y =  sc.nextInt();
	
	if ( x % y == 0 || y % x == 0) {
		System.out.println("MULTIPLOS");
	}
	else {
		System.out.println("NÃO SÃO MULTIPLOS");
	}
	*/
	
/* produtos
	Scanner sc = new Scanner (System.in);
	int cd;
	Double t, qt;
	
	
	System.out.println("Qual o codigo do item? ");
	cd = sc.nextInt();
	System.out.println("Qual a quantidade? ");
	qt = sc.nextDouble();
	
	if(cd == 1) {
		
		t = 4.00 * qt;
		System.out.printf("TOTAL: R$%.2f%n", t );
	}
	else {
	if(cd == 2) {
		t = 4.50 * qt;
		System.out.printf("TOTAL: R$%.2f%n", t);
	}
	else {
	if(cd == 3) {
		t = 5.00 * qt;
		System.out.printf("TOTAL: R$%.2f%n", t);
			}
	else {
		if(cd == 4) {
			t = 2.00 * qt;
			System.out.printf("TOTAL: R$%.2f%n", t);
		}
	else {
		if(cd == 5) {
			t = 1.50 * qt;
			System.out.printf("TOTAL: R$%.2f%n", t);
		}
	}

		}
		}
	}
	
	*/

		/*INTERVALO
		
		Scanner sc = new Scanner (System.in);
		Double n;
		
		System.out.println("Qual o valor? ");
		n = sc.nextDouble();
		
		if(n >= 0 && n <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else {
		if(n > 25 && n <= 50) {
			System.out.println("INTERVALO [25,50]");
		}
		else {
		if(n > 50 && n <= 75) {
			System.out.println("INTERVALO [50,75]");
		}
		else {
		if(n > 75 && n <= 100) {
			System.out.println("INTERVALO [75,100]");
		}
		else {
			System.out.println("FORA DO INTERVALO");
		}
		}
		}
		}*/
		/*CALCULO DE HORAS

		
	Scanner sc = new Scanner (System.in);
	
	int h1, h2, t;
	
	System.out.println("QUAL A HORA INICIAL? ");
	h1 = sc.nextInt();
	System.out.println("QUAL A HORA FINAL? ");
	h2 = sc.nextInt();
	if( h1 == h2) {
		System.out.println("O JOGO DUROU 24 HORA(S)");
	}
	else {
		if( h2 < h1) {
			t = (h2 + 24) - h1;
			System.out.println("O JOGO DUROU " + t + " HORA(S)");
		}
	else {
		t = h2 - h1;
		System.out.println("O JOGO DUROU " + t + " HORA(S)");
	}
			
	}
	*/
	
	/*plano cartesiano
		
		Scanner sc = new Scanner(System.in);
		
		Double x, y;
		
		System.out.println("QUAL A COORDENADA X: ");
		x = sc.nextDouble();
		System.out.println("QUAL A COORDENADA Y: ");
		y = sc.nextDouble();
		
		if( x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else {
			if(x > 0 && y < 0) {
				System.out.println("Q4");
			}
		else {
			if(x  < 0 && y < 0) {
				System.out.println("Q3");
			}
		else {
			if(x < 0 && y > 0) {
		    	System.out.println("Q2");
			}
		else {
				System.out.println("ORIGEM");
				}
			}
			}
		}*/
		
	//IMPOSTO DE RENDA
		
	Scanner sc = new Scanner (System.in);
	
	Double r, i1, i2, i3;
	
	
	System.out.println("Qual o seu salario?");
	r = sc.nextDouble();
	

	i1 = 1000 * 0.08;
	i2 = (r - 3000) * 0.18 + 1000 * 0.08;
	i3 = (r - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
	
	if(r <= 2000) {
		System.out.println("ISENTO");
	}
	else{
		if( r > 2000 && r <= 3000) {
			
			System.out.printf("R$%.2f%n", i1);
		}
		else {
			if(r > 3000 && r <= 4500) {
				
				System.out.printf("R$%.2f%n", i2);
			}
			else {
				if(r > 4500) {
					System.out.printf("R$%.2f%n", i3);
					
				}
			}
			sc.close();
		}
		
	}
	
	
	
	
	
	
	
	}
}
