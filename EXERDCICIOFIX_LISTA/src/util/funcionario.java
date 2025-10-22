package util;

public class funcionario {
	
	//atributos
	private Integer id;
	private String name;
	private Double salario;
	
	
	public funcionario() {
	}
	public funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	//gets sets
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//Calculo para o salario
	public void increaseSalario(Double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	//toString pra imprimir os funcionarios
	public String toString() {
		return id + "," + name + ", " + String.format("%.2f", salario);
	}
	
	

}
