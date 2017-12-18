package controlador;

import entidades.comerciante;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.mComerciante;
import recurso.rcUtil;

@ManagedBean
@RequestScoped
public class cComerciante {
    private ArrayList<comerciante> lstComerciante;
    private comerciante objComerciantenew;
    private comerciante objComerciantesel;

    public cComerciante() {
        try {
            cargarComerciante();
        } catch (Exception ex) {
            Logger.getLogger(cComerciante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void cargarComerciante() {
        try {
            lstComerciante = mComerciante.listarComerciante();
            objComerciantenew = new comerciante();
            objComerciantesel = new comerciante();
        } catch (Exception ex) {
            Logger.getLogger(ctipopuesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ingresarComerciante() {
        try {
            if (mComerciante.insertarComerciante(objComerciantenew)) {
                rcUtil.mensajeExito("wdlgNuevoComerciante.hide()");
                cargarComerciante();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarComerciante() {
//        System.out.println("javi");
//         System.out.println(objtipopaginasel.getTppcodigo());
//                        System.out.println(objtipopaginasel.getTppdescripcion());
 try {
          
            if (mComerciante.modificarComerciante(objComerciantesel)) {
                rcUtil.mensajeExitomodificar("wdlgModificarComerciante.hide()");
                cargarComerciante();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }
    public void eliminarComerciante() {
        try {
            if (mComerciante.eliminarComerciante(objComerciantesel.getIdcomerciante())){
                rcUtil.mensajeExitoeliminar("wdlgEliminarComerciante.hide()");
                cargarComerciante();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<comerciante> getLstComerciante() {
        return lstComerciante;
    }

    public void setLstComerciante(ArrayList<comerciante> lstComerciante) {
        this.lstComerciante = lstComerciante;
    }

    public comerciante getObjComerciantenew() {
        return objComerciantenew;
    }

    public void setObjComerciantenew(comerciante objComerciantenew) {
        this.objComerciantenew = objComerciantenew;
    }

    public comerciante getObjComerciantesel() {
        return objComerciantesel;
    }

    public void setObjComerciantesel(comerciante objComerciantesel) {
        this.objComerciantesel = objComerciantesel;
    }
    
    
}
