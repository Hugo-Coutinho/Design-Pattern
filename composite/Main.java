package composite;

public class Main {

	public static void main(String[] args) {

		MusicaComponente industrial = new GrupoMusica("Industrial",
				"M�sica industrial � um termo usado para definir o g�nero de alguns estilos musicais eletr�nicos e experimentais  ");
		industrial.add(new Musica("Head Like a Hole", "NIN", 1990));
		industrial.add(new Musica("headHunter", "Front 242", 1988));

		MusicaComponente heavyMetal = new GrupoMusica("Heavy Metal",
				"Heavy metal � um g�nero do rock que se desenvolveu no final da d�cada de 1960");
		heavyMetal.add(new Musica("War Pigs", "Black Sabbath", 1970));
		heavyMetal.add(new Musica("Ace of Spades", "MotorHead", 1980));

		MusicaComponente dubStepMusic = new GrupoMusica("dubStep",
				"Dubstep � um g�nero de m�sica eletr�nica que se originou no Sul de Londres, Inglaterra em meados finais da d�cada de 1990.");
		dubStepMusic.add(new Musica("Centipede", "Knife Party", 2012));
		dubStepMusic.add(new Musica("Tetris", "Doctor P", 2011));

		MusicaComponente todasMusicas = new GrupoMusica("lista de todas as m�sicas.",
				"Todas as m�sicas atribuidas nesse programa.");

		industrial.add(dubStepMusic);

		todasMusicas.add(industrial);
		todasMusicas.add(heavyMetal);

		DJ avicii = new DJ(todasMusicas);
		avicii.getListaMusica();

	}

}
