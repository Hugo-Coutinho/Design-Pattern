package chainOfResponsibility;

public class Colchao extends CorrenteProduto {

	public Colchao() {
		super(NomeProduto.COLCHÃO);
	}

	@Override
	public void comprarProduto() {
		System.out.println("COLCHÃO comprada com sucesso");
	}
}
