package entidade;

import javax.persistence.Entity;

@Entity
public class Jogo extends Midia{
	private String plataforma;
	private Midia midia;

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
