package controlador;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author usuario
 */
@ManagedBean
@ViewScoped
public class cReporte implements Serializable{

    @PostConstruct
    public void cReporte() {
    }

    public void reporteMantenimiento(Integer labcodigo) throws IOException, Exception {
        FacesContext.getCurrentInstance().getExternalContext().redirect("/reportes/rpMantenimiento?labcodigo=" + labcodigo);
    }

    
    @PreDestroy
    public void destructor() {
    }

}
