package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAOGenerico;
import entidade.Filme;

@ManagedBean
@ViewScoped
public class FilmeMB {
	private Filme filme = new Filme();
	private List<Filme> filmes = new ArrayList<>();
	private DAOGenerico<Filme> dao = new DAOGenerico<>(Filme.class);
	
	public FilmeMB(){
		filmes = dao.buscarTodos();
	}

	public void inserir() {
		
		if (filme.getId() == null) {
			dao.salvar(filme);
		} else {
			dao.alterar(filme);
		}
		filme = new Filme();
			filmes = dao.buscarTodos();
	}
	
	public void excluir(Long id){
		dao.excluir(id);
		filmes = dao.buscarTodos();
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setClientes(List<Filme> filmes) {
		this.filmes = filmes;
	}

}