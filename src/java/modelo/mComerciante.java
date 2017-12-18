/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.comerciante;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP ENVY
 */
public class mComerciante {
    public static ArrayList<comerciante> listarComerciante() throws Exception {
        ArrayList<comerciante> lst = new ArrayList<>();
        try {
            String sql = "SELECT * from comerciante;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                comerciante objt = new comerciante(rs.getInt(0), rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarComerciante(comerciante objt) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objt.getIdentificador()));
            lst.add(new Parametro(2, objt.getTipoidentificador()));
            lst.add(new Parametro(3, objt.getNombrecomerciante()));
            lst.add(new Parametro(4, objt.getApellidocomerciante()));
            lst.add(new Parametro(5, objt.getDireccioncomerciante()));
            lst.add(new Parametro(6, objt.getCorreocomerciante()));
            lst.add(new Parametro(7, objt.getConadis()));
            lst.add(new Parametro(8, objt.getTelefono()));
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

    public static boolean modificarComerciante(comerciante objcomerciante) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();       
            lst.add(new Parametro(1, objcomerciante.getIdentificador()));
            lst.add(new Parametro(2, objcomerciante.getTipoidentificador()));
            lst.add(new Parametro(3, objcomerciante.getNombrecomerciante()));
            lst.add(new Parametro(4, objcomerciante.getApellidocomerciante()));
            lst.add(new Parametro(5, objcomerciante.getDireccioncomerciante()));
            lst.add(new Parametro(6, objcomerciante.getCorreocomerciante()));
            lst.add(new Parametro(7, objcomerciante.getConadis()));
            lst.add(new Parametro(8, objcomerciante.getTelefono()));
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

    public static boolean eliminarComerciante(int cdcomerciante) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cdcomerciante));
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
