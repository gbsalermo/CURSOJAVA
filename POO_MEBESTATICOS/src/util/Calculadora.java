package util;

public class Calculadora {
	//Nesse exemplo não necessita de static
	public final double PI = 3.14159; //membro estático, a palavra final serve para confirmar que o valor não mudará,
	
	public double circunferencia(double raio) {//Crio a função circunferencia que recebe double raio
		return 2.0 * PI * raio; // faço o retorno do calculo de circunferência
	}
	public double volume(double raio) { //Crio a função volume que recebe double raio
		return 4.0 * PI * raio * raio * raio / 3.0; //faço o calculo de volume
	}

}
