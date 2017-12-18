/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Causa;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.mCausa;
import recurso.rcUtil;

/**
 *
 * @author caina
 */
@ManagedBean
@RequestScoped
public class cCausa {
    

    private ArrayList<Causa> lstCausa;
    private Causa objCausanew;
    private Causa objCausasel;

    @PostConstruct
    public void cCausa() {
        try {
            cargarCausa();
        } catch (Exception ex) {
            Logger.getLogger(cCausa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarCausa() {
        try {
            lstCausa = mCausa.listarCausa();
            objCausanew = new Causa();
            objCausasel = new Causa();
        } catch (Exception ex) {
            Logger.getLogger(cCausa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarCausa() {
        try {
            if (mCausa.insertarCausa(objCausanew)) {
                rcUtil.mensajeExito("wdlgNuevaCausa.hide()");
                cargarCausa();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarCausa() {
        try {
            if (mCausa.modificarCausa(objCausasel)) {
                rcUtil.mensajeExito("wdlgModificarCausa.hide()");
                cargarCausa();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarCausa() {
        try {
            System.out.println("Entra eliminar");
//            if (mUsuario.eliminarUsuario(objUsuariosel.getIdusuario())) {
            if (mCausa.eliminarCausa(objCausasel.getId_causa())) {
                rcUtil.mensajeExito("wdlgEliminarCausa.hide()");
                cargarCausa();
                System.out.println("Entra eliminar true carga causa");
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<Causa> getLstCausa() {
        return lstCausa;
    }

    public void setLstCausa(ArrayList<Causa> lstCausa) {
        this.lstCausa = lstCausa;
    }

    public Causa getObjCausanew() {
        return objCausanew;
    }

    public void setObjCausanew(Causa objCausanew) {
        this.objCausanew = objCausanew;
    }

    public Causa getObjCausasel() {
        return objCausasel;
    }

    public void setObjCausasel(Causa objCausasel) {
        this.objCausasel = objCausasel;
    }

}
