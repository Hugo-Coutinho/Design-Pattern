package templateMethod;

public abstract class Jogador {

	final void inicarJogo() {

		agarrar();
		defender();
		controlarJogo();
		distribuirJogadas();
		atacar();

	}

	abstract void agarrar();

	abstract void defender();

	abstract void controlarJogo();

	abstract void distribuirJogadas();

	abstract void atacar();
}