/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author usuario
 */
public class clFacultad {
    private String faccodigo;
    private String facnombre;

    public clFacultad() {
    }

    public clFacultad(String faccodigo, String facnombre) {
        this.faccodigo = faccodigo;
        this.facnombre = facnombre;
    }

    public String getFaccodigo() {
        return faccodigo;
    }

    public void setFaccodigo(String faccodigo) {
        this.faccodigo = faccodigo;
    }

    public String getFacnombre() {
        return facnombre;
    }

    public void setFacnombre(String facnombre) {
        this.facnombre = facnombre;
    }
    
    
}
