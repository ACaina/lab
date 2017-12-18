
package modelo;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import entidades.usuarios;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class mUsuario {

    //metodo para llenar los datos de la consulta en un arraylist 
    public static ArrayList<usuarios> listarUsuario() throws Exception {
        ArrayList<usuarios> lst = new ArrayList<>();
        try {
            String sql = "SELECT * from arbol.usuario;";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            while (rs.next()) {
                usuarios objt = new usuarios(rs.getInt(0), rs.getString(1), rs.getString(2));
                lst.add(objt);
            }
            rs = null; //liberar espacio de memoria
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    public static boolean insertarUsuario(usuarios obju) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, obju.getNombreusuario()));
            lst.add(new Parametro(2, obju.getContraseña()));
            String sql = "select * from arbol.fi_usuario(?,?)";
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

    public static boolean modificarUsuario(usuarios obju) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, obju.getIdusuario()));
            lst.add(new Parametro(2, obju.getNombreusuario()));
            lst.add(new Parametro(3, obju.getContraseña()));
            String sql = "select * from arbol.fa_usuario(?,?,?)";
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
    public static boolean eliminarUsuario(int objusu) throws Exception {
        boolean respuesta = false;
        
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, objusu));
//            lst.add(new Parametro(1, cdusuario));
            String sql = "select * from arbol.fe_usuario(?)";
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
    
        public static boolean logeoUsuario(String user, String password ) throws Exception {
        boolean respuesta = false;
        
        try {
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, user));
            lst.add(new Parametro(2, password));          
            String sql = "select * from arbol.fm_usuario(?,?)";
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
