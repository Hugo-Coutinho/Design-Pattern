package singleton;

public class Main {

	public static void main(String[] args) {

		Livro designPattern = new Livro("Desin Pattern com Java", 90.);
		Livro javaSE7 = new Livro("Java SE 7 programmer", 110.);
		Livro js = new Livro("Estrutura de dados e algoritmos em javaScript", 60.);
		Livro scrum = new Livro("Scrum: The art of doing twice the work in the Half time", 83.);
		LivroSingleton valorTotal = LivroSingleton.getInstancia();
		valorTotal.setPrecoTotal(designPattern.getPreco());
		valorTotal.setPrecoTotal(javaSE7.getPreco());
		valorTotal.setPrecoTotal(js.getPreco());
		valorTotal.setPrecoTotal(scrum.getPreco());
		System.out.println("valor total que gastei comprando os livros para meus estudos: " + valorTotal.getPrecoTotal());
	}

}
