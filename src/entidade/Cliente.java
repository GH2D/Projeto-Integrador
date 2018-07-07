package entidade;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa{
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
