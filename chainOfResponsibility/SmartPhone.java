package chainOfResponsibility;

public class SmartPhone extends CorrenteProduto {

	public SmartPhone() {
		super(NomeProduto.SMARTPHONE);
	}

	@Override
	public void comprarProduto() {
		System.out.println("SMARTPHONE comprada com sucesso");
	}
}
