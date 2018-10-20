package entidade;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
	private String cpf;
	private String email;
	// private ArrayList<String> endereco = new ArrayList();

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}