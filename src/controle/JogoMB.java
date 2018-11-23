package controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidade.Jogo;

@ManagedBean
@ViewScoped
public class JogoMB {
	private Jogo jogo = new Jogo();
	private List<Jogo> jogos = new ArrayList<>();
	private DAOGenerico<Jogo> dao = new DAOGenerico<>(Jogo.class);
	
	
	public JogoMB(){
		jogos = dao.buscarTodos();
	}

	public void inserir() {
		
		if (jogo.getId() == null) {
			dao.salvar(jogo);
		} else {
			dao.alterar(jogo);
		}
		jogo = new Jogo();
			jogos = dao.buscarTodos();
	}
	
	public void excluir(Long id){
		dao.excluir(id);
		jogos = dao.buscarTodos();
	}

	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

}