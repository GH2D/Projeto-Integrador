package entidade;

import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa {
	private Pessoa pessoa;
	private String cnpj;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
