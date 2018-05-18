package nullObject;

public class Snippet {
	public static void main(String[] args) {
	
	            Model p = new ProdutoFactory().findByName("xamxung");
	            Model p1 = new ProdutoFactory().findByName("samsung");
	            
	            System.out.println(p.toString());
	            
	            System.out.println("**************");
	            
	            System.out.println(p1.toString());
	    
	        }
	
}

