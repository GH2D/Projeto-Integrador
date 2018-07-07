package entidade;

import javax.persistence.Entity;

@Entity
public class Atendente extends Pessoa {
	private Pessoa pessoa;
	private String registro;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
}
