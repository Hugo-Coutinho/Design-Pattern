package templateMethod;

public class JogadorAtacante extends Jogador {

	private String nome;
	private String posicao;
	private Integer idade;

	@Override
	void agarrar() {

	}

	public JogadorAtacante(String nome, String posicao, Integer idade) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "JogadorAtacante [nome=" + nome + ", posicao=" + posicao + ", idade=" + idade + "]";
	}

	@Override
	void defender() {

	}

	@Override
	void controlarJogo() {

	}

	@Override
	void distribuirJogadas() {

	}

	@Override
	void atacar() {
		System.out.println("eu sou o " + getNome() + "  e eu jogo na posição de " + getPosicao()
				+ " meu objetivo é fazer muitos gols");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}