package state;

public class Main {

	public static void main(String[] args) {
		Ligada on = new Ligada();
		Luz l = new Luz(on);
		l.clicarBotao();
		System.out.println("");
		Desligada off = new Desligada();
		Luz l2 = new Luz(off);
		l2.clicarBotao();
	}
}
