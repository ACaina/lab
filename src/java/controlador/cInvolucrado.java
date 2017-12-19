/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.involucrado;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.mInvolucrado;
import recurso.rcUtil;

/**
 *
 * @author Erika
 */
@ManagedBean
@ViewScoped
public class cInvolucrado {
    private ArrayList<involucrado> lstInvolucrado;
    private involucrado objInvolucradonew;
    private involucrado objInvolucradosel;

    @PostConstruct
    public void Involucrado() { /*.....*/
        try {
            cargarInvolucrado();
        } catch (Exception ex) {
            Logger.getLogger(involucrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarInvolucrado() {
        try {
            lstInvolucrado = mInvolucrado.listarInvolucrado();
            objInvolucradonew = new involucrado();
            objInvolucradosel = new involucrado();
        } catch (Exception ex) {
            Logger.getLogger(cInvolucrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarInvolucrado() {
        try {
            if (mInvolucrado.insertarInvolucrado(objInvolucradonew)) {
                rcUtil.mensajeExito("wdlgNuevoInvolucrado.hide()");
                cargarInvolucrado();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarInvolucrado() {
        try {
            if (mInvolucrado.modificarInvolucrado(objInvolucradosel)) {
                rcUtil.mensajeExito("wdlgModificarInvolucrado.hide()");
                cargarInvolucrado();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarInvolucrado() {
        try {
            System.out.println("elimina");
            if (mInvolucrado.eliminarInvolucrado(objInvolucradosel.getId_involucrado())) {
                rcUtil.mensajeExito("wdlgEliminarInvolucrado.hide()");
                cargarInvolucrado();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<involucrado> getLstInvolucrado() {
        return lstInvolucrado;
    }

    public void setLstInvolucrado(ArrayList<involucrado> lstInvolucrado) {
        this.lstInvolucrado = lstInvolucrado;
    }

    public involucrado getObjInvolucradonew() {
        return objInvolucradonew;
    }

    public void setObjInvolucradonew(involucrado objInvolucradonew) {
        this.objInvolucradonew = objInvolucradonew;
    }

    public involucrado getObjInvolucradosel() {
        return objInvolucradosel;
    }

    public void setObjInvolucradosel(involucrado objInvolucradosel) {
        this.objInvolucradosel = objInvolucradosel;
    }

       
    
}
