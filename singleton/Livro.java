package singleton;

public class Livro {

	private String nome;
	private Double preco;

	public Livro(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", preco=" + preco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
