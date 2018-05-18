package templateMethod;

public class Main {

	public static void main(String[] args) {

		Jogador j1 = new JogadorAtacante("Guerrero", "Atacante", 34);
		j1.inicarJogo();
		System.out.println("");
		Jogador j2 = new JogadorMeioCampo("Diego", "Meio", 33);
		j2.inicarJogo();
	}

}
