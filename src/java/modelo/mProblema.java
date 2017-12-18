/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.problema;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class mProblema {
    public static ArrayList<problema> listarProblema() throws Exception {
        ArrayList<problema> lst = new ArrayList<>();
        try {
            String sql = "select * from  arbol.problema;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                problema objt = new problema(rs.getInt(0), rs.getString(1), rs.getInt(2), rs.getInt(3));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarProblema(problema objt) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objt.getDescripcion()));
            lst.add(new Parametro(2, objt.getId_causa()));
            lst.add(new Parametro(3, objt.getId_involucrado()));
            String sql = "select * from arbol.fi_problema(?,?,?)";
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

    public static boolean modificarProblema(problema objtipop) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objtipop.getId_problema()));
            lst.add(new Parametro(2, objtipop.getDescripcion()));
            lst.add(new Parametro(3, objtipop.getId_causa()));
            lst.add(new Parametro(4, objtipop.getId_involucrado()));
            String sql = "select * from arbol.fa_problema(?,?,?,?)";
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

    public static boolean eliminarProblema(int cdproblema) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdproblema));
            String sql = "select * from arbol.fe_problema(?)";
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

