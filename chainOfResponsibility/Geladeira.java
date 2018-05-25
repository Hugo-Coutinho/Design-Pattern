package chainOfResponsibility;

public class Geladeira extends CorrenteProduto {

	public Geladeira() {
		super(NomeProduto.GELADEIRA);
	}

	@Override
	public void comprarProduto() {
		System.out.println("GELADEIRA comprada com sucesso");
	}
}
