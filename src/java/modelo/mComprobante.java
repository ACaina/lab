/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.comprobante;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP ENVY
 */
public class mComprobante {
    
    //metodo para llenar los datos de la consulta en un arraylist 
    public static ArrayList<comprobante> listarComprobante() throws Exception {
        ArrayList<comprobante> lst = new ArrayList<>();
        try {
            String sql = "SELECT * from  comprobante;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                comprobante objt = new comprobante(rs.getInt(0), rs.getDouble(1),rs.getDouble(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getInt(11));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarComprobante(comprobante obj) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, obj.getValorcancelar()));
            lst.add(new Parametro(2, obj.getIva()));
            lst.add(new Parametro(3, obj.getNumeropuesto()));
            lst.add(new Parametro(4, obj.getNombresusuario()));
            lst.add(new Parametro(5, obj.getApellidosusuario()));
            lst.add(new Parametro(6, obj.getFechaemision()));
            lst.add(new Parametro(7, obj.getMespago()));
            lst.add(new Parametro(8, obj.getAñopago()));
            lst.add(new Parametro(9, obj.getNombreseccion()));
            lst.add(new Parametro(10, obj.getTipopuesto()));
            lst.add(new Parametro(11, obj.getIdcontrato()));
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

    public static boolean modificarComprobante(comprobante objcom) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objcom.getIdcomprobante()));
            lst.add(new Parametro(2, objcom.getValorcancelar()));
            lst.add(new Parametro(3, objcom.getIva()));
            lst.add(new Parametro(4, objcom.getNumeropuesto()));
            lst.add(new Parametro(5, objcom.getNombresusuario()));
            lst.add(new Parametro(6, objcom.getApellidosusuario()));
            lst.add(new Parametro(7, objcom.getFechaemision()));
            lst.add(new Parametro(8, objcom.getMespago()));
            lst.add(new Parametro(9, objcom.getAñopago()));
            lst.add(new Parametro(10, objcom.getNombreseccion()));
            lst.add(new Parametro(11, objcom.getTipopuesto()));
            lst.add(new Parametro(12, objcom.getIdcontrato()));
            String sql = "select * from ejemplo.fn_update_tipo(?,?)";
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

    public static boolean eliminarComprobante(int cdcomprobante) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdcomprobante));
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
