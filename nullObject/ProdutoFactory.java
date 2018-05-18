package nullObject;

import java.util.ArrayList;
import java.util.List;

public class ProdutoFactory {

	private List<Model> produtos = new ArrayList();

	{
		produtos.add(new Produto("xamxung", 5, 800.));
		produtos.add(new Produto("razus", 3, 950.));
		produtos.add(new Produto());
	}

	public Model findByName(String nome) {
		Model prod = new Produto();
		for (Model p : produtos) {
			prod = p;
			if (prod.getNome() == nome) {
				return prod;
			}
			prod = new ProdutoNull();
		}
		return prod;
	}
}