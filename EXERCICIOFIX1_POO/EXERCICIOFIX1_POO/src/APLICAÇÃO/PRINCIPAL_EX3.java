package APLICAÇÃO;
import java.util.Scanner;
import util.ESTUDANTE;
public class PRINCIPAL_EX3 {
	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		ESTUDANTE a = new ESTUDANTE(); //CRIO UM NOVO OBJETO ESTUDANTE
		
		//Peço os valores e o nome, adicionando eles as variaveis na classe
		System.out.println("Nome? ");
		name = sc.nextLine();
		System.out.println("Nota 1? ");
		a.x = sc.nextDouble();
		System.out.println("Nota 2?");
		a.y = sc.nextDouble();
		System.out.println("Nota 3?");
		a.z = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", a.media()); // informo o valor da media
		
		if(a.media() < 60) { //faço a condição principal caso tenha perdido
			System.out.println("FALHOU");
			System.out.printf("PRECISA DE: %.2f PONTOS%n", a.media());
			
		}
		else { //Se não, é sucesso
			System.out.println("PASSOU");
		}

		
		
		
		sc.close();
	}
}
