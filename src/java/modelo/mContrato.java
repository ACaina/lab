/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.contrato;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class mContrato {
      public static ArrayList<contrato> listarContrato() throws Exception {
        ArrayList<contrato> lst = new ArrayList<>();
        try {
            String sql = "SELECT * from  contrato;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                contrato objc = new contrato(rs.getInt(0),rs.getString(1), rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
                lst.add(objc);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarContrato(contrato objc) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objc.getFechainicio()));
            lst.add(new Parametro(2, objc.getFechafin()));
            lst.add(new Parametro(3, objc.getIdcomerciante()));
            lst.add(new Parametro(4, objc.getIdpuesto()));
            lst.add(new Parametro(5, objc.getIdactividad()));
            String sql = "select * from laboratorio.fn_insert_carrera(?,?,?)";
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
    
     public static boolean modificarContrato(contrato obju) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, obju.getFechainicio()));
            lst.add(new Parametro(2, obju.getFechafin()));
            lst.add(new Parametro(3, obju.getIdcomerciante()));
            lst.add(new Parametro(4, obju.getIdpuesto()));
            lst.add(new Parametro(5, obju.getIdactividad()));
            String sql = "select * from ejemplo.fn_update_usuario(?,?,?)";
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

    public static boolean eliminarContrato(int cdcontrato) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdcontrato));
            String sql = "select * from laboratorio.fn_delete_usuario(?)";
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
