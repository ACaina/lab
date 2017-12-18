/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.tipo_puesto;
import modelo.mtipopuesto;
import recurso.rcUtil;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author HP ENVY
 */
@ManagedBean
@RequestScoped
public class ctipopuesto {
    
    private ArrayList<tipo_puesto> lstTipoPuesto;
    private tipo_puesto objTipoPuestonew;
    private tipo_puesto objTipoPuestosel;

    public ctipopuesto() {
        try {
            cargarTipoPuesto();
        } catch (Exception ex) {
            Logger.getLogger(ctipopuesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void cargarTipoPuesto() {
        try {
            lstTipoPuesto = mtipopuesto.listarTipoPuesto();
            objTipoPuestonew = new tipo_puesto();
            objTipoPuestosel = new tipo_puesto();
        } catch (Exception ex) {
            Logger.getLogger(ctipopuesto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ingresarTipoPuesto() {
        try {
            if (mtipopuesto.insertarTipoPuesto(objTipoPuestonew)) {
                rcUtil.mensajeExito("wdlgNuevoTipoPuesto.hide()");
                cargarTipoPuesto();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarTipoPuesto() {
//        System.out.println("javi");
//         System.out.println(objtipopaginasel.getTppcodigo());
//                        System.out.println(objtipopaginasel.getTppdescripcion());
 try {
          
            if (mtipopuesto.modificarTipoPuesto(objTipoPuestosel)) {
                rcUtil.mensajeExitomodificar("wdlgModificarTipoPuesto.hide()");
                cargarTipoPuesto();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }
    public void eliminarTipoPuesto() {
        try {
            if (mtipopuesto.eliminarTipoPuesto(objTipoPuestosel.getIdtipopuesto())){
                rcUtil.mensajeExitoeliminar("wdlgEliminarTipoPuesto.hide()");
                cargarTipoPuesto();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<tipo_puesto> getLstTipoPuesto() {
        return lstTipoPuesto;
    }

    public void setLstTipoPuesto(ArrayList<tipo_puesto> lstTipoPuesto) {
        this.lstTipoPuesto = lstTipoPuesto;
    }

    public tipo_puesto getObjTipoPuestonew() {
        return objTipoPuestonew;
    }

    public void setObjTipoPuestonew(tipo_puesto objTipoPuestonew) {
        this.objTipoPuestonew = objTipoPuestonew;
    }

    public tipo_puesto getObjTipoPuestosel() {
        return objTipoPuestosel;
    }

    public void setObjTipoPuestosel(tipo_puesto objTipoPuestosel) {
        this.objTipoPuestosel = objTipoPuestosel;
    }
    
    
    
}
