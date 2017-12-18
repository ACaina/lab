/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.Causa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author caina
 */
public class mCausa {
    

    //metodo para llenar los datos de la consulta en un arraylist 
    public static ArrayList<Causa> listarCausa() throws Exception {
        ArrayList<Causa> lst = new ArrayList<>();
        try {
            String sql = "select * from arbol.causa;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                Causa objt = new Causa(rs.getInt(0), rs.getString(1), rs.getString(2),rs.getInt(3));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarCausa(Causa objc) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objc.getNombre_causa()));
            lst.add(new Parametro(2, objc.getTitulo()));
            lst.add(new Parametro(3, objc.getId_causa_rec()));
            String sql = "select * from arbol.fi_causa(?,?,?)";
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

    public static boolean modificarCausa(Causa objc) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objc.getId_causa()));
            lst.add(new Parametro(2, objc.getNombre_causa()));
            lst.add(new Parametro(3, objc.getTitulo()));
            lst.add(new Parametro(4, objc.getId_causa_rec()));
            String sql = "select * from arbol.fa_causa(?,?,?,?)";
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

//    public static boolean eliminarUsuario(int cdusuario) throws Exception {
    public static boolean eliminarCausa(int objca) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
//            lst.add(new Parametro(1, objca.getId_causa()));
            lst.add(new Parametro(1, objca));
            String sql = "select * from arbol.fe_causa(?)";
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
