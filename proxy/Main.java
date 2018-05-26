package proxy;

public class Main {

	public static void main(String[] args) {

		BancoSerie bancoProxy = new BancoProxy("admin", "admin");
		bancoProxy.imprimirSerie();
	}

}
