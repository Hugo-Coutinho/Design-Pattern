package observer;

public class Hugo implements Assinante {

	private Editora veja;

	public Hugo(Editora veja) {
		super();
		this.veja = veja;
		veja.fazerAssinatura(this);
	}

	@Override
	public void novaPublicacao(Editora e) {
		if (e.getNoticia().equals("Flamengo perde na liberta")) {
			System.out.println("Hugo: não gostei..");
			veja.cancelarAssinatura(this);
		} else {
			System.out.println("Hugo: " + e.getNoticia());
		}
	}

}
