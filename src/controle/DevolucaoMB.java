package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidade.Devolucao;

@ManagedBean
@ViewScoped
public class DevolucaoMB {
	private Devolucao devolucao = new Devolucao();
	private List<Devolucao> devolucoes = new ArrayList<>();
	private DAOGenerico<Devolucao> dao = new DAOGenerico<>(Devolucao.class);

	public DevolucaoMB() {
		devolucoes = dao.buscarTodos();
	}

	public void inserir() {

		if (devolucao.getId() == 0) {
			dao.salvar(devolucao);
		} else {
			dao.alterar(devolucao);
		}
		devolucao = new Devolucao();
		devolucoes = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		devolucoes = dao.buscarTodos();
	}

	public Devolucao getDevolucao() {
		return devolucao;
	}

	public void setDevolcuao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}

	public List<Devolucao> getLocacoes() {
		return devolucoes;
	}

	public void setLocacoes(List<Devolucao> devolucoes) {
		this.devolucoes = devolucoes;
	}

}