package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidade.Midia;

@ManagedBean
@ViewScoped
public class MidiaMB {
	private Midia midia = new Midia();
	private List<Midia> midias = new ArrayList<>();
	private DAOGenerico<Midia> dao = new DAOGenerico<>(Midia.class);

	public MidiaMB() {
		midias = dao.buscarTodos();
	}

	public void inserir() {

		if (midia.getId() == null) {
			dao.salvar(midia);
		} else {
			dao.alterar(midia);
		}
		midia = new Midia();
		midias = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		midias = dao.buscarTodos();
	}

	public Midia getMidia() {
		return midia;
	}

	public void setCliente(Midia midia) {
		this.midia = midia;
	}

	public List<Midia> getMidias() {
		return midias;
	}

	public void setMidias(List<Midia> midias) {
		this.midias = midias;
	}

}