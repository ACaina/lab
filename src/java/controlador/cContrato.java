/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.contrato;
import modelo.mContrato;
import recurso.rcUtil;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author usuario
 */
@ManagedBean
@ViewScoped
public class cContrato {

    private ArrayList<contrato> lstContrato;
    private contrato objContratonew;
    private contrato objContratosel;

    @PostConstruct
    public void cContrato() {
        try {
            cargarContrato();
        } catch (Exception ex) {
            Logger.getLogger(contrato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarContrato() {
        try {
            lstContrato = mContrato.listarContrato();
            objContratonew = new contrato();
            objContratosel = new contrato();
        } catch (Exception ex) {
            Logger.getLogger(cContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarContrato() {
        try {
            if (mContrato.insertarContrato(objContratonew)) {
                rcUtil.mensajeExito("wdlgNuevoContrato.hide()");
                cargarContrato();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarContrato() {
        try {
            if (mContrato.modificarContrato(objContratosel)) {
                rcUtil.mensajeExito("wdlgModificarContrato.hide()");
                cargarContrato();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarContrato() {
        try {
            if (mContrato.eliminarContrato(objContratosel.getIdcontrato())) {
                rcUtil.mensajeExito("wdlgEliminarContrato.hide()");
                cargarContrato();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }
}
