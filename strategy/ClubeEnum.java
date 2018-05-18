package strategy;

public enum ClubeEnum implements ClubeInterface {

	FLAMENGO {

		@Override
		public void executar() {
			System.out.println("Flamengo melhor time do Brasil");
		}

	},

	VASCO {

		@Override
		public void executar() {
			System.out.println("�o �o �o Vasco segunda divis�o");
		}

	},

	OUTRO {

		@Override
		public void executar() {
			System.out.println("outros");
		}
	}

}