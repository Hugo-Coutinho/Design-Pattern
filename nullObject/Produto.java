package nullObject;

public class Produto implements Model {

	private String nome;
	private Integer qtd;
	private Double preco;

	public Produto(String nome, Integer qtd, Double preco) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}

	public Produto() {

	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", qtd=" + qtd + ", preco=" + preco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
