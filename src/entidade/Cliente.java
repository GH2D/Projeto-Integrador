package entidade;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
	private String cpf;
	// private ArrayList<String> endereco = new ArrayList();

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}