package observer;

import java.util.ArrayList;

public class Veja implements Editora {

	private ArrayList<Assinante> ass;
	private String noticia;

	public Veja() {
		ass = new ArrayList<>();

	}

	@Override
	public void fazerAssinatura(Assinante a) {
		ass.add(a);
	}

	@Override
	public void cancelarAssinatura(Assinante a) {
		ass.remove(a);
	}

	@Override
	public void lerEdicao() {
		for (Assinante assinante : ass) {
			assinante.novaPublicacao(this);
		}
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
		lerEdicao();

	}

	public ArrayList<Assinante> getAss() {
		return ass;
	}

	public void setAss(ArrayList<Assinante> ass) {
		this.ass = ass;
		lerEdicao();
	}

	public String getNoticia() {
		return noticia;

	}

}
