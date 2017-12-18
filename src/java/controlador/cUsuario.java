/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import entidades.usuarios;
import modelo.mUsuario;
import recurso.rcUtil;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author usuario
 */
@ManagedBean
@RequestScoped
public class cUsuario {

    private ArrayList<usuarios> lstUsuario;
    private usuarios objUsuarionew;
    private usuarios objUsuariosel;

    @PostConstruct
    public void cUsuario() {
        try {
            cargarUsuario();
        } catch (Exception ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarUsuario() {
        try {
            lstUsuario = mUsuario.listarUsuario();
            objUsuarionew = new usuarios();
            objUsuariosel = new usuarios();
        } catch (Exception ex) {
            Logger.getLogger(cUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ingresarUsuario() {
        try {
            if (mUsuario.insertarUsuario(objUsuarionew)) {
                rcUtil.mensajeExito("wdlgNuevoUsuario.hide()");
                cargarUsuario();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void modificarUsuario() {
        try {
            if (mUsuario.modificarUsuario(objUsuariosel)) {
                rcUtil.mensajeExito("wdlgModificarUsuario.hide()");
                cargarUsuario();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public void eliminarUsuario() {
        try {
            System.out.println("Entra eliminar");
//            if (mUsuario.eliminarUsuario(objUsuariosel.getIdusuario())) {
            if (mUsuario.eliminarUsuario(objUsuariosel.getIdusuario())) {
                System.out.println("Entra eliminar true");    
                rcUtil.mensajeExito("wdlgEliminarUsuario.hide()");
                cargarUsuario();
            } else {
                rcUtil.mensajeFracaso();
            }
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }
    
        public void logearUsuario() {
        try {
        if (mUsuario.logeoUsuario(objUsuariosel.getNombreusuario(),objUsuariosel.getContraseña())) {
                System.out.println("Entra usuario");    
            } else {
                System.out.println("NO entra usuario");
            }   
        } catch (Exception ex) {
            rcUtil.mensajeExcepcion(ex);
        }
    }

    public ArrayList<usuarios> getLstUsuario() {
        return lstUsuario;
    }

    public void setLstUsuario(ArrayList<usuarios> lstUsuario) {
        this.lstUsuario = lstUsuario;
    }

    public usuarios getObjUsuarionew() {
        return objUsuarionew;
    }

    public void setObjUsuarionew(usuarios objUsuarionew) {
        this.objUsuarionew = objUsuarionew;
    }

    public usuarios getObjUsuariosel() {
        return objUsuariosel;
    }

    public void setObjUsuariosel(usuarios objUsuariosel) {
        this.objUsuariosel = objUsuariosel;
    }

}
