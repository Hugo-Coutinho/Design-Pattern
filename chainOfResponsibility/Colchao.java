package chainOfResponsibility;

public class Colchao extends CorrenteProduto {

	public Colchao() {
		super(NomeProduto.COLCH�O);
	}

	@Override
	public void comprarProduto() {
		System.out.println("COLCH�O comprada com sucesso");
	}
}
