package entidade;

import javax.persistence.Entity;

@Entity
public class Atendente extends Pessoa {

	private String registro;
	private String cpf; 

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

}
