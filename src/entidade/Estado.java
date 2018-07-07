package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private char silga;

	public char getSilga() {
		return silga;
	}

	public void setSilga(char silga) {
		this.silga = silga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
