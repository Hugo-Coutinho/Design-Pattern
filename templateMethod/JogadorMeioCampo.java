package templateMethod;

public class JogadorMeioCampo extends Jogador {

	private String nome;
	private String posicao;
	private Integer idade;

	public JogadorMeioCampo(String nome, String posicao, Integer idade) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		this.idade = idade;

	}

	@Override
	public String toString() {
		return "JogadorMeioCampo [nome=" + nome + ", posicao=" + posicao + ", idade=" + idade + "]";
	}

	@Override
	void agarrar() {
		// TODO Auto-generated method stub

	}

	@Override
	void defender() {
		// TODO Auto-generated method stub

	}

	@Override
	void distribuirJogadas() {
		// TODO Auto-generated method stub
		System.out.println("sou o " + getNome() + ", jogo na posicao de " + getPosicao()
				+ " e minha maior função no campo é deixar os atacante com vantagens na área ofensiva pronto para realizar o gol");

	}

	@Override
	void controlarJogo() {
		// TODO Auto-generated method stub
		System.out.println("jogo controlando o jogo,");
	}

	@Override
	void atacar() {
		// TODO Auto-generated method stub

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