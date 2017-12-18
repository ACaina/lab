/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.actividad;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.mActividad;
import recurso.rcUtil;

/**
 *
 * @author HP ENVY
 */
@ManagedBean
@ViewScoped
public class cactividad {
    
    private ArrayList<actividad> lstActividad;
    private actividad objActividadnew;
    private actividad objActividadsel;

    @PostConstruct
    public void cUsuario() {
        try {
            cargarActividad();
        } catch (Exception ex) {
            Logger.getLogger(actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarActividad() {
        try {
            lstActividad = mActividad.listarActividad();
            objActividadnew = new actividad();
            objActividadsel = new actividad();
        } catch (Exception ex) {
            Logger.getLogger(cactividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarActividad() {
        try {
            if (mActividad.insertarActividad(objActividadnew)) {
                rcUtil.mensajeExito("wdlgNuevoActividad.hide()");
                cargarActividad();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarActividad() {
        try {
            if (mActividad.modificarActividad(objActividadsel)) {
                rcUtil.mensajeExito("wdlgModificarActividad.hide()");
                cargarActividad();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarActividad() {
        try {
            if (mActividad.eliminarActividad(objActividadsel.getIdactividad())) {
                rcUtil.mensajeExito("wdlgEliminarActividad.hide()");
                cargarActividad();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<actividad> getLstActividad() {
        return lstActividad;
    }

    public void setLstActividad(ArrayList<actividad> lstActividad) {
        this.lstActividad = lstActividad;
    }

    public actividad getObjActividadnew() {
        return objActividadnew;
    }

    public void setObjActividadnew(actividad objActividadnew) {
        this.objActividadnew = objActividadnew;
    }

    public actividad getObjActividadsel() {
        return objActividadsel;
    }

    public void setObjActividadsel(actividad objActividadsel) {
        this.objActividadsel = objActividadsel;
    }
    
    
}
