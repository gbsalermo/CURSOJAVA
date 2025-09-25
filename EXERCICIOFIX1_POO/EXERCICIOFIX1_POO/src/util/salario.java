package util;

public class salario {
	
	public String name; //Crio a String name
	public double sb, tx; //crio as variaveis sb(Salario bruto) e tx(taxa)
	
	public double salario() { //classe salario que vai calcular o salario liquido
		
		return sb - tx; // A classe retorna o valor de sb menos o valor da taxa
	}

	public void increase(double p) { // Crio uma classe void que apenas vai atualizar o valor a partir da porcentagem digitada, declaro double p como variavel da porcentagem
		sb +=  sb * p /100; // faço o calculo somando sb com o calculo da porcentagem de sb(De acordo a que foi digitada)
	}
	
	public String toString() {//Uso a classe String ToString() para printar os resultados
		return name + ", $ " + String.format("%.2f", salario());//Ela passa para o objeto x, o nome e o salario(a partir das atualizações indicadas)
	}

}
