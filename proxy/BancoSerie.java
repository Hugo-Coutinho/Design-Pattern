package proxy;

public class BancoSerie {

	private String[] series = {
			"Gotham, temporada 4,contando a hist�ria do surgimento do batman e seus vil�es em gotham.",
			"The Blacklist, temporada 5, maior procurado do mundo se entrega ao FBI" };

	public void salvarSerie() {
	}

	public void imprimirSerie() {

		for (int i = 0; i < series.length; i++) {
			System.out.println(series[i]);
		}
	}

}
