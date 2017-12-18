/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.tipo_puesto;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author HP ENVY
 */
public class mtipopuesto {
    
    //metodo para llenar los datos de la consulta en un arraylist 
    public static ArrayList<tipo_puesto> listarTipoPuesto() throws Exception {
        ArrayList<tipo_puesto> lst = new ArrayList<>();
        try {
            String sql = "SELECT * from  tipo_puesto;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                tipo_puesto objt = new tipo_puesto(rs.getInt(0), rs.getString(1));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarTipoPuesto(tipo_puesto objt) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objt.getTipoDescripcion()));
            String sql = "select insertartipopuesto(?);";
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

    public static boolean modificarTipoPuesto(tipo_puesto objtipo) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objtipo.getIdtipopuesto()));
            lst.add(new Parametro(2, objtipo.getTipoDescripcion()));
            String sql = "select * from public.fn_update_tipo(?,?)";
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

    public static boolean eliminarTipoPuesto(int cdtipo) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdtipo));
            String sql = "select * from laboratorio.fn_delete_tipo(?)";
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
