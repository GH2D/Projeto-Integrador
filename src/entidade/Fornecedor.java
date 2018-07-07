package entidade;

import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa {
	private Pessoa pessoa;
	private String CNPJ;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}
