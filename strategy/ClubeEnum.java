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
			System.out.println("ão ão ão Vasco segunda divisão");
		}

	},

	OUTRO {

		@Override
		public void executar() {
			System.out.println("outros");
		}
	}

}