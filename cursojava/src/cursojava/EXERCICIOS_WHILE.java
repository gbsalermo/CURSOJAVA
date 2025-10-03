package cursojava;
import java.util.Scanner;

public interface EXERCICIOS_WHILE {
	public static void main(String[] args ) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/* EXERCICIO 1 -  WHILE
		 * int s = sc.nextInt(); // declaro a variavel s que vai receber o dado
		
		
		while(s != 2002) {//coloque dentro de um loop que é acessado caso o valor seja diferente de 2002
			
	
			System.out.println("Senha invalida");//ao entrar no loop é informado que a senha está invalida
			s = sc.nextInt(); //peço novamente um valor e reinicio o loop
		}
		System.out.println("Senha correta"); //informo senha correta caso o valor digitado seja 2002
		
		
		
		sc.close();
		
		*/
		
		/* EXERCICIO 2 - 
		int x, y;
		
		System.out.println("Qual o valor x? ");
		x = sc.nextInt();
		System.out.println("Qual o valor y? ");
		y = sc.nextInt();
		
		while (x != 0) {
			if( x > 0 && y > 0) {
				System.out.println("primeiro");
				System.out.println("Qual o valor x? ");
				x = sc.nextInt();
				System.out.println("Qual o valor y? ");
				y = sc.nextInt();
			}
			else {
				if(x > 0 && y < 0) {
					System.out.println("quarto");
					System.out.println("Qual o valor x? ");
					x = sc.nextInt();
					System.out.println("Qual o valor y? ");
					y = sc.nextInt();
				} 
				
			else {
				if(x  < 0 && y < 0) {
					System.out.println("terceiro");
					System.out.println("Qual o valor x? ");
					x = sc.nextInt();
					System.out.println("Qual o valor y? ");
					y = sc.nextInt();
				}
			else {
				if(x < 0 && y > 0) {
			    	System.out.println("segundo");
			    	System.out.println("Qual o valor x? ");
					x = sc.nextInt();
					System.out.println("Qual o valor y? ");
					y = sc.nextInt();
				}
		}
			}
				
				sc.close();
	}
}*/
		
		//EXERCICIO 3
		
		int alc = 0, gas = 0, die = 0, d = sc.nextInt();
		
		while (d != 4) {
			
			
			if( d == 1) {
				alc = alc + 1;
			}
			else if (d == 2) {
				gas = gas + 1;
			}
			else if(d == 3) {
				die = die + 1;
					}
			
				d = sc.nextInt();
	}
			
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool:" + alc);
			System.out.println("Gasolina: " + gas);
			System.out.println("Diesel: " + die);
			
			sc.close();
}
}
			
		
	
