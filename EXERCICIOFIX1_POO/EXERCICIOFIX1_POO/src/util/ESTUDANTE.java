package util;

public class ESTUDANTE {

	//String name;
	public double x, y, z;
	
	public double media() { //calculo da media
		return x + y + z; // FAÇO O CALCULO DE MEDIA		
	}
	
	public double pontos() {//CRIO A CLASSE PONTOS PARA A CONDIÇÃO
		if (media() < 60.0) {//CASO A MEDIA SEJA MENOR QUE 60, RETORNO QUANTO FALTA
			return 60.0 - media();
		}
		else {//SE NÃO, NÃO RETORNO NADA
			return 0.0;
		}
	}
}
