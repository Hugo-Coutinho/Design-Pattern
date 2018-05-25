package chainOfResponsibility;

public class TV extends CorrenteProduto {

	public TV() {
		super(NomeProduto.TV);
	}

	@Override
	public void comprarProduto() {
		System.out.println("TV comprada com sucesso");
	}

}
