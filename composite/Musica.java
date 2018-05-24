package composite;

public class Musica extends MusicaComponente {

	private MusicaComponente musica;

	private String nomeMusica;
	private String nomeBanda;
	private Integer anoLancamento;

	public Musica(String nomeMusica, String nomeBanda, Integer anoLancamento) {
		super();
		this.nomeMusica = nomeMusica;
		this.nomeBanda = nomeBanda;
		this.anoLancamento = anoLancamento;
	}

	public void MostrarInfoMusica() {
		System.out.println(getnomeMusica() + " foi gravada com " + getnomeBanda() + " no ano de " + getAnoLancamento());
	}

	public MusicaComponente getMusica() {
		return musica;
	}

	public void setMusica(MusicaComponente musica) {
		this.musica = musica;
	}

	public String getnomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getnomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
