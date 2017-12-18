/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.comprobante;
import modelo.mComprobante;
import recurso.rcUtil;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author usuario
 */
@ManagedBean
@ViewScoped
public class cComprobante {

    /**
     * Creates a new instance of cComprobante
     */
    private ArrayList<comprobante> lstComprobante;
    private comprobante objComprobantenew;
    private comprobante objComprobantesel;

    @PostConstruct
    public void cComprobante() {
        try {
            cargarComprobante();
        } catch (Exception ex) {
            Logger.getLogger(cComprobante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarComprobante() {
        try {
            lstComprobante = mComprobante.listarComprobante();
            objComprobantenew = new comprobante();
            objComprobantesel = new comprobante();
        } catch (Exception ex) {
            Logger.getLogger(cComprobante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarComprobante() {
        try {
            if (mComprobante.insertarComprobante(objComprobantenew)) {
                rcUtil.mensajeExito("wdlgNuevoComprobante.hide()");
                cargarComprobante();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarComprobante() {
        try {
            if (mComprobante.modificarComprobante(objComprobantesel)) {
                rcUtil.mensajeExitomodificar("wdlgModificarComprobante.hide()");
                cargarComprobante();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarComprobante() {
        try {
            if (mComprobante.eliminarComprobante(objComprobantesel.getIdcomprobante())) {
                rcUtil.mensajeExitoeliminar("wdlgEliminarComprobante.hide()");
                cargarComprobante();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<comprobante> getLstComprobante() {
        return lstComprobante;
    }

    public void setLstComprobante(ArrayList<comprobante> lstComprobante) {
        this.lstComprobante = lstComprobante;
    }

    public comprobante getObjComprobantenew() {
        return objComprobantenew;
    }

    public void setObjComprobantenew(comprobante objComprobantenew) {
        this.objComprobantenew = objComprobantenew;
    }

    public comprobante getObjComprobantesel() {
        return objComprobantesel;
    }

    public void setObjComprobantesel(comprobante objComprobantesel) {
        this.objComprobantesel = objComprobantesel;
    }

    

}
