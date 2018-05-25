package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {

		try {

			CorrenteProduto corrente = new TV();
			corrente.setProximo(new Colchao());
			corrente.setProximo(new Geladeira());
			corrente.setProximo(new SmartPhone());

			corrente.buscarProduto(NomeProduto.TV);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
