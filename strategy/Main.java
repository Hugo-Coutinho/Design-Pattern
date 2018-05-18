package strategy;

public class Main {
	public static void main(String[] args) {
	            Clube c = new Clube(ClubeEnum.FLAMENGO, 6);
	            Clube c2 = new Clube(ClubeEnum.VASCO, 3);
	    
	            c.executar();
	            System.out.println("*****************");
	            c2.executar();
	        }
}

