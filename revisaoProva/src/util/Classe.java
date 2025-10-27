package util;

public class Classe {
	
	/*ex.1 triangulos
	//Atributos
	
	public double larg;
	public double alt;
	
	//Crio o construtor
	public Classe(double larg, double alt) {
		
		this.larg = larg;
		this.alt = alt;
	}
	
	//primeiro metodo Area()
	public double Area() { 
		return larg * alt;
	}
	//Segundo metodo Perimetro
	public double Perimetro() {
		return 2 * (larg + alt);
	}
	//Terceiro metodo Eh_quadrado
	public boolean Eh_quadrado() {
		if(alt == larg) {
			return true;
		}
		else {
			return false;
		}
		
		
	}*/
	/*Lampada
	
	public boolean estado;
	public int watts;
	
	//construtor com argumentos
	
	public Classe(int watts) {
		
		this.watts = watts;
	}
	//Construtor sem argumentos
	
	public Classe() {
		this.watts = 60;
	}
	
	//Metodo
	
	public void Ligar() {
		this.estado = true;
	}
	public void Desligar() {
		this.estado = false;
	}
	*/
	
	/*Par ou impar
	
	//Metodo Ehpar
	
	
	public boolean ehPar(int valor) {
		
		if(valor % 2 == 0) {
			return true;
		}
		else {
			return false;
		}}
	
	//Metodo isMultiple
	
	public static boolean isMultiple(int primeiro, int segundo) {
		if( primeiro == 0) {
			return false;
		}
		return segundo % primeiro == 0;
	}
	
	// public primo
	
	public static boolean ehPrimo(int valor) {
		if (valor < 2 ) {
			return false;
		}
		//verificação
		for(int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				return false;
			}
		
	}
		return true;
	}
*/	
	//Aluno
	
	
	//ATRIBUTOS
	
	public String nome;
	public int idade;
	public String curso;
	public double notas;
//	public int quant;
	
	
	public Classe(String nome, int idade, String curso, double notas) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.notas = notas;
		//this.quant = quant;
	}
	
	//sobrecarga - para tornar nota facultativo
	public Classe(String nome, int idade, String curso) {
		this(nome, idade, curso, 0.0);
}
	//metodos
	public void exibirDados() {
		System.out.println("Nome: " + nome + "\n idade: " + idade + "\n Curso: " + curso);
	}
	
	public boolean maiorIdade() {
		if(idade >= 18) {
			return true;
		}
		return false;
	}
	public double mediaNotas(double notas, int quant) {
		return notas / quant;
	}
















}

