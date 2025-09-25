package util;
import java.util.Date;

public class Order {
	
	private Date date;
	private Produto produto;
	
	//construtor e get/set gerados automaticamente
	public Order(Date date, Produto produto) {
		super();
		this.date = date;
		this.produto = produto;
		this.produto.name = "tv"; //Por estar no mesmo pacote, posso acessar name mesmo sem ele ter nenhum modificador(Private/public)
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
