package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {

		try {

			CorrenteProduto corrente = new TV();
			corrente.setProximo(new Geladeira());
			corrente.setProximo(new SmartPhone());
			corrente.setProximo(new Colchao());

			corrente.buscarProduto(NomeProduto.GELADEIRA);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
