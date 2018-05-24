package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class GrupoMusica extends MusicaComponente {

	private ArrayList grupoMusica = new ArrayList();

	private String grupoNome;
	private String grupoDescricao;

	public GrupoMusica(String grupoNome, String grupoDescricao) {
		super();
		this.grupoNome = grupoNome;
		this.grupoDescricao = grupoDescricao;
	}

	public void add(MusicaComponente novaMusica) {
		grupoMusica.add(novaMusica);
	}

	public void remove(MusicaComponente removerMusica) {
		grupoMusica.remove(removerMusica);
	}

	public MusicaComponente getComponente(Integer index) {
		return (MusicaComponente) grupoMusica.get(index);
	}

	public void MostrarInfoMusica() {
		System.out.println(getGrupoNome() + " " + getGrupoDescricao() + "\n");
		Iterator i = grupoMusica.iterator();
		while (i.hasNext()) {
			MusicaComponente info = (MusicaComponente) i.next();
			info.MostrarInfoMusica();
		}
	}

	public ArrayList getGrupoMusica() {
		return grupoMusica;
	}

	public void setGrupoMusica(ArrayList grupoMusica) {
		this.grupoMusica = grupoMusica;
	}

	public String getGrupoNome() {
		return grupoNome;
	}

	public void setGrupoNome(String grupoNome) {
		this.grupoNome = grupoNome;
	}

	public String getGrupoDescricao() {
		return grupoDescricao;
	}

	public void setGrupoDescricao(String grupoDescricao) {
		this.grupoDescricao = grupoDescricao;
	}

}
