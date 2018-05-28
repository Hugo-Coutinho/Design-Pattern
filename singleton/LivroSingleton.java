package singleton;

public class LivroSingleton {

	public static LivroSingleton instancia;
	private static Double precoTotal=0.;

	protected LivroSingleton() {

	}

	public static LivroSingleton getInstancia() {
		if (instancia == null)
			instancia = new LivroSingleton();
		return instancia;
	}

	public static Double getPrecoTotal() {
		return precoTotal;
	}

	public static void setPrecoTotal(Double precoTotal) {
		LivroSingleton.precoTotal += precoTotal;
	}

}
