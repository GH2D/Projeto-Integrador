package entidade;

import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa {
	private Pessoa pessoa;
}
