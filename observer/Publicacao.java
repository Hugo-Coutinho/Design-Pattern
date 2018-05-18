package observer;

import java.util.Random;

public class Publicacao implements Runnable {

	private Editora veja;
	private String[] noticias = { "Flamengo perde na liberta", "vasco cai denovo", "Diego brilha",
			"Junior vai para o real", "Paqueta destaque no fla", "Rene monstro na lateral" };
	private Random momento;
	private Thread th;

	public Publicacao() {
		veja = new Veja();
		new Hugo(veja);
		new Bruno(veja);
		momento = new Random();
		th = new Thread(this);
		th.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < noticias.length; i++) {
			try {
				int m = momento.nextInt(noticias.length);
				System.out.println("************Noticia do dia:************ \n" + noticias[m]);
				System.out.println("");
				Thread.sleep(m * 1000);
				veja.setNoticia(noticias[m]);
				System.out.println("");

			} catch (Exception e) {
				System.out.println("cancelou assinatura");
				System.out.println("");
			}
		}
	}

}
