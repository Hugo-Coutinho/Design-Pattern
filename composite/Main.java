package composite;

public class Main {

	public static void main(String[] args) {

		MusicaComponente industrial = new GrupoMusica("Industrial",
				"Música industrial é um termo usado para definir o gênero de alguns estilos musicais eletrônicos e experimentais  ");
		industrial.add(new Musica("Head Like a Hole", "NIN", 1990));
		industrial.add(new Musica("headHunter", "Front 242", 1988));

		MusicaComponente heavyMetal = new GrupoMusica("Heavy Metal",
				"Heavy metal é um gênero do rock que se desenvolveu no final da década de 1960");
		heavyMetal.add(new Musica("War Pigs", "Black Sabbath", 1970));
		heavyMetal.add(new Musica("Ace of Spades", "MotorHead", 1980));

		MusicaComponente dubStepMusic = new GrupoMusica("dubStep",
				"Dubstep é um gênero de música eletrônica que se originou no Sul de Londres, Inglaterra em meados finais da década de 1990.");
		dubStepMusic.add(new Musica("Centipede", "Knife Party", 2012));
		dubStepMusic.add(new Musica("Tetris", "Doctor P", 2011));

		MusicaComponente todasMusicas = new GrupoMusica("lista de todas as músicas.",
				"Todas as músicas atribuidas nesse programa.");

		industrial.add(dubStepMusic);

		todasMusicas.add(industrial);
		todasMusicas.add(heavyMetal);

		DJ avicii = new DJ(todasMusicas);
		avicii.getListaMusica();

	}

}
