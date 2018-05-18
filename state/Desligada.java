package state;
public class Desligada implements ILuz {

    @Override
    public void clicarBotao() {
        System.out.println("Luz desligada");
    }

}