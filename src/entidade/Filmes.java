package entidade;

import javax.persistence.Entity;

@Entity
public class Filmes extends Midia{
	private String atores;

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

}
