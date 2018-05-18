package strategy;

public class Clube {

	private ClubeEnum time;
	private Integer titulosBrasileiros;

	public Clube(ClubeEnum time, Integer titulosBrasileiros) {
		super();
		this.time = time;
		this.titulosBrasileiros = titulosBrasileiros;
	}

	public Clube() {

	}

	public ClubeEnum getTime() {
		return time;
	}

	public void setTime(ClubeEnum time) {
		this.time = time;
	}

	public Integer getTitulosBrasileiros() {
		return titulosBrasileiros;
	}

	public void setTitulosBrasileiros(Integer titulosBrasileiros) {
		this.titulosBrasileiros = titulosBrasileiros;
	}

	public void executar() {

		time.executar();
	}
}