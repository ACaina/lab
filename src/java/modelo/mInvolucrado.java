/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.involucrado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @Erika 
 */
public class mInvolucrado {
    public static ArrayList<involucrado> listarInvolucrado() throws Exception {
        ArrayList<involucrado> lst = new ArrayList<>();
        try {
            String sql = "select * from  arbol.involucrado;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                involucrado objt = new involucrado(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarInvolucrado(involucrado objt) throws Exception {
        boolean respuesta = false;
        try {
             ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objt.getNombre_involucrado()));
            lst.add(new Parametro(2, objt.getQuehacer()));
            lst.add(new Parametro(3, objt.getInteres()));
            lst.add(new Parametro(4, objt.getFortalezas()));
            lst.add(new Parametro(5, objt.getLimitaciones()));
            lst.add(new Parametro(6, objt.getTipo()));
            
            String sql = "select * from arbol.fi_involucrado(?,?,?,?,?,?)";
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

    public static boolean modificarInvolucrado(involucrado objin) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objin.getId_involucrado()));
            lst.add(new Parametro(2, objin.getNombre_involucrado()));
            lst.add(new Parametro(3, objin.getQuehacer()));
            lst.add(new Parametro(4, objin.getInteres()));
            lst.add(new Parametro(5, objin.getFortalezas()));
            lst.add(new Parametro(6, objin.getLimitaciones()));
            lst.add(new Parametro(7, objin.getTipo()));
            
            String sql = "select * from arbol.fa_involucrado(?,?,?,?,?,?,?)";
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

    public static boolean eliminarInvolucrado(int cdinv) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdinv));
            String sql = "select * from arbol.fe_involuvrado(?)";
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

