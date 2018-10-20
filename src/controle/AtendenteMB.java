package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidade.Atendente;

@ManagedBean
@ViewScoped
public class AtendenteMB {

		private Atendente atendente = new Atendente();
		private List<Atendente> atendentes = new ArrayList<>();
		private DAOGenerico<Atendente> dao = new DAOGenerico<>(Atendente.class);
		
		public AtendenteMB(){
			atendentes = dao.buscarTodos();
		}

		public void inserir() {
			if (atendente.getId() == null) {
				dao.salvar(atendente);
			} else {
				dao.alterar(atendente);
			}
			atendente = new Atendente();
			atendentes = dao.buscarTodos();
		}
		
		public void excluir(Long id){
			dao.excluir(id);
			atendentes = dao.buscarTodos();
		}

		public Atendente getAtendente() {
			return atendente;
		}

		public void setAtendente(Atendente atendente) {
			this.atendente = atendente;
		}

		public List<Atendente> getAtendentes() {
			return atendentes;
		}

		public void setAtendentes(List<Atendente> atendentes) {
			this.atendentes = atendentes;
		}

		
		

	}