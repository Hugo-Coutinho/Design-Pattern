package observer;

public class Bruno implements Assinante {

	private Editora veja;

	public Bruno(Editora veja) {
		super();
		this.veja = veja;
		veja.fazerAssinatura(this);
	}

	@Override
	public void novaPublicacao(Editora e) {
		if (e.getNoticia().equals("vasco cai denovo")) {
			System.out.println("Bruno: não gostei..");
			veja.cancelarAssinatura(this);
		} else {
			System.out.println("Bruno: " + e.getNoticia());
		}
	}

}
