/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class AccesoDatos {

    //funcion que ejecute con parametros y retorna valor
    private static boolean ejecutarFuncion(String query, ArrayList<Parametro> parametros) throws Exception {
        boolean respuesta = false;
        Connection con = null;
        PreparedStatement prts = null; //Permite ejecutar sentencia sql insert, update y delete, recibiendo parametros
        //Throws extiende los mensajes de error a las clases superiores
        try {
            Class.forName(Conexion.DRIVER);//Sirve para registrar y buscar el driver de la conexion de la base de datos
            try {
                con = DriverManager.getConnection(Conexion.URL, Conexion.USUARIO, Conexion.PASS);//Obtiene la conexion
                prts = con.prepareStatement(query);
                for (Parametro parm : parametros) {
                    prts.setObject(parm.getPosicion(), parm.getValor());
                }
                int i = prts.executeUpdate();//Execute Update retorna 1 si se realizo correctamente la sentencia, sino devuelve 2
                if (i >= 1) {
                    respuesta = true;
                }
                prts.close();//Cierra los enlaces en trabajo del objeto
                prts = null;//Para liberar un objeto se asigna el valor null
            } catch (SQLException eSql) {
                throw eSql;
            } finally {
                try {
                    if(con !=null)
                    {
                        if(!(con.isClosed()))
                            con.close();
                        con = null;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return respuesta;
    }
    
    public static ConjuntoResultado ejecutaQuery(String query) throws Exception {

        ConjuntoResultado conj = new ConjuntoResultado();
        //El ResultSet contiene dentro los registros leidos de la base de datos
        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection con = null;

        try {

            //registro el driver
            Class.forName(Conexion.DRIVER);

            try {

                con = DriverManager.getConnection(Conexion.URL, Conexion.USUARIO, Conexion.PASS);
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();

                conj.Fill(rs);
                rs.close();
                pst.close();
                rs = null;
                pst = null;

            } catch (SQLDataException exSQL) {
                throw exSQL;
            } finally {
                try {

                    if (con != null) {
                        //verifico si la conexion no nesta cerrada
                        if (!(con.isClosed())) {
                            con.close();
                        }
                        con = null;
                    }
                } catch (Exception ex) {
                    throw ex;
                }
            }

        } catch (ClassNotFoundException e) {
            throw e;
        }

        return conj;

    }
    
    // ejecuta funcion con parametros y retorna datos
    
     public static ConjuntoResultado ejecutaQuery(String query, ArrayList<Parametro> parametros) throws Exception {

        ConjuntoResultado conj = new ConjuntoResultado();
        //El ResultSet contiene dentro los registros leidos de la base de datos
        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection con = null;

        try {
           
            //registro el driver
            Class.forName(Conexion.DRIVER);

            //registro el driver
            try {
                //a clase DriverManager lleva seguimiento de los controladores disponibles y
                //maneja solicitudes de conexión entre controladores adecuados y bases de datos
                //o servidores de bases de datos. 
                //El parámetro url del método getConnection() es un URL de base de datos que especifica 
                //el subprotocolo (el mecanismo de conectividad de bases de datos), el identificador 
                //de la base de datos o del servidor de bases de datos y una lista de propiedades.

                 con = DriverManager.getConnection(Conexion.URL, Conexion.USUARIO, Conexion.PASS);

                pst = con.prepareStatement(query);
                for (Parametro param : parametros) {
                    pst.setObject(param.getPosicion(), param.getValor());
                }

                rs = pst.executeQuery();
                conj.Fill(rs);
                rs.close();
                pst.close();
                rs = null;
                pst = null;

            } catch (SQLDataException exSQL) {
                throw exSQL;
            } finally {
                try {

                    if (con != null) {
                        //verifico si la conexion no nesta cerrada
                        if (!(con.isClosed())) {
                            con.close();
                        }
                        con = null;
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }

        } catch (ClassNotFoundException e) {
            throw e;
        }

        return conj;

    }
}
