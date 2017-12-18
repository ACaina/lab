/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.actividad;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP ENVY
 */
public class mActividad {
    public static ArrayList<actividad> listarActividad() throws Exception {
        ArrayList<actividad> lst = new ArrayList<>();
        try {
            String sql = "SELECT * from  actividad;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                actividad objt = new actividad(rs.getInt(0), rs.getString(1), rs.getInt(2));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarActividad(actividad objt) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objt.getDescripcionactividad()));
            lst.add(new Parametro(2, objt.getIdsubactividad()));
            String sql = "select * from laboratorio.fn_insert_tipopagina(?,?)";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lst);
            while (rs.next()) {
                if (rs.getBoolean(0) == true) {
                    respuesta = true;
                }
            }
            rs = null;
        } catch (Exception e) {
            throw e;
        }
        return respuesta;
    }

    public static boolean modificarActividad(actividad objtipop) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objtipop.getIdactividad()));
            lst.add(new Parametro(2, objtipop.getDescripcionactividad()));
            lst.add(new Parametro(3, objtipop.getIdsubactividad()));
            String sql = "select * from laboratorio.fn_update_tipopagina(?,?,?)";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lst);
            while (rs.next()) {
                if (rs.getBoolean(0) == true) {
                    respuesta = true;
                }
            }
            rs = null;
        } catch (Exception e) {
            throw e;
        }
        return respuesta;
    }

    public static boolean eliminarActividad(int cdactividad) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdactividad));
            String sql = "select * from laboratorio.fn_delete_tipopagina(?)";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lst);
            while (rs.next()) {
                if (rs.getBoolean(0) == true) {
                    respuesta = true;
                }
            }
            rs = null;
        } catch (Exception e) {
            throw e;
        }
        return respuesta;
    }
}
