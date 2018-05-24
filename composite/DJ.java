package composite;

public class DJ {

	private MusicaComponente listaMusica;

	public DJ(MusicaComponente listaMusica) {
		super();
		this.listaMusica = listaMusica;
	}

	public void getListaMusica() {
		listaMusica.MostrarInfoMusica();
	}

	public void setListaMusica(MusicaComponente listaMusica) {
		this.listaMusica = listaMusica;
	}

}
