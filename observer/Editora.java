package observer;

public interface Editora {

	public void fazerAssinatura(Assinante a);

	public void cancelarAssinatura(Assinante a);

	public void lerEdicao();

	public void setNoticia(String noticia);

	public String getNoticia();

}
