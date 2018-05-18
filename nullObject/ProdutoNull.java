package nullObject;

public class ProdutoNull implements Model {

	@Override
	public Double getPreco() {
		return 0.;
	}

	@Override
	public String getNome() {
		return "sem nome";
	}

	@Override
	public Integer getQtd() {
		return 0;
	}

	@Override
	public String toString() {
		return "Produto [getPreco()=" + getPreco() + ", getNome()=" + getNome() + ", getQtd()=" + getQtd() + "]";
	}
}