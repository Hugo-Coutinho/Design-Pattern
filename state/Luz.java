package state;
public class Luz {

    private ILuz luz;

    public Luz(ILuz luz) {
        super();
        this.luz = luz;
    }

    public ILuz getLuz() {
        return luz;
    }

    public void setLuz(ILuz luz) {
        this.luz = luz;
    }

    public void clicarBotao() {
        luz.clicarBotao();
    }
}