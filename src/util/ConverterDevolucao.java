package util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import dao.DAOGenerico;
import entidade.Devolucao;

@FacesConverter("converterDevolucao")
public class ConverterDevolucao implements Converter {
 
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
    	
        if(value != null && value.trim().length() > 0) {
        	System.out.println("Dentro do IFFF");
        DAOGenerico<Devolucao> daoDevolucao = new DAOGenerico<>(Devolucao.class);
        	try {
                Devolucao devolucao = daoDevolucao.buscarPorId(Long.parseLong(value));
                return devolucao;
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ", "Devolução Invalido"));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((Devolucao) object).getId());
        }
        else {
            return null;
        }
    }
}