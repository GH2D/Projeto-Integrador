package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import sun.util.calendar.BaseCalendar.Date;

@Entity
public class Relatorios {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private Locacao locacao;
	private String tipo;
	private Date data;
	private int qtdTitulos;
	private Date dataDeAbertura;
	private Date dataDeFechamento;
	private String locacoes;
	private String devolucoes;
	private Double totalValor;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getQtdTitulos() {
		return qtdTitulos;
	}

	public void setQtdTitulos(int qtdTitulos) {
		this.qtdTitulos = qtdTitulos;
	}

	public Date getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Date dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public Date getDataDeFechamento() {
		return dataDeFechamento;
	}

	public void setDataDeFechamento(Date dataDeFechamento) {
		this.dataDeFechamento = dataDeFechamento;
	}

	public String getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(String locacoes) {
		this.locacoes = locacoes;
	}

	public String getDevolucoes() {
		return devolucoes;
	}

	public void setDevolucoes(String devolucoes) {
		this.devolucoes = devolucoes;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relatorios other = (Relatorios) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
}
