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
public class clEscuela {
    private String esccodigo;
    private String faccodigo;
    private String escnombre;

    public clEscuela() {
    }

    public clEscuela(String esccodigo, String faccodigo, String escnombre) {
        this.esccodigo = esccodigo;
        this.faccodigo = faccodigo;
        this.escnombre = escnombre;
    }

    public String getEsccodigo() {
        return esccodigo;
    }

    public void setEsccodigo(String esccodigo) {
        this.esccodigo = esccodigo;
    }

    public String getFaccodigo() {
        return faccodigo;
    }

    public void setFaccodigo(String faccodigo) {
        this.faccodigo = faccodigo;
    }

    public String getEscnombre() {
        return escnombre;
    }

    public void setEscnombre(String escnombre) {
        this.escnombre = escnombre;
    }
    
}
