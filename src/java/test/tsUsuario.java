/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidades.usuarios;
import modelo.mUsuario;

/**
 *
 * @author usuario
 */
public class tsUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        for (usuarios i : mUsuario.listarUsuario()) {
            System.out.println(i.getNombreusuario());
        }
    }

}
