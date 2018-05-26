package chainOfResponsibility;


public abstract class CorrenteProduto {

	protected CorrenteProduto proximo;
	protected NomeProduto nome;

	
	public CorrenteProduto(NomeProduto nome) {
		proximo = null;
		this.nome = nome;
	}

	public void setProximo(CorrenteProduto prox) {
		if (proximo == null) {
			this.proximo = prox;
		} else {
			proximo.setProximo(prox);
		}
	}

	protected void buscarProdutoParaCompra(NomeProduto nomeProduto) throws Exception {

		if (validaProduto(nomeProduto)) {
			comprarProduto();
		} else {
			if (proximo == null) {
				throw new Exception("produto não cadastrado para compra");
			}
			proximo.buscarProdutoParaCompra(nomeProduto);
		}

	}

	private boolean validaProduto(NomeProduto nomeProd) {
		if (this.nome == nomeProd) {
			return true;
		}
		return false;
	}

	public abstract void comprarProduto();
	

}
