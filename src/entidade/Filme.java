package entidade;

public class Filme extends Midia{
	private String atores;
	private String distribuidora;


	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

}
