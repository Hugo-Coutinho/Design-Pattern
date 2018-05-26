package proxy;

public class BancoProxy extends BancoSerie {

	protected String usuario;
	protected String senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public void imprimirSerie() {
		if (temPermissaoAcesso()) {
			super.imprimirSerie();
		} else {
			System.out.println("não tem permissão, saida daqui!!! ");
		}
	}

	public boolean temPermissaoAcesso() {
		return usuario == "admin" && senha == "admin";
	}

}
