package entidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.primefaces.PrimeFaces;

@ManagedBean
public class Login {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String usuario;
	    private String senha;
	 
	     
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}

		public void login(ActionEvent event) {
	        FacesMessage message = null;
	        boolean loggedIn = false;
	         
	        if(usuario != null && usuario.equals("admin") && senha != null && senha.equals("admin")) {
	            loggedIn = true;
	            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem vindo", usuario);
	        } else {
	            loggedIn = false;
	            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Credencial Inválida");
	        }
	         
	        FacesContext.getCurrentInstance().addMessage(null, message);
	        PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
	    }   
	}


