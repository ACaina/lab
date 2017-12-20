/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.problema;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.mProblema;
import recurso.rcUtil;

/**
 *
 * @author Jackeline
 */
@ManagedBean
@ViewScoped
public class cProblema {
        private ArrayList<problema> lstProblema;
    private problema objProblemanew;
    private problema objProblemasel;

    @PostConstruct
    public void cUsuario() {
        try {
            cargarProblema();
        } catch (Exception ex) {
            Logger.getLogger(problema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarProblema() {
        try {
            lstProblema = mProblema.listarProblema();
            objProblemanew = new problema();
            objProblemasel = new problema();
        } catch (Exception ex) {
            Logger.getLogger(cProblema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarProblema() {
        try {
            if (mProblema.insertarProblema(objProblemanew)) {
                rcUtil.mensajeExito("wdlgNuevoProblema.hide()");
                cargarProblema();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarProblema() {
        try {
            if (mProblema.modificarProblema(objProblemasel)) {
                rcUtil.mensajeExito("wdlgModificarProblema.hide()");
                cargarProblema();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarProblema() {
        try {
            System.out.println("elimina");
            if (mProblema.eliminarProblema(objProblemasel.getId_problema())) {
                rcUtil.mensajeExito("wdlgEliminarProblema.hide()");
                cargarProblema();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<problema> getLstProblema() {
        return lstProblema;
    }

    public void setLstProblema(ArrayList<problema> lstProblema) {
        this.lstProblema = lstProblema;
    }

    public problema getObjProblemanew() {
        return objProblemanew;
    }

    public void setObjProblemanew(problema objProblemanew) {
        this.objProblemanew = objProblemanew;
    }

    public problema getObjProblemasel() {
        return objProblemasel;
    }

    public void setObjProblemasel(problema objProblemasel) {
        this.objProblemasel = objProblemasel;
    }

    
    
    
}
